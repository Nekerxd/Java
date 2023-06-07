package controller;

import dao.GenericDAO;
import dao.MedicoDAO;
import model.Medico;

public class MedicoCTR {
    
    public boolean cadastrarMedico(String nomemedico, String enderecomedico, String especialidademedico, String crmmedico) {
        
        Medico medico = new Medico();
        medico.setNomemedico(nomemedico);
        medico.setEnderecomedico(enderecomedico);
        medico.setEspecialidademedico(especialidademedico);
        medico.setCrmmedico(crmmedico);
        
        GenericDAO dao = new MedicoDAO();
        
        if (dao.cadastrar(medico)) {
            return true;
        } else {
            return false;
        }
    }
    
}
