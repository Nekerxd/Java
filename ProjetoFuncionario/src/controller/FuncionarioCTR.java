package controller;

import dao.FuncionarioDAO;
import dao.GenericDAO;
import model.Funcionario;

public class FuncionarioCTR {
    
    public boolean cadastrarFuncionario(Integer rmFuncionario,
            String nomeFuncionario, String enderecoFuncionario, String telefoneFuncionario){
        
        Funcionario funcionario = new Funcionario();
        funcionario.setRmfuncionario(rmFuncionario);
        funcionario.setNomefuncionario(nomeFuncionario);
        funcionario.setEnderecofuncionario(enderecoFuncionario);
        funcionario.setTelefonefuncionario(telefoneFuncionario);
        
        GenericDAO dao = new FuncionarioDAO();
        
        if (dao.cadastrar(funcionario)) {
            return true;
        } else {
            return false;
        }
    }
}
