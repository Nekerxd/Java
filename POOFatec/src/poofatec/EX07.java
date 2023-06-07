/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poofatec;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EX07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um programa que permita a entrada de dois números e mostre como resultado a soma dos números pares entre os números lidos.
        int num1 = 0, num2 = 0, soma = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        if (num1 < num2){
            for (int i = num1+1; i < num2; i++){
                if (i % 2 == 0){
                    soma += i;
                }
            }
        } else {
            for (int i = num2; i < num1; i++){
                if (i % 2 == 0){
                    soma += i;
                    System.out.println(i);
                }
            }
        }
        System.out.println("A soma dos números pares entre " + num1 + " e " + num2 + " é igual a " + soma);
    }
}
