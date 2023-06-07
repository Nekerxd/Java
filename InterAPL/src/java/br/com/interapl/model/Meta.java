package br.com.interapl.model;

public class Meta {
    
    private int idMeta;
    private Usuario usuario;
    private String descMeta;
    private String tipoMeta;
    private String prazoMeta;
    private Double valorMeta;

    public Meta() {
        this.idMeta = 0;
        this.usuario = new Usuario();
        this.descMeta = "";
        this.tipoMeta = "";
        this.prazoMeta = null;
        this.valorMeta = null;
    }

    public Meta(int idMeta, Usuario usuario, String descMeta, String tipoMeta, String prazoMeta, Double valorMeta) {
        this.idMeta = idMeta;
        this.usuario = usuario;
        this.descMeta = descMeta;
        this.tipoMeta = tipoMeta;
        this.prazoMeta = prazoMeta;
        this.valorMeta = valorMeta;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescMeta() {
        return descMeta;
    }

    public void setDescMeta(String descMeta) {
        this.descMeta = descMeta;
    }

    public String getTipoMeta() {
        return tipoMeta;
    }

    public void setTipoMeta(String tipoMeta) {
        this.tipoMeta = tipoMeta;
    }

    public String getPrazoMeta() {
        return prazoMeta;
    }

    public void setPrazoMeta(String prazoMeta) {
        this.prazoMeta = prazoMeta;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }
    
}
