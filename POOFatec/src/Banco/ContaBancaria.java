package Banco;

import java.util.Scanner;

public class ContaBancaria {
    
    private Integer idConta;
    private Integer numConta;
    private String titularConta;
    private Double saldoConta;
    private String tipoConta;
    
    public ContaBancaria(){

    }
    
    public ContaBancaria(Integer idConta, Integer numConta, String titularConta) {
        this.idConta = idConta;
        this.numConta = numConta;
        this.titularConta = titularConta;
    }
    
    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public void abrirConta(String tipoConta){
        if (tipoConta.toUpperCase().charAt(0) == 'C'){
            setTipoConta("Corrente");
            setSaldoConta(50.0);
        }
        else if (tipoConta.toUpperCase().charAt(0) == 'P'){
            setTipoConta("Poupança");
            setSaldoConta(100.0);
        }
        else {
            System.out.println("Tipo de conta inválido!");
        }
    }
    
    public void fecharConta(){
        if (getSaldoConta() == 0){
            System.out.println("Conta Encerrada!");
        }
        else if (getSaldoConta() < 0){
            System.out.println("É necessário realizar um depósito para quitar as dívidas antes do encerramento!");
        }
        else {
            System.out.println("É preciso sacar o saldo disponível antes do encerramento!");
        }
    }

    public void sacar(Double valor){
        if (getSaldoConta() >= valor){
            setSaldoConta(getSaldoConta() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else 
            System.out.println("Não há saldo disponível!");
    }

    public void depositar(Double valor){
        setSaldoConta(getSaldoConta() + valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    public void mostrarSaldo(){
        System.out.println(getSaldoConta());
    }
}
