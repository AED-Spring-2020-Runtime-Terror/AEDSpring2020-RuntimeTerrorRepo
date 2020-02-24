/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Customer;
import Business.Ticket;
import Business.TravelAgency;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bobba
 */
public class ViewCustomerBookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerBookingsJPanel
     */

    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    private Customer customer;


    ViewCustomerBookingsJPanel(TravelAgency travelAgency, Customer customer, JPanel cardSequenceJPanel) {
        initComponents();
        this.cardSequenceJPanel=cardSequenceJPanel;
            this.customer=customer;
            this.travelAgency = travelAgency;
            populateTbl();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        bokTable = new javax.swing.JTable();
        hmBtn1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Customer Booking Details");

        bokTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departure Location", "Arrival Location", "PNR No", "Seat Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bokTable);

        hmBtn1.setText("Back To Home");
        hmBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(hmBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hmBtn1)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hmBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmBtn1ActionPerformed
        // TODO add your handling code here:
         cardSequenceJPanel.removeAll();
    }//GEN-LAST:event_hmBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bokTable;
    private javax.swing.JButton hmBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    private void populateTbl() {
        
        DefaultTableModel dtm = (DefaultTableModel) bokTable.getModel();
        
        dtm.setRowCount(0);

        for (Ticket t : customer.getTickets()) {
            Object[] row = new Object[dtm.getColumnCount()];

            row[0] = t.getDeparture();
            row[1] = t.getDestination();
            row[2] = t.getPnr();
            row[3] = t.getSeatNumber();

            dtm.addRow(row);

        }
    }
}

