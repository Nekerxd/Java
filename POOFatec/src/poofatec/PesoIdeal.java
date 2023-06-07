
package poofatec;

import javax.swing.JOptionPane;

public class PesoIdeal {
    
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Insira seu sexo [M/F]: ");
        
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira sua altura em metros: "));
        char sexo_tratado = sexo.toUpperCase().charAt(0);
        
        if (sexo_tratado != 'M' && sexo_tratado != 'F'){
            System.out.println("Sexo Inválido");
        } else if (sexo_tratado == 'F') {
            JOptionPane.showMessageDialog(null, String.format("Por ser do sexo Feminino e medir %.2f m de altura, o seu peso ideal é: %.2f kg", altura, ((62.1*altura)-44.7)));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Por ser do sexo Masculino e medir %.2fm de altura, o seu peso ideal é: %.2fkg", altura, ((72.7*altura)-58)));
        }
    }
}
