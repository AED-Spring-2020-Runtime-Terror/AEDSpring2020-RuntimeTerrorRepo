/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AirlinerDirectory;
import Business.TravelAgency;
import java.awt.CardLayout;

/**
 *
 * @author nived
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private TravelAgency travelAgency;
    public TravelAgencyMain() {
        initComponents();
        travelAgency = this.travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        CardSequenceJPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        manageAirlinerBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(CardSequenceJPanel);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAirlinerBtn.setText("Manage Airliner");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });
        jPanel4.add(manageAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        searchBtn.setText("Search");
        jPanel4.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jSplitPane2.setLeftComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}