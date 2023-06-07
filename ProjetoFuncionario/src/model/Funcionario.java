package model;

public class Funcionario {
    
    private Integer idfuncionario;
    private Integer rmfuncionario;
    private String nomefuncionario;
    private String enderecofuncionario;
    private String telefonefuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario, Integer rmfuncionario, String nomefuncionario, String enderecofuncionario, String telefonefuncionario) {
        this.idfuncionario = idfuncionario;
        this.rmfuncionario = rmfuncionario;
        this.nomefuncionario = nomefuncionario;
        this.enderecofuncionario = enderecofuncionario;
        this.telefonefuncionario = telefonefuncionario;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Integer getRmfuncionario() {
        return rmfuncionario;
    }

    public void setRmfuncionario(Integer rmfuncionario) {
        this.rmfuncionario = rmfuncionario;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getEnderecofuncionario() {
        return enderecofuncionario;
    }

    public void setEnderecofuncionario(String enderecofuncionario) {
        this.enderecofuncionario = enderecofuncionario;
    }

    public String getTelefonefuncionario() {
        return telefonefuncionario;
    }

    public void setTelefonefuncionario(String telefonefuncionario) {
        this.telefonefuncionario = telefonefuncionario;
    }
    
    
}
