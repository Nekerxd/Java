package cadastro;

public class Cliente extends Pessoa{
    private String localTrabCliente;
    private Double salarioCliente;
    private Cidade cidade;

    public String getLocalTrabCliente() {
        return localTrabCliente;
    }

    public void setLocalTrabCliente(String localTrabCliente) {
        this.localTrabCliente = localTrabCliente;
    }

    public Double getSalarioCliente() {
        return salarioCliente;
    }

    public void setSalarioCliente(Double salarioCliente) {
        this.salarioCliente = salarioCliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void listarPessoa(){
        System.out.println("Trabalho: " + getLocalTrabCliente() + 
                "\nSalário: R$" + getSalarioCliente() + 
                "\nCidade: " + getCidade().getNomeCidade()+
                "\nEstado: " + getCidade().getEstadoCidade()+
                "\nNome: " + getNomePessoa() +
                "\nEndereço: " + getEndPessoa() +
                "\nCPF: " + getCpfPessoa() +
                "\nTelefone: " + getTelPessoa());
    }
}
