/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.ConfigureBusiness;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {
    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;

    public CreateNewAirlinerJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        planeNametxt = new javax.swing.JTextField();
        fleetLocTxt = new javax.swing.JTextField();
        fleetIdTxt = new javax.swing.JTextField();
        planesCountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createFlightBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fleet Location");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Airplanes Count");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Enter Airliner Details");

        createFlightBtn.setText("Create");
        createFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fleet Information ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fleet Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createFlightBtn)
                    .addGap(186, 186, 186))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fleetLocTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(fleetIdTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(planesCountTxt)
                                .addComponent(planeNametxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn)))
                    .addGap(190, 190, 190)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(planeNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fleetIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fleetLocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(planesCountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(createFlightBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightBtnActionPerformed
        if (fleetIdTxt.getText().equals("") || fleetLocTxt.getText().equals("") || planesCountTxt.getText().equals("") || planeNametxt.getText().equals("")) //Search fir cusrtomer and we can do even login in this
        {
            JOptionPane.showMessageDialog(null, "Enter all the fields");
        }

        if (ConfigureBusiness.isNullOrEmpty(fleetIdTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Fleet Id can't ne null or empty");
            return;
        }
        if (ConfigureBusiness.isNullOrEmpty(fleetLocTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Fleet Location can't ne null or empty");
            return;
        }
        if (ConfigureBusiness.isNullOrEmpty(planesCountTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Planes count can't ne null or empty");
            return;
        }
        try {
            Integer.parseInt(planesCountTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PLanes count has to be a number!!");
            return;
        }
        if (ConfigureBusiness.isNullOrEmpty(planeNametxt.getText())) {
            JOptionPane.showMessageDialog(null, "Airline Name can't ne null or empty");
        }
        Airliner airline = travelAgency.addAirline();
        airline.getFleet().setId(fleetIdTxt.getText());
        airline.getFleet().setLocation(fleetLocTxt.getText());
        airline.getFleet().setPlanesOnFleet(Integer.valueOf(planesCountTxt.getText()));
        airline.setAirlineName(planeNametxt.getText());

        JOptionPane.showMessageDialog(this, "Airline added succesfully!!!!");
        clearFields();
    }//GEN-LAST:event_createFlightBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        cardSequenceJPanel.remove(this);

        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.previous(cardSequenceJPanel);
        Component[] comp = cardSequenceJPanel.getComponents();

        for (Component c : comp) {
            if (c instanceof ManageAirlinersJPanel) {
                ManageAirlinersJPanel manageAirlinersJPanel = (ManageAirlinersJPanel) c;
                manageAirlinersJPanel.populateMainTable(travelAgency);
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed
    private void clearFields() {
        planeNametxt.setText("");
        planesCountTxt.setText("");
        fleetIdTxt.setText("");
        fleetLocTxt.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createFlightBtn;
    private javax.swing.JTextField fleetIdTxt;
    private javax.swing.JTextField fleetLocTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField planeNametxt;
    private javax.swing.JTextField planesCountTxt;
    // End of variables declaration//GEN-END:variables

}
