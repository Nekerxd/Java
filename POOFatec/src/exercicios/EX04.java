/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Aluno
 */
public class EX04 extends javax.swing.JFrame {

    /**
     * Creates new form EX04
     */
    public EX04() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcular_button = new javax.swing.JButton();
        titulo_label = new javax.swing.JLabel();
        nome_field = new javax.swing.JTextField();
        salario_field = new javax.swing.JTextField();
        nome_label = new javax.swing.JLabel();
        salario_label = new javax.swing.JLabel();
        resultado_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcular_button.setText("Calcular");
        calcular_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_buttonActionPerformed(evt);
            }
        });

        titulo_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo_label.setText("Salário Líquido");

        nome_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nome_label.setText("Nome:");

        salario_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salario_label.setText("Salário: ");

        resultado_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calcular_button)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nome_label)
                                .addComponent(salario_label)
                                .addComponent(nome_field, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(salario_field))
                            .addComponent(resultado_label, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(117, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_label)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titulo_label)
                .addGap(18, 18, 18)
                .addComponent(nome_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nome_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(salario_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salario_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(resultado_label, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(calcular_button)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcular_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_buttonActionPerformed
        calcular();
    }//GEN-LAST:event_calcular_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EX04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EX04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EX04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EX04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EX04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular_button;
    private javax.swing.JTextField nome_field;
    private javax.swing.JLabel nome_label;
    private javax.swing.JLabel resultado_label;
    private javax.swing.JTextField salario_field;
    private javax.swing.JLabel salario_label;
    private javax.swing.JLabel titulo_label;
    // End of variables declaration//GEN-END:variables

    private void calcular(){
        
        if ((nome_field.getText().length() > 0) && (salario_field.getText().length() > 0)){
            String nome = nome_field.getText();
            Double salario = Double.parseDouble(salario_field.getText());
            Double salario_descontado;
        
            if (salario < 1900){
                salario_descontado = salario;
            } else if(salario < 2821) {
                salario_descontado = salario * 0.925; 
            } else if(salario < 3751) {
                salario_descontado = salario * 0.85;
            } else if(salario < 4666) {
                salario_descontado = salario * 0.775;
            } else {
                salario_descontado = salario * 0.725;
            }
            resultado_label.setText(String.format("%s, seu salário líquido será R$%.2f", nome, (salario_descontado*0.92)));
        } else {
            resultado_label.setText("Por favor preencha todos os campos!");
        }
    }
}
