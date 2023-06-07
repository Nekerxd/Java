
package exercicios;

import javax.swing.JOptionPane;

public class EX06 {
    
    public static void main(String[] args) {
        
        Double maior_nota = 0.0;
        String melhor_aluno = "";
        Double notas = 0.0;
        Integer qtd_aluno = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos: "));
        
        for (int i = 0; i < qtd_aluno; i++){
            String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
            Double nota_aluno = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno: "));
            if (nota_aluno > maior_nota){
                maior_nota = nota_aluno;
                melhor_aluno = nome;
            }
            notas += nota_aluno;
        }      
        JOptionPane.showMessageDialog(null, String.format("O melhor aluno foi %s e a média da sala foi %.2f", melhor_aluno, (notas / qtd_aluno)));
    }
}
