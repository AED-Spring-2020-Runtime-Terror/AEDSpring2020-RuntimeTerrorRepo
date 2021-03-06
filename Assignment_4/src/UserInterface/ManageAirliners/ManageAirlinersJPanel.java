/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;

    public ManageAirlinersJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populate(travelAgency);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinertable = new javax.swing.JTable();
        viewAirlinerBtn = new javax.swing.JButton();
        CreatenewAirlinebtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Airliners ");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirLiner Name", "Fleet Location", "Scheduled Flights"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlinertable);

        viewAirlinerBtn.setText("View Airliner Details");
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });

        CreatenewAirlinebtn.setText("Create New Airliner");
        CreatenewAirlinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatenewAirlinebtnActionPerformed(evt);
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
                        .addComponent(backBtn)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreatenewAirlinebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAirlinerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreatenewAirlinebtn)
                .addGap(161, 161, 161))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        cardSequenceJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
        int selectedrow = airlinertable.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        } else {

            Airliner airliner = (Airliner) airlinertable.getValueAt(selectedrow, 0);
            ViewAirlinerJPanel viewAirlinerJPanel = new ViewAirlinerJPanel(cardSequenceJPanel, travelAgency, airliner);
            cardSequenceJPanel.add("ViewAirlinerJPanel", viewAirlinerJPanel);
            CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
            cardLayout.next(cardSequenceJPanel);

        }

    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void CreatenewAirlinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatenewAirlinebtnActionPerformed
        //have to insert new airline
        CreateNewAirlinerJPanel createNewAirlinerJPanel = new CreateNewAirlinerJPanel(travelAgency, cardSequenceJPanel);
        cardSequenceJPanel.add("CreateNewAirlinerJPanel", createNewAirlinerJPanel);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);

    }//GEN-LAST:event_CreatenewAirlinebtnActionPerformed
    public void populate(TravelAgency travelAgency) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) airlinertable.getModel();
        defaultTableModel.setRowCount(0);

        for (Airliner airliner : travelAgency.getAirlineDirectory().getAirlines()) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = airliner;
            row[1] = airliner.getFleet().getLocation();
            row[2] = (airliner.getFlightSchedule() != null && airliner.getFlightSchedule().getFlights() != null) ? airliner.getFlightSchedule().getFlights().size() : 0;

            defaultTableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatenewAirlinebtn;
    private javax.swing.JTable airlinertable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables

}
