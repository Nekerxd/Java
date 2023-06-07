package model;

public class Medico {
    
    private Integer idmedico;
    private String nomemedico;
    private String enderecomedico;
    private String especialidademedico;
    private String crmmedico;

    public Medico() {
    }

    public Medico(Integer idmedico, String nomemedico, String enderecomedico, String especialidademedico, String crmmedico) {
        this.idmedico = idmedico;
        this.nomemedico = nomemedico;
        this.enderecomedico = enderecomedico;
        this.especialidademedico = especialidademedico;
        this.crmmedico = crmmedico;
    }

    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public String getNomemedico() {
        return nomemedico;
    }

    public void setNomemedico(String nomemedico) {
        this.nomemedico = nomemedico;
    }

    public String getEnderecomedico() {
        return enderecomedico;
    }

    public void setEnderecomedico(String enderecomedico) {
        this.enderecomedico = enderecomedico;
    }

    public String getEspecialidademedico() {
        return especialidademedico;
    }

    public void setEspecialidademedico(String especialidademedico) {
        this.especialidademedico = especialidademedico;
    }

    public String getCrmmedico() {
        return crmmedico;
    }

    public void setCrmmedico(String crmmedico) {
        this.crmmedico = crmmedico;
    }
    
}
