package revendedora;

public class Carro extends Produto{
    private Integer qtdPortas;
    private String modelo;
    private Double qtdCombustivel;
    private Double capacidadeCombustivel;

    public Carro(Integer qtdPortas, String modelo, Double qtdCombustivel, Double capacidadeCombustivel) {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.qtdCombustivel = qtdCombustivel;
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public Carro() {
        this.qtdPortas = null;
        this.modelo = "";
        this.qtdCombustivel = null;
        this.capacidadeCombustivel = null;
    }

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(Double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public Double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(Double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }
    
    public void abastecerCombustivel(){
        if (qtdCombustivel < capacidadeCombustivel){
            System.out.println("O carro possuía " + qtdCombustivel 
                    + "L, foram abastecidos " 
                    + (capacidadeCombustivel-getQtdCombustivel()) + "L!");
            setQtdCombustivel(capacidadeCombustivel);
        } else {
            System.out.println("O carro já está abastecido!");
        }
    }
    
    public void gastarCombustivel(double valor){
        if (valor < qtdCombustivel){
            setQtdCombustivel(getQtdCombustivel()-valor);
            System.out.println("Ao dar uma voltinha pela cidade você gastou " + valor+ "L e agora o carro possui "+ getQtdCombustivel() + "L de combustível!");
        } else {
            System.out.println("Você não possui combustível o suficiente, é melhor passar num posto!");
        }
    }
}
