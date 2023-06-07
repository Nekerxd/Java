package cadastro;

public class Pessoa {
    private String nomePessoa;
    private String endPessoa;
    private String cpfPessoa;
    private String telPessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEndPessoa() {
        return endPessoa;
    }

    public void setEndPessoa(String endPessoa) {
        this.endPessoa = endPessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getTelPessoa() {
        return telPessoa;
    }

    public void setTelPessoa(String telPessoa) {
        this.telPessoa = telPessoa;
    }
    
    public void alterarTelefone(String novoTelefone){
        setTelPessoa(novoTelefone);
        System.out.println("Telefone alterado! Novo número: "+ getTelPessoa());
    }
}
