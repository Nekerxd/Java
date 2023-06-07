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
public class EX12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criar um programa para exiba os próximos 10 números a partir de um número lido. 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        
        for (int i = num; i <= num+10 ; i++){
            System.out.println(i);
        }
    }
}
    
