package dao;

import java.sql.Statement;
import model.Funcionario;
import util.Conexao;

public class FuncionarioDAO implements GenericDAO{

    @Override
    public Boolean cadastrar(Object objeto) {
        
        Funcionario funcionario = (Funcionario) objeto;
        
        try {
            Conexao.ConectBD();
            Statement stmt = Conexao.con.createStatement();
            String sql = "insert into funcionario(rmfuncionario, nomefuncionario, enderecofuncionario, telefonefuncionario) values ('" 
                    + funcionario.getRmfuncionario() + "', '" 
                    + funcionario.getNomefuncionario() + "', '" 
                    + funcionario.getEnderecofuncionario() + "', '" 
                    + funcionario.getTelefonefuncionario() + "');";
            stmt.execute(sql);
            Conexao.CloseBD();
            return true;
            
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
