/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    private Airliner airline;

    ViewAirlinerJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency, Airliner airline) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.airline = airline;
        populateFields(airline);
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
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        airlineNameTxt = new javax.swing.JTextField();
        fleetLocationTxt = new javax.swing.JTextField();
        airPlanesCounttxt = new javax.swing.JTextField();
        viewFlightScheBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fleetIdTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Airliner Details");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Name of Airline");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fleet Location");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Airplanes Count");

        airPlanesCounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airPlanesCounttxtActionPerformed(evt);
            }
        });

        viewFlightScheBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        viewFlightScheBtn.setText("View Flight Schedule");
        viewFlightScheBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightScheBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fleet ID");

        fleetIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fleetIdTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)))
                .addGap(269, 269, 269))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airlineNameTxt)
                    .addComponent(fleetLocationTxt)
                    .addComponent(airPlanesCounttxt)
                    .addComponent(fleetIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(viewFlightScheBtn)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(airlineNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fleetLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airPlanesCounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fleetIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addComponent(viewFlightScheBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        cardSequenceJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void airPlanesCounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airPlanesCounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airPlanesCounttxtActionPerformed

    private void fleetIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fleetIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fleetIdTxtActionPerformed

    private void viewFlightScheBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightScheBtnActionPerformed

        ManageAirlinerFightSchedJPanel manageAirlinerFightSchedJPanel = new ManageAirlinerFightSchedJPanel(cardSequenceJPanel, travelAgency, airline);
        cardSequenceJPanel.add("ManageAirlinerFightSchedJPanel", manageAirlinerFightSchedJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_viewFlightScheBtnActionPerformed
    private void populateFields(Airliner airline) {

        airlineNameTxt.setText(airline.getAirlineName());
        fleetLocationTxt.setText(airline.getFleet().getLocation());
        fleetIdTxt.setText(airline.getFleet().getId());
        airPlanesCounttxt.setText(String.valueOf(airline.getFleet().getPlanesOnFleet()));

        airlineNameTxt.setEnabled(false);
        fleetLocationTxt.setEnabled(false);
        fleetIdTxt.setEnabled(false);
        airPlanesCounttxt.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airPlanesCounttxt;
    private javax.swing.JTextField airlineNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fleetIdTxt;
    private javax.swing.JTextField fleetLocationTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton viewFlightScheBtn;
    // End of variables declaration//GEN-END:variables

}
