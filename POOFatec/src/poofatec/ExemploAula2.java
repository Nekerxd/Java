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
public class ExemploAula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double total = 0;
        int cont = 0, n = 0;
        
        Scanner input = new Scanner(System.in);
        
        final double pi = 3.14;
        
        System.out.println("Digite um valor, para a quantidade de números que deseja colocar: ");
        
        n = input.nextInt();
        
        double[] fila = new double[n];
        
        System.out.println("Complete a lista array: ");
        
        while(cont < n){
            System.out.println("Digite a " + (cont+1) + " posição: ");
            fila[cont] = input.nextDouble();
            
            total += fila[cont];
            cont++;
        }
        System.out.println("A média total é = " + total / (cont - 1));
    }
    
}
