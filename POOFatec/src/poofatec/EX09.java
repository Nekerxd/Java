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
public class EX09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implemente um programa que permita a entrada de 20 número e apresenta como resultado o maior número digitado.
                
        Scanner input = new Scanner(System.in);
        
        int[] nums = new int[20];
        int maior = nums[0];
        
        for (int i = 0; i < 20; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            nums[i] = input.nextInt();
            if (nums[i] > maior){
                maior = nums[i];
            }
        }
                
        System.out.println("Dentre os valores inseridos o maior é igual a: " + maior);
    }
    
}
