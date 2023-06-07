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
public class EX15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* 
        * Criar um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci
        * é formada pela sequência: 1,1,2,3,5,8,13,21,34... etc. Esta série se caracteriza pela soma de um termo
        * posterior com o seu subsequente.
        */
       int cont = 1, posterior =0, sucessor =1, fibonacci = 1;
       
       while (cont <= 15){
           System.out.println(fibonacci);
           fibonacci = posterior + sucessor;
           posterior = sucessor;
           sucessor = fibonacci;
           cont++;
       }
    }
}