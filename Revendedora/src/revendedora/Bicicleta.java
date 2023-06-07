package revendedora;

public class Bicicleta extends Produto{
    private Integer qtdMarchas;
    private Integer aro;
    private Integer marchaAtual;

    public Bicicleta() {
        this.qtdMarchas = null;
        this.marchaAtual = 1;
        this.aro = null;
    }
    
    public Bicicleta(Integer qtdMarchas, Integer aro) {
        this.qtdMarchas = qtdMarchas;
        this.marchaAtual = marchaAtual;
        this.aro = aro;
    }
    
    public Integer getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(Integer qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public Integer getAro() {
        return aro;
    }

    public void setAro(Integer aro) {
        this.aro = aro;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
    
    public void subirMarcha(){
        if (marchaAtual <= qtdMarchas){
            setMarchaAtual(getMarchaAtual()+1);
            System.out.println("Você trocou para a " + getMarchaAtual() + " marcha!");
        }
    }
    
    public void descerMarcha(){
        if (marchaAtual > 0){
            setMarchaAtual(getMarchaAtual()-1);
            System.out.println("Você trocou para a " + getMarchaAtual() + " marcha!");
        }
    }
}
