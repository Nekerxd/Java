package br.com.interapl.dao;

import br.com.interapl.model.Meta;
import br.com.interapl.model.Usuario;
import br.com.interapl.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetaDAO implements GenericDAO{

    private Connection conexao;
    
    public MetaDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }
    
    @Override
    public Boolean cadastrar(Object objeto) {
        Meta oMeta = (Meta) objeto;
        Boolean retorno = false;
        if (oMeta.getIdMeta()==0) {
            retorno = this.inserir(oMeta);
        } else {
            retorno = this.alterar(oMeta);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Meta oMeta = (Meta) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into meta(descmeta, tipometa, prazometa, valormeta, idusuario) values (?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oMeta.getDescMeta());
            stmt.setString(2, oMeta.getTipoMeta());
            stmt.setString(3, oMeta.getPrazoMeta());
            stmt.setDouble(4, oMeta.getValorMeta());
            stmt.setInt(5, oMeta.getUsuario().getIdUsuario());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try{
                System.out.println("Problemas ao cadastrar a Meta! Erro: " + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean alterar(Object objeto) {
        Meta oMeta = (Meta) objeto;
        PreparedStatement stmt = null;
        String sql = "update meta set descmeta=?, tipometa=?, prazometa=TO_DATE(?, 'YYYY-MM-DD'), valormeta=?, idusuario=? where idMeta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oMeta.getDescMeta());
            stmt.setString(2, oMeta.getTipoMeta());
            stmt.setString(3, oMeta.getPrazoMeta());
            stmt.setDouble(4, oMeta.getValorMeta());
            stmt.setInt(5, oMeta.getUsuario().getIdUsuario());
            stmt.setInt(6, oMeta.getIdMeta());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao alterar a Meta! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean excluir(int numero) {
        int idMeta = numero;
        PreparedStatement stmt = null;
        
        String sql = "delete from meta where idmeta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idMeta);
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir a Meta! Erro: " + ex.getMessage());
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
        int idMeta = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Meta oMeta = null;
        String sql = "select * from meta where idmeta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idMeta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                oMeta = new Meta();
                oMeta.setIdMeta(rs.getInt("idMeta"));
                oMeta.setDescMeta(rs.getString("descmeta"));
                oMeta.setTipoMeta(rs.getString("tipometa"));
                oMeta.setPrazoMeta(rs.getString("prazometa"));
                oMeta.setValorMeta(rs.getDouble("valormeta"));
                
                UsuarioDAO oUsuarioDAO = new UsuarioDAO();
                oMeta.setUsuario((Usuario) oUsuarioDAO.carregar(rs.getInt("idusuario")));
            }
            return oMeta;
        } catch (Exception ex) {
            System.out.println("Problemas ao carregar a Meta! Erro: "+ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from meta order by descmeta";
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                Meta oMeta = new Meta();
                oMeta.setIdMeta(rs.getInt("idMeta"));
                oMeta.setDescMeta(rs.getString("descmeta"));
                oMeta.setTipoMeta(rs.getString("tipometa"));
                oMeta.setPrazoMeta(rs.getString("prazometa"));
                oMeta.setValorMeta(rs.getDouble("valormeta"));
                
                
                UsuarioDAO oUsuarioDAO = null;
                try {
                    oUsuarioDAO = new UsuarioDAO();
                } catch (Exception ex) {
                    System.out.println("Erro buscar meta "+ex.getMessage());
                    ex.printStackTrace();
                }
                oMeta.setUsuario((Usuario) oUsuarioDAO.carregar(rs.getInt("idusuario")));
                resultado.add(oMeta);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Meta! Erro: "+ex.getMessage());
        }
        return resultado;
    }
    
}
