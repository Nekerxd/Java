package br.com.interapl.model;

public class Conta {
    
    private int idConta;
    private String descConta;
    private String tipoConta;
    private Double saldoConta;
    private Double limiteConta;
    private Banco banco;
    private Usuario usuario;

    public Conta(Integer idConta, String descConta, String tipoConta, Double saldoConta, Double limiteConta, Banco banco, Usuario usuario) {
        this.idConta = idConta;
        this.descConta = descConta;
        this.tipoConta = tipoConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;
        this.banco = banco;
        this.usuario = usuario;
    }
    
    public Conta() {
        this.idConta = 0;
        this.descConta = "";
        this.tipoConta = "";
        this.saldoConta = null;
        this.limiteConta = null;
        this.banco = new Banco();
        this.usuario = new Usuario();
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getDescConta() {
        return descConta;
    }

    public void setDescConta(String descConta) {
        this.descConta = descConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(Double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
