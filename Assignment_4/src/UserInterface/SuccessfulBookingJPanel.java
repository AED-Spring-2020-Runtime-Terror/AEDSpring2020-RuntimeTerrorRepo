/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Customer;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author bobba
 */
public class SuccessfulBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuccessfulBookingJPanel
     */
    private JPanel rightPanel;
    private Flight flight;
    private TravelAgency travelAgency;
    private Customer customer;
    SuccessfulBookingJPanel(Customer customer, TravelAgency travelAgency, JPanel rightPanel,Flight flight) {
            initComponents();
            this.rightPanel=rightPanel;
            this.customer=customer;
            this.travelAgency = travelAgency;
            this.flight =flight;
            String s =  LabelTxt.getText().replaceFirst("FROM_", flight.getDeparture());
            String str = s.replaceFirst("TO_", flight.getDestination());
            LabelTxt.setText(str);
           

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
        viewCustomerBookingTxt = new javax.swing.JButton();
        LabelTxt = new javax.swing.JLabel();
        hmBtn = new javax.swing.JButton();

        jLabel1.setText("Congratulations");

        viewCustomerBookingTxt.setText("View Customer Bookings");
        viewCustomerBookingTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerBookingTxtActionPerformed(evt);
            }
        });

        LabelTxt.setText("Your ticket has been successfully booked from FROM_ to TO_");

        hmBtn.setText("Back To Home");
        hmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewCustomerBookingTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(LabelTxt)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(LabelTxt)
                .addGap(82, 82, 82)
                .addComponent(viewCustomerBookingTxt)
                .addGap(35, 35, 35)
                .addComponent(hmBtn)
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmBtnActionPerformed
       rightPanel.removeAll();
//        rightPanel.remove(this);
//       CardLayout layout = (CardLayout) rightPanel.getLayout();
//       layout.next(rightPanel);
    }//GEN-LAST:event_hmBtnActionPerformed

    private void viewCustomerBookingTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerBookingTxtActionPerformed
        ViewCustomerBookingsJPanel viewCustomerBookingsJPanel = new ViewCustomerBookingsJPanel(travelAgency, customer,rightPanel);
        rightPanel.add("ViewCustomerBookingsJPanel", viewCustomerBookingsJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_viewCustomerBookingTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTxt;
    private javax.swing.JButton hmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewCustomerBookingTxt;
    // End of variables declaration//GEN-END:variables
}