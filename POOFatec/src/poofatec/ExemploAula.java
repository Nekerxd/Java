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
public class ExemploAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Hello World!");    
        
        int num = 0;
        String nome = "João";
        num++;
        
        System.out.println("O número calculado:" + num);
        System.out.println("O nome: " + nome);
        
        if(num >=1){
            System.out.println("OK!");
        } else{
            System.out.println("Falhou!");
        }
        
        for (int i=0; i<=100; i++){
            if (i%2 == 0)
                System.out.println("O número "+i+" é Par!");
        }
    }
}
