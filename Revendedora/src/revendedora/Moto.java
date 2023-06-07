package revendedora;

public class Moto extends Produto{
    private Integer cilindradas;
    private String tipoMotor;
    private Integer velocidadeAtual;

    public Moto(Integer cilindradas, String tipoMotor, Integer velocidadeAtual) {
        this.cilindradas = cilindradas;
        this.tipoMotor = tipoMotor;
        this.velocidadeAtual = velocidadeAtual;
    }

    public Moto() {
        this.cilindradas = null;
        this.tipoMotor = "";
        this.velocidadeAtual= 0;
    }
    
    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public void acelerar(){
        if (velocidadeAtual <= 120){
            setVelocidadeAtual(getVelocidadeAtual()+10);
            System.out.println("Você está a " + getVelocidadeAtual() + "km/h!");
        } else {
            System.out.println("Você está na velocidade máxima");
        }
    }
    
    public void freiar(){
        if (velocidadeAtual > 10){
            setVelocidadeAtual(getVelocidadeAtual()-10);
            System.out.println("Você está a " + getVelocidadeAtual() + "km/h!");
        } else {
            System.out.println("Você já está parado!");
        }
    }
}
