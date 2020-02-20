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
    private JPanel rightPanel;

    public ManageAirlinersJPanel(JPanel rightPanel, TravelAgency travelAgency) {
        initComponents();
        this.travelAgency = travelAgency;
        this.rightPanel = rightPanel;
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
        vieAirlinerBtn = new javax.swing.JButton();
        InsertnewAirlinebtn = new javax.swing.JButton();

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
                "AirLineName", "Fleet Location", "ScheduledFlights"
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

        vieAirlinerBtn.setText("View Airliner Details");
        vieAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieAirlinerBtnActionPerformed(evt);
            }
        });

        InsertnewAirlinebtn.setText("Insert New Airliner");
        InsertnewAirlinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertnewAirlinebtnActionPerformed(evt);
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
                    .addComponent(vieAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertnewAirlinebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(vieAirlinerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertnewAirlinebtn)
                .addGap(161, 161, 161))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void vieAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieAirlinerBtnActionPerformed


    }//GEN-LAST:event_vieAirlinerBtnActionPerformed

    private void InsertnewAirlinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertnewAirlinebtnActionPerformed
        //have to insert new airline

    }//GEN-LAST:event_InsertnewAirlinebtnActionPerformed
    public void populateMainTable(TravelAgency travelAgency) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) airlinertable.getModel();
        defaultTableModel.setRowCount(0);

        for (Airliner a : travelAgency.getAirlinerDirectory().getAirlines()) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = a;
            row[1] = a.getFleet().getLocation();
            row[2] = (a.getFlightSchedule() != null && a.getFlightSchedule().getFlights() != null) ? a.getFlightSchedule().getFlights().size() : 0;

            defaultTableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertnewAirlinebtn;
    private javax.swing.JTable airlinertable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton vieAirlinerBtn;
    // End of variables declaration//GEN-END:variables

}
