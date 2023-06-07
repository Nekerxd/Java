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
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um programa que mostre os números.0, 2, 4, 6, 8, 10,...,20.
        for (int i = 0; i <= 20; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }
    
}
