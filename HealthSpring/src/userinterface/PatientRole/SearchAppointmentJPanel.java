/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import java.awt.CardLayout;
import userinterface.DoctorRole.RequestLabTestJPanel;

/**
 *
 * @author nikhi
 */
public class SearchAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchAppointmentJPanel
     */
    public SearchAppointmentJPanel() {
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
        hsCentreJCombobox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SCHEDULE APPOINMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 35, 211, 32));

        hsCentreJCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(hsCentreJCombobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 128, 117, -1));

        jLabel2.setText("SELECT HEALTH CENTRE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 131, 130, -1));

        jLabel3.setText("APPOINMENT DATE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 131, 121, -1));

        jLabel4.setText("APPOINTMENT TIME");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 192, 108, -1));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 128, 135, -1));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("BookAppoinmentJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox hsCentreJCombobox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
