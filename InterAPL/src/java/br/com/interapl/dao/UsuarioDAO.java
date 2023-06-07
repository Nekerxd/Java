
package br.com.interapl.dao;

import br.com.interapl.model.Usuario;
import br.com.interapl.utils.ShaUtils;
import br.com.interapl.utils.SingleConnection;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements GenericDAO{
    
    private Connection conexao;
    public UsuarioDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }
    
    @Override
    public Boolean cadastrar(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        Boolean retorno = false;
        if (oUsuario.getIdUsuario() == 0)
            retorno = this.inserir(oUsuario);
        else
            retorno = this.alterar(oUsuario);
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into usuario(loginusuario, nomeusuario, emailusuario, senhausuario) values (?,?,?,?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oUsuario.getLoginUsuario());
            stmt.setString(2, oUsuario.getNomeUsuario());
            stmt.setString(3, oUsuario.getEmailUsuario());
            
            try {
                String encPasswd = ShaUtils.toHexString(ShaUtils.getSHA(oUsuario.getSenhaUsuario()));
                stmt.setString(4, encPasswd);
            } catch (NoSuchAlgorithmException e) {
                System.out.println("Exception thrown for incorrect algorithm: " + e);
            }
            
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao cadastrar o Usuario! Erro: " + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean alterar(Object objeto) {
        Usuario oUsuario = (Usuario) objeto;
        PreparedStatement stmt = null;
        String sql = "update usuario set loginusuario=?, nomeusuario=?, emailusuario=?, senhausuario=? where idusuario=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oUsuario.getLoginUsuario());
            stmt.setString(2, oUsuario.getNomeUsuario());
            stmt.setString(3, oUsuario.getEmailUsuario());
            
            try {
                String encPasswd = ShaUtils.toHexString(ShaUtils.getSHA(oUsuario.getSenhaUsuario()));
                stmt.setString(4, encPasswd);
            } catch (NoSuchAlgorithmException e) {
                System.out.println("Exception thrown for incorrect algorithm: " + e);
            }
            
            stmt.setInt(5, oUsuario.getIdUsuario());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao alterar o Usuário! Erro: " + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean excluir(int numero) {
        int idUsuario = numero;
        PreparedStatement stmt = null;
        String sql = "delete from usuario where idUsuario=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idUsuario);
            stmt.execute();
            conexao.commit();
            return true;
        }catch (Exception ex) {
            System.out.println("Problemas ao excluir o Usuário! Erro: " + ex.getMessage());
            try {
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback " + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Object carregar(int numero) {
        int idUsuario = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario oUsuario = null;
        String sql = "select * from usuario where idUsuario=?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idUsuario);
            rs = stmt.executeQuery();
            while (rs.next()) {
                oUsuario = new Usuario();
                oUsuario.setIdUsuario(rs.getInt("idUsuario"));
                oUsuario.setLoginUsuario(rs.getString("loginusuario"));
                oUsuario.setNomeUsuario(rs.getString("nomeusuario"));
                oUsuario.setEmailUsuario(rs.getString("emailusuario"));
            }
            return oUsuario;
        } catch (Exception ex) {
            System.out.println("Problemas ao carregar o Usuário! Erro: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from usuario order by idUsuario";
        try {
            stmt = conexao.prepareStatement(sql);
            rs=stmt.executeQuery();
            while (rs.next()) {
                Usuario oUsuario = new Usuario();
                oUsuario.setIdUsuario(rs.getInt("idUsuario"));
                oUsuario.setLoginUsuario(rs.getString("loginUsuario"));
                oUsuario.setNomeUsuario(rs.getString("nomeUsuario"));
                oUsuario.setEmailUsuario(rs.getString("emailUsuario"));
                resultado.add(oUsuario);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Usuário! Erro: " + ex.getMessage());
        }
        return resultado;
    }
    
}
