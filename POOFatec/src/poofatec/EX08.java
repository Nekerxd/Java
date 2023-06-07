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
public class EX08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elabore um programa que leia 10 números e apresente como resultado a sua média
        
        float total = 0; int tamanho = 10;
        Scanner input = new Scanner(System.in);
        
        int[] nums = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            nums[i] = input.nextInt();
            total += nums[i];
        }
        
        float media = total/tamanho;
        
        System.out.println("A média dos valores inseridos é igual a: " + media);
        
    }
    
}
