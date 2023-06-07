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
public class EX11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desenvolva um programa que apresente todos os números positivos divisíveis por 4 que sejam menores que 200.
        for (int i = 0; i < 200; i++){
            if (i % 4 == 0)
                System.out.println(i);
        }
    }
    
}
