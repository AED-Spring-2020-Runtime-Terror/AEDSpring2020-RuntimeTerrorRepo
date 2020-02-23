/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srush
 */
public class FlightFoundJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightFoundJPanel
     */
    
    private JPanel rightPanel;
   private TravelAgency travelAgency;
   private List<Flight> flights;
   
    public FlightFoundJPanel(JPanel rightPanel, TravelAgency travelAgency, List<Flight> flights) {
       initComponents();
       this.rightPanel=rightPanel;
       this.flights=flights;
       this.travelAgency= travelAgency;
       populateFlightDetails();
       }

    private void populateFlightDetails() {
       //To change body of generated methods, choose Tools | Templates.
       DefaultTableModel defaultTableModel = (DefaultTableModel) flightDetailtbl.getModel();
       defaultTableModel.setRowCount(0);
        
        for(Flight f : flights){
           Object[] row = new Object[defaultTableModel.getColumnCount()];
           row[0] = f;
           row[1] = f.getDestination();
           row[2] =f.getDeparture();
           row[3] = "Yes";
           defaultTableModel.addRow(row);
   }
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
        bckbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightDetailtbl = new javax.swing.JTable();
        fetchdetbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Flights Details");

        bckbtn.setText("<<Back");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });

        flightDetailtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "To", "From", "Seat Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightDetailtbl);

        fetchdetbtn.setText("Fetch Details");
        fetchdetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchdetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bckbtn)
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addGap(336, 336, 336))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fetchdetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bckbtn))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fetchdetbtn)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }//GEN-LAST:event_bckbtnActionPerformed

    private void fetchdetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchdetbtnActionPerformed
        // TODO add your handling code here:

        int selectedRow=flightDetailtbl.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null,"Please select a row first" , "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Flight flight= (Flight)flightDetailtbl.getValueAt(selectedRow,0);
            FlightDetailsFetchedJPanel panel = new FlightDetailsFetchedJPanel(rightPanel,flight,travelAgency);
            rightPanel.add("FlightDetailsFetchedJPanel",panel);
            CardLayout layout= (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }

    }//GEN-LAST:event_fetchdetbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckbtn;
    private javax.swing.JButton fetchdetbtn;
    private javax.swing.JTable flightDetailtbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}