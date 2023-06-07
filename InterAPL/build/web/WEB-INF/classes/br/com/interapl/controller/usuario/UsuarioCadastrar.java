/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interapl.controller.usuario;

import br.com.interapl.dao.GenericDAO;
import br.com.interapl.dao.UsuarioDAO;
import br.com.interapl.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioCadastrar", urlPatterns = {"/UsuarioCadastrar"})
public class UsuarioCadastrar extends HttpServlet {

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
        int idUsuario = Integer.parseInt(request.getParameter("idusuario"));
        String loginUsuario = request.getParameter("loginusuario");
        String nomeUsuario = request.getParameter("nomeusuario");
        String emailUsuario = request.getParameter("emailusuario");
        String senhaUsuario = request.getParameter("senhausuario");
        String mensagem = null;
        
        Usuario oUsuario = new Usuario();
        oUsuario.setIdUsuario(idUsuario);
        oUsuario.setLoginUsuario(loginUsuario);
        oUsuario.setNomeUsuario(nomeUsuario);
        oUsuario.setEmailUsuario(emailUsuario);
        oUsuario.setSenhaUsuario(senhaUsuario);
        try {
            GenericDAO dao = new UsuarioDAO();
            if (dao.cadastrar(oUsuario))
                mensagem = "Usuario cadastrado com sucesso!";
            else
                mensagem = "Problemas ao cadastrar Usuario. Verifique os dados informados e tente novamente!";
            
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("UsuarioListar");
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Usuario! Erro: " + ex.getMessage());
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
