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
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um algoritmo que escreva os múltiplos de 10 no intervalo de 1 a 100.
        for (int i = 1;i <= 100; i++){
            if (i % 10 == 0)
                System.out.println(i);
        }
    }
    
}
