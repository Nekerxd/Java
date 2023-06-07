/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interapl.controller.meta;

import br.com.interapl.dao.GenericDAO;
import br.com.interapl.dao.MetaDAO;
import br.com.interapl.model.Meta;
import br.com.interapl.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nuvie
 */
@WebServlet(name = "MetaCadastrar", urlPatterns = {"/MetaCadastrar"})
public class MetaCadastrar extends HttpServlet {

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
        int idMeta  = Integer.parseInt(request.getParameter("idmeta"));
        int idUsuario = Integer.parseInt(request.getParameter("idusuario"));
        String descMeta = request.getParameter("descmeta");
        String tipoMeta = request.getParameter("tipometa");
        String prazoMeta = request.getParameter("prazometa");
        Double valorMeta = Double.parseDouble(request.getParameter("valormeta"));
        
        String mensagem = null;
        
        try {
            Meta oMeta = new Meta();
            oMeta.setIdMeta(idMeta);
            oMeta.setDescMeta(descMeta);
            oMeta.setTipoMeta(tipoMeta);
            oMeta.setPrazoMeta(prazoMeta);
            oMeta.setValorMeta(valorMeta);
            oMeta.setUsuario(new Usuario(idUsuario,"","","",""));
            
            GenericDAO dao = new MetaDAO();
            if (dao.cadastrar(oMeta)){
                mensagem = "Meta cadastrada com sucesso!";
            } else {
                mensagem = "Problemas ao cadastrar Meta. Verifique os dados informados e tente novamente!";
            }
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("MetaListar");
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Cidade! Erro: "+ex.getMessage());
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
