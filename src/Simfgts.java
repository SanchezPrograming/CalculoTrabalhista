
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author washington.osilva
 */
public class Simfgts extends javax.swing.JFrame {

    /**
     * Creates new form Simfgts
     */
    public Simfgts() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        s1fgtssim = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        s2fgtssim = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        s3fgtssim = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        p1fgtssim = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        p2fgtssim = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        p3fgtssim = new javax.swing.JTextField();
        btcalcfgtssim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultfgtssim = new javax.swing.JTextField();
        btvoltarfgtssim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Informe o periodo em meses e o salário de cada período:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(17, 6, 350, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Salário");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 37, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Salário");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 100, 37, 20);

        s1fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s1fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(s1fgtssim);
        s1fgtssim.setBounds(70, 100, 64, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Salário");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 100, 37, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Salário");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 100, 37, 20);

        s2fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s2fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(s2fgtssim);
        s2fgtssim.setBounds(190, 100, 64, 22);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Salário");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(270, 100, 50, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Salário");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(270, 100, 37, 20);

        s3fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s3fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(s3fgtssim);
        s3fgtssim.setBounds(320, 100, 64, 22);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Período");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 70, 43, 16);

        p1fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(p1fgtssim);
        p1fgtssim.setBounds(70, 70, 64, 22);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Período");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(140, 70, 43, 16);

        p2fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(p2fgtssim);
        p2fgtssim.setBounds(190, 70, 64, 22);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Período");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(270, 70, 43, 16);

        p3fgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3fgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3fgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(p3fgtssim);
        p3fgtssim.setBounds(320, 70, 64, 22);

        btcalcfgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btcalcfgtssim.setText("Calcular");
        btcalcfgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcfgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(btcalcfgtssim);
        btcalcfgtssim.setBounds(20, 140, 73, 23);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("O saldo acumulado do seu FGTS é: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 210, 16);

        resultfgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultfgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(resultfgtssim);
        resultfgtssim.setBounds(220, 190, 64, 22);

        btvoltarfgtssim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btvoltarfgtssim.setText("Voltar");
        btvoltarfgtssim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarfgtssimActionPerformed(evt);
            }
        });
        getContentPane().add(btvoltarfgtssim);
        btvoltarfgtssim.setBounds(20, 260, 72, 23);

        setSize(new java.awt.Dimension(416, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void s1fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1fgtssimActionPerformed

    private void s2fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2fgtssimActionPerformed

    private void s3fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3fgtssimActionPerformed

    private void p1fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1fgtssimActionPerformed

    private void p2fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2fgtssimActionPerformed

    private void p3fgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3fgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3fgtssimActionPerformed

    private void resultfgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultfgtssimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultfgtssimActionPerformed

    private void btvoltarfgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarfgtssimActionPerformed
dispose();
new Fgts().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btvoltarfgtssimActionPerformed

    private void btcalcfgtssimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcfgtssimActionPerformed
     
      double p1, s1, p2, s2, p3, s3, calc1 = 0, calc2 = 0, calc3 = 0;
 
      try {  
      String periodo1 = p1fgtssim.getText();  
      String salario1 = s1fgtssim.getText();  
      p1 = Double.parseDouble(periodo1);  
      s1 = Double.parseDouble(salario1);  
      calc1 = calcFgts(p1, s1);  
      } catch(NumberFormatException erro1){
          JOptionPane.showMessageDialog(null, "Digite um valor");
      }
      
      try {
      String periodo2 = p2fgtssim.getText();  
      String salario2 = s2fgtssim.getText();  
      p2 = Double.parseDouble(periodo2);  
      s2 = Double.parseDouble(salario2); 
      calc2 = calcFgts(p2, s2);  
      } catch(NumberFormatException erro2) {
          p2 = 0;
          s2 = 0;
      }
      
      
      try {
      String periodo3 = p3fgtssim.getText();   
      String salario3 = s3fgtssim.getText();
      p3 = Double.parseDouble(periodo3);
      s3 = Double.parseDouble(salario3);  
      calc3 = calcFgts(p3, s3);  
      } catch(NumberFormatException erro3) {
        p3 = 0;
        s3 = 0;
    }
        
       
     double calcTotal = calc1 + calc2 + calc3;
     
     String x = String.valueOf(calcTotal);
     resultfgtssim.setText(x);
     
     

     
// TODO add your handling code here:  
    }//GEN-LAST:event_btcalcfgtssimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static double calcFgts(double periodo, double salario) {

double calc = salario * 0.08;
  double calc2 = calc * periodo;
  calc2 = Math.round(calc2 * 100) / 100;
  return calc2;
}
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
            java.util.logging.Logger.getLogger(Simfgts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simfgts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simfgts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simfgts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simfgts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcalcfgtssim;
    private javax.swing.JButton btvoltarfgtssim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField p1fgtssim;
    private javax.swing.JTextField p2fgtssim;
    private javax.swing.JTextField p3fgtssim;
    private javax.swing.JTextField resultfgtssim;
    private javax.swing.JTextField s1fgtssim;
    private javax.swing.JTextField s2fgtssim;
    private javax.swing.JTextField s3fgtssim;
    // End of variables declaration//GEN-END:variables
}
