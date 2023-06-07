package br.com.interapl.dao;

import br.com.interapl.model.Banco;
import br.com.interapl.model.Conta;
import br.com.interapl.model.Usuario;
import br.com.interapl.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO implements GenericDAO {
    
    private Connection conexao;
    
    public ContaDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        Conta oConta = (Conta) objeto;        
        Boolean retorno = false;
        if (oConta.getIdConta() == 0)
            retorno = this.inserir(oConta);
        else
            retorno = this.alterar(oConta);
        
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Conta oConta = (Conta) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into conta(descConta, tipoConta, saldoConta, limiteConta, idBanco, idUsuario) values (?,?,?,?,?,?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oConta.getDescConta());
            stmt.setString(2, oConta.getTipoConta());
            stmt.setDouble(3, oConta.getSaldoConta());
            stmt.setDouble(4, oConta.getLimiteConta());
            stmt.setInt(5, oConta.getBanco().getIdBanco());
            stmt.setInt(6, oConta.getUsuario().getIdUsuario());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex){
            try {
                System.out.println("Problemas ao cadastrar a Conta! Erro: "+ex.getMessage());
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
        Conta oConta = (Conta) objeto;
        PreparedStatement stmt = null;
        String sql = "update conta set descConta=?,tipoConta=?,saldoConta=?,limiteConta=?,idBanco=?,idUsuario=? where idConta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oConta.getDescConta());
            stmt.setString(2, oConta.getTipoConta());
            stmt.setDouble(3, oConta.getSaldoConta());
            stmt.setDouble(4, oConta.getLimiteConta());
            stmt.setInt(5, oConta.getBanco().getIdBanco());
            stmt.setInt(6, oConta.getUsuario().getIdUsuario());
            stmt.setInt(7, oConta.getIdConta());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex){
            try {
                System.out.println("Problemas ao alterar a Conta! Erro: "+ex.getMessage());
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
        int idConta = numero;
        PreparedStatement stmt = null;
        String sql = "delete from conta where idConta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idConta);
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex){
            System.out.println("Problemas ao excluir a Conta! Erro: "+ ex.getMessage());
            try{
                conexao.rollback();
            } catch (SQLException e){
                System.out.println("Erro rollback: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Object carregar(int numero) {
        int idConta = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Conta oConta = null;
        String sql = "select * from conta where idConta=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idConta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                oConta = new Conta();
                oConta.setIdConta(rs.getInt("idConta"));
                oConta.setDescConta(rs.getString("descConta"));
                oConta.setTipoConta(rs.getString("tipoConta"));
                oConta.setSaldoConta(rs.getDouble("saldoConta"));
                oConta.setLimiteConta(rs.getDouble("limiteConta"));
                
                BancoDAO oBancoDAO = new BancoDAO();
                oConta.setBanco((Banco) oBancoDAO.carregar(rs.getInt("idBanco")));
                
                UsuarioDAO oUsuarioDAO = new UsuarioDAO();
                oConta.setUsuario((Usuario) oUsuarioDAO.carregar(rs.getInt("idUsuario")));
            }
            return oConta;
        } catch (Exception ex){
            System.out.println("Problemas ao carregar Conta! Erro: "+ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from conta order by descConta";
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                Conta oConta = new Conta();
                oConta.setIdConta(rs.getInt("idConta"));
                oConta.setDescConta(rs.getString("descConta"));
                oConta.setTipoConta(rs.getString("tipoConta"));
                oConta.setSaldoConta(rs.getDouble("saldoConta"));
                oConta.setLimiteConta(rs.getDouble("limiteConta"));

                BancoDAO oBancoDAO = null;
                try {
                    oBancoDAO = new BancoDAO();
                } catch (Exception ex) {
                    System.out.println("Erro buscar banco "+ex.getMessage());
                    ex.printStackTrace();
                }
                oConta.setBanco((Banco) oBancoDAO.carregar(rs.getInt("idBanco")));
                
                UsuarioDAO oUsuarioDAO = null;
                try {
                    oUsuarioDAO = new UsuarioDAO();
                } catch (Exception ex) {
                    System.out.println("Erro buscar usuario "+ex.getMessage());
                    ex.printStackTrace();
                }
                oConta.setUsuario((Usuario) oUsuarioDAO.carregar(rs.getInt("idUsuario")));
                
                resultado.add(oConta);
            }
        } catch (SQLException ex){
            System.out.println("Problemas ao listar Conta! Erro: "+ex.getMessage());
        }
        return resultado;
    }        
}
