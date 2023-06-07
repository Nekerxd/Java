
package exercicios;

import javax.swing.JOptionPane;

public class EX07 {
    
    public static void main(String[] args) {
        Integer idade = 0; Integer cabelo_olho = 0; Integer mulheres = 0; int maior_idade = 0;
        
        
        while(true){
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
            if (idade.equals(-1)) break;
            if (idade > maior_idade) maior_idade = idade;
            
            String sexo = JOptionPane.showInputDialog("Insira seu sexo [M/F]: ").toUpperCase();
            
            Integer cabelos = Integer.parseInt(JOptionPane.showInputDialog("Cor dos cabelos: "
                    + "\n[0] Castanho "
                    + "\n[1] Preto "
                    + "\n[2] Ruivo "
                    + "\n[3] Louro "
                    + "\nDigite a opção correspondente: "));
            
            Integer olhos = Integer.parseInt(JOptionPane.showInputDialog("Cor dos olhos: "
                    + "\n[0] Castanho "
                    + "\n[1] Preto "
                    + "\n[2] Ruivo "
                    + "\n[3] Louro "
                    + "\nDigite a opção correspondente: "));
            
            if ((sexo.charAt(0) == 'F') && ((idade > 17) && (idade < 36))) mulheres += 1;
            
            if (olhos.equals(1) && cabelos.equals(0)) {
                cabelo_olho += 1;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("\nMaior idade: %d "
                + "\nMulheres entre 18 e 35 anos: %d "
                + "\nOlhos pretos e Cabelos castanhos: %d", maior_idade, mulheres, cabelo_olho));
    }
}
