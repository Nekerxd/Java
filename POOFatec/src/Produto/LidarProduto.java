/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author Aluno
 */
public class LidarProduto {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        
        p1.setIdProduto(1);
        p1.setDescProduto("RTX 3070 Ti");
        p1.setPrecoProduto(3524.0);
        
        Produto p2 = new Produto();
        p2.setIdProduto(2);
        p2.setDescProduto("i7 12700K");
        p2.setPrecoProduto(2159.0);
        
        p1.mostrarProduto();
        p2.mostrarProduto();
        
    }
    
}
