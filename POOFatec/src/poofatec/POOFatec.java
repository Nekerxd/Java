package poofatec;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class POOFatec {


    public static void main(String[] args) {
        Float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso em quilos: "));
        Float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura em metros: "));
        System.out.println(String.format("Seu IMC é igual a: %.2f", (peso/(altura*altura))));
        
        /*float imc, peso, altura;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira sua altura em metros: ");
        altura = input.nextFloat();
        System.out.println("Insira seu peso em quilos: ");
        peso = input.nextFloat();
        
        */
        
        float imc = peso/(altura * altura);
        
        if (imc < 18.5){
            System.out.println("De acordo com seu peso e altura, você se enquadra na classificação de Magreza.");
        } else if (imc < 24.9){
            System.out.println("De acordo com seu peso e altura, você se enquadra na classificação de Normal.");
        } else if (imc < 29.9){
            System.out.println("De acordo com seu peso e altura, você se enquadra na classificação de Sobrepeso.");
        } else if (imc < 39.9){
            System.out.println("De acordo com seu peso e altura, você se enquadra na classificação de Obesidade.");
        } else{
            System.out.println("De acordo com seu peso e altura, você se enquadra na classificação de Obesidade Grave.");
        }
    }
}
