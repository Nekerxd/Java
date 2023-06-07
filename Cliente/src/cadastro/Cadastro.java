package cadastro;

public class Cadastro {

    public static void main(String[] args) {

        Cidade cid = new Cidade();
        cid.setNomeCidade("Rondonópolis");
        cid.setEstadoCidade("MT");
    
        Cliente c1 = new Cliente();
        c1.setNomePessoa("Nelmo Bocafoli Fernandes");
        c1.setEndPessoa("Rua Benedito Calixto Silva");
        c1.setCpfPessoa("398.519.081-00");
        c1.setTelPessoa("(66) 97142-1773");
        c1.setLocalTrabCliente("LinkedIn");
        c1.setSalarioCliente(17652.0);
        c1.setCidade(cid);
        
        c1.listarPessoa();
        c1.alterarTelefone("(21) 99988-6357");        
    }
    
}
