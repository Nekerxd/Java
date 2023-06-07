package dao;

import java.sql.Statement;
import model.Medico;
import util.Conexao;

public class MedicoDAO implements GenericDAO {
    
    @Override
    public Boolean cadastrar(Object objeto) {
        
        Medico medico = (Medico) objeto;
        
        try {
            Conexao.ConectBD();
            Statement stmt = Conexao.con.createStatement();
            String sql = "insert into medico(nome, endereco, especialidade, crm) values ('" 
                    + medico.getNomemedico() + "', '" 
                    + medico.getEnderecomedico() + "', '" 
                    + medico.getEspecialidademedico() + "', '" 
                    + medico.getCrmmedico() + "');";

            stmt.execute(sql);
            Conexao.CloseBD();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
        
}
   