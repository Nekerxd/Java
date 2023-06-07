package poofatec;

import javax.swing.JOptionPane;

public class AreaTriangulo {


    public static void main(String[] args) {
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura do triângulo: "));
        float base = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base do triângulo: "));
        JOptionPane.showMessageDialog(null, String.format("Um triângulo de base %.1fcm e altura %.1fcm possui como área %.1fcm²", base, altura, (base*altura/2)));
    }
}
