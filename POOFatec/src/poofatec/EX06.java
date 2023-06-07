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
public class EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um algoritmo que calcule o valor de s.
        float s = 0, k = 1;
        
        for (float i = 1; i <= 50; i++){
            s += (k/i);
            k += 2;
        }
            System.out.println("S é igual a " + s);
    }
}
