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
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um programa que mostre os números ímpares em ordem decrescente os números no intervalo de 500 a 700.
        int i = 700;
        while (i > 500){
            if (i % 2 != 0)
                System.out.println(i);
            i--;
        }

    }
    
}
