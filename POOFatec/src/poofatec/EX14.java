/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poofatec;

/**
 *
 * @author Aluno
 */
public class EX14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um algoritmo que calcule o valor de S
        float k = 1, s = 0;
        
        for (float i = 37; i > 0; i--){
            s += (i * (i + 1))/k;
            k++;
        }
        
        System.out.println("O valor de S é igual a: " + s);
    }
}
