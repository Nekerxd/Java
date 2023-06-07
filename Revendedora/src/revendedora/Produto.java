package revendedora;

public class Produto {
    private String cor;
    private String marca;
    private Double valor;

    public Produto() {
    }

    public Produto(String cor, String marca, Double valor) {
        this.cor = cor;
        this.marca = marca;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void calibrarPneu(){
        System.out.println("Os pneus de seu veículo foram calibrados!");
    }
    
}
