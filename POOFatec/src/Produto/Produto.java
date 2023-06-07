package Produto;

public class Produto {
    private Integer idProduto;
    private String descProduto;
    private Double precoProduto;
    
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    public void mostrarProduto(){
        System.out.println("\nID: " +  this.idProduto + 
                "\nDescrição: " + this.descProduto + 
                "\nPreço: R$" + this.precoProduto);
    }
    
}
