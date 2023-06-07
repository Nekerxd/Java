package revendedora;

public class Revendedora {

    public static void main(String[] args) {
       
        Bicicleta bike = new Bicicleta();
        Moto moto = new Moto();
        Carro carro = new Carro();
        
        carro.setCor("Azul");
        carro.setCapacidadeCombustivel(45.0);
        carro.setMarca("Toyota");
        carro.setModelo("Hilux 4x4");
        carro.setQtdCombustivel(43.5);
        carro.setQtdPortas(4);
        carro.setValor(320460.90);
        
        carro.abastecerCombustivel();
        carro.calibrarPneu();
        carro.gastarCombustivel(13.5);
    }
}
