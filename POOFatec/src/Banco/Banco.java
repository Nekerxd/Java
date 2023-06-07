package Banco;

public class Banco {
    
    public static void main(String[] args){
        ContaBancaria nubank = new ContaBancaria(1, 6587, "Matheus F");
        
        nubank.abrirConta("p");
        nubank.depositar(100.0);
        nubank.fecharConta();
        nubank.sacar(500.0);
        nubank.fecharConta();
        nubank.sacar(200.0);
        nubank.fecharConta();
    }
}
