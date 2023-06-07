package br.com.interapl.controller.conta;

import br.com.interapl.dao.ContaDAO;
import br.com.interapl.dao.GenericDAO;
import br.com.interapl.model.Banco;
import br.com.interapl.model.Conta;
import br.com.interapl.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContaCadastrar", urlPatterns = {"/ContaCadastrar"})
public class ContaCadastrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        int idConta = Integer.parseInt(request.getParameter("idConta"));
        int idBanco = Integer.parseInt(request.getParameter("idBanco"));
        int idUsuario = Integer.parseInt(request.getParameter("idusuario"));
        String descConta = request.getParameter("descConta");
        String tipoConta = request.getParameter("tipoConta");
        Double saldoConta = Double.parseDouble(request.getParameter("saldoConta"));
        Double limiteConta = Double.parseDouble(request.getParameter("limiteConta"));
        String mensagem = null;
        
        try {
            Conta oConta = new Conta();
            oConta.setIdConta(idConta);
            oConta.setDescConta(descConta);
            oConta.setTipoConta(tipoConta);
            oConta.setSaldoConta(saldoConta);
            oConta.setLimiteConta(limiteConta);
            oConta.setBanco(new Banco(idBanco,""));
            oConta.setUsuario(new Usuario(idUsuario,"","","",""));
            
            GenericDAO dao = new ContaDAO();
            if (dao.cadastrar(oConta))
                mensagem = "Conta cadastrada com sucesso!";
            else
                mensagem = "Problemas ao cadastrar Conta. Verifique os dados informados e tente novamente!";
            
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("ContaListar");
        } catch (Exception ex){
            System.out.println("Problemas no Servlet ao cadastrar Conta! Erro: "+ex.getMessage());
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
