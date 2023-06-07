package br.com.interapl.dao;

import br.com.interapl.model.Banco;
import br.com.interapl.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BancoDAO implements GenericDAO{
    
    private Connection conexao;
    
    public BancoDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        Banco oBanco = (Banco) objeto;
        Boolean retorno = false;
        if (oBanco.getIdBanco() == 0) {
            retorno = this.inserir(oBanco);
        } else{
            retorno = this.alterar(oBanco);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Banco oBanco = (Banco) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into banco (nomeBanco) values (?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oBanco.getNomeBanco());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try{
                System.out.println("Problemas ao cadastrar o Banco! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e){
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean alterar(Object objeto) {
        Banco oBanco = (Banco) objeto;
        PreparedStatement stmt = null;
        String sql = "update banco set nomebanco=? where idBanco=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oBanco.getNomeBanco());
            stmt.setInt(2, oBanco.getIdBanco());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao alterar a Banco! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean excluir(int numero) {
        int IdBanco = numero;
        PreparedStatement stmt = null;
        
        String sql = "delete from banco where idBanco=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, IdBanco);
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir a Banco! Erro: "
                +ex.getMessage());
            try {
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Object carregar(int numero) {
        int IdBanco = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Banco oBanco = null;
        String sql = "select * from banco where idBanco=?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, IdBanco);
            rs = stmt.executeQuery();
            while (rs.next()){
                oBanco = new Banco();
                oBanco.setIdBanco(rs.getInt("idBanco"));
                oBanco.setNomeBanco(rs.getString("nomebanco"));
            }
            return oBanco;
        } catch (Exception ex) {
            System.out.println("Problemas ao carregar Banco! Erro: "+ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Select * from banco order by idBanco";
        try {
            stmt = conexao.prepareStatement(sql);
            rs=stmt.executeQuery();
            while (rs.next()) {
                Banco oBanco = new Banco();
                oBanco.setIdBanco(rs.getInt("idBanco"));
                oBanco.setNomeBanco(rs.getString("nomebanco"));
                resultado.add(oBanco);
            }
            
        }catch (SQLException ex) {
            System.out.println("Problemas ao listar Bancos! Erro: "
                +ex.getMessage());
        }
        return resultado;
    }
    
}
