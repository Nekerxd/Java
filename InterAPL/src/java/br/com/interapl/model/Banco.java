
package br.com.interapl.model;

public class Banco {
    
    private int idBanco;
    private String nomeBanco;
    
    public Banco() {
        this.idBanco = 0;
        this.nomeBanco = "";
    }

    public Banco(int idBanco, String nomeBanco) {
        this.idBanco = idBanco;
        this.nomeBanco = nomeBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    
    
}
