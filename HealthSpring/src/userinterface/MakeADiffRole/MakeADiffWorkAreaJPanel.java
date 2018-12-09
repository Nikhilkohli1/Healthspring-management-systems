/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MakeADiffRole;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.MakeADiffOrganization;
import Business.UserAccount.UserAccount;
import Business.VaccineWorkQueue.VaccineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class MakeADiffWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MakeADiffWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private MakeADiffOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    
    public MakeADiffWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, MakeADiffOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populateVaccineRequestTable();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        awfundsjCheckBox1 = new javax.swing.JCheckBox();
        fundsrecjCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        asjCheckBox3 = new javax.swing.JCheckBox();
        searchtxt = new javax.swing.JTextField();
        Vacctxtsearch = new javax.swing.JTextField();
        VrecjCheckBox1 = new javax.swing.JCheckBox();
        vaccineReqbtn = new javax.swing.JButton();
        NassignjCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 102, 102));
        requestTestJButton.setText("NEW FUNDING REQUEST");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 271, -1, 30));

        refreshTestJButton.setBackground(new java.awt.Color(255, 102, 102));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("MAKE A DIFFERENCE WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 16, 217, 21));

        workRequestJTable.setForeground(new java.awt.Color(0, 0, 102));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "FULFILLED BY", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 690, 125));

        awfundsjCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        awfundsjCheckBox1.setText("AWAITING FUNDS");
        awfundsjCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                awfundsjCheckBox1MouseClicked(evt);
            }
        });
        add(awfundsjCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        fundsrecjCheckBox2.setForeground(new java.awt.Color(255, 102, 102));
        fundsrecjCheckBox2.setText("FUNDING RECEIVED");
        fundsrecjCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundsrecjCheckBox2MouseClicked(evt);
            }
        });
        add(fundsrecjCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 136, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "VACCINE NAME", "VACCINE TYPE", "QUANTITY", "REQUESTOR", "RECEIVER", "MESSAGE", "NETWORK", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 400, 760, 116));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("CFR FUNDING REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 157, 25));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("VACCINE STOCK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 176, 25));

        asjCheckBox3.setForeground(new java.awt.Color(255, 102, 102));
        asjCheckBox3.setText("AWAITING STOCK");
        asjCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asjCheckBox3MouseClicked(evt);
            }
        });
        asjCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asjCheckBox3ActionPerformed(evt);
            }
        });
        add(asjCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 148, -1));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 140, 30));

        Vacctxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VacctxtsearchKeyReleased(evt);
            }
        });
        add(Vacctxtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 150, 30));

        VrecjCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        VrecjCheckBox1.setText("VACCINE RECEIVED");
        VrecjCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VrecjCheckBox1MouseClicked(evt);
            }
        });
        add(VrecjCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 140, -1));

        vaccineReqbtn.setText("VACCINE STOCK REQUEST");
        vaccineReqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineReqbtnActionPerformed(evt);
            }
        });
        add(vaccineReqbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 170, 30));

        NassignjCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        NassignjCheckBox1.setText("NOT ASSIGNED");
        NassignjCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NassignjCheckBox1MouseClicked(evt);
            }
        });
        add(NassignjCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
         Object[] row = new Object[6];
            
        
                 if (NassignjCheckBox1.isSelected() == true){
              
        for (CFRCaseWorkRequest request : userAccount.getWorkQueue().getCFRCaseWorkRequestList()){
                 if ( request.getStatus().equalsIgnoreCase("Request Sent")) {
     
           row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[1] = request.getCategory();
           // row[0] = request.getPatient();
            row[2] = request.getCost();
            
            model.addRow(row);
        }
        }
    }
          if (awfundsjCheckBox1.isSelected() == true){
              
        for (CFRCaseWorkRequest request : userAccount.getWorkQueue().getCFRCaseWorkRequestList()){
                 if (request.getStatus().equalsIgnoreCase("Awaiting Funding") ) {
     
           row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[1] = request.getCategory();
           // row[0] = request.getPatient();
            row[2] = request.getCost();
            
            model.addRow(row);
        }
        }
    }
          if (fundsrecjCheckBox2.isSelected() == true){
              
        for (CFRCaseWorkRequest request : userAccount.getWorkQueue().getCFRCaseWorkRequestList()){
                 if (request.getStatus().equalsIgnoreCase("Funds Received")) {
     
           row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[1] = request.getCategory();
           // row[0] = request.getPatient();
            row[2] = request.getCost();
            
            model.addRow(row);
        }
        }
    }
          
            if (fundsrecjCheckBox2.isSelected() == false && awfundsjCheckBox1.isSelected() == false && NassignjCheckBox1.isSelected() ==false ){
              
        for (CFRCaseWorkRequest request : userAccount.getWorkQueue().getCFRCaseWorkRequestList()){
               
           row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[1] = request.getCategory();
           // row[0] = request.getPatient();
            row[2] = request.getCost();
            
            model.addRow(row);
        
        }
    }
}
public void populateVaccineRequestTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
             Object[] row = new Object[8];
     
        
         if (asjCheckBox3.isSelected() == true){
        for (VaccineWorkRequest request : userAccount.getWorkQueue().getVaccineWorkRequestList()){
                   if (request.getStatus().equalsIgnoreCase("Vaccine Request Sent")) {
     
              //row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
            
            model.addRow(row);
        }
    }
         }
          if (VrecjCheckBox1.isSelected() == true){
        for (VaccineWorkRequest request : userAccount.getWorkQueue().getVaccineWorkRequestList()){
                   if (request.getStatus().equalsIgnoreCase("Vaccine Stock Sent")) {
     
              //row[0] = request;
              row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
            
            model.addRow(row);
        }
    }
         }
          
           if (VrecjCheckBox1.isSelected() == false && asjCheckBox3.isSelected() == false){
        for (VaccineWorkRequest request : userAccount.getWorkQueue().getVaccineWorkRequestList()){
                 //  if (request.getStatus().equalsIgnoreCase("Vaccine Stock Sent")) {
     
              //row[0] = request;
              row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
            
            model.addRow(row);
        
    }
         }
}
    
    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestCFRFundingJPanel", new RequestCFRFundingJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        populateVaccineRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (CFRCaseWorkRequest request : userAccount.getWorkQueue().getCFRCaseWorkRequestList()){
             if (request.getPatient().contains(searchtxt.getText()))
           {
            Object[] row = new Object[6];
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[1] = request.getCategory();
            row[0] = request;
            row[2] = request.getCost();
            
            model.addRow(row);
        }
        }
        
    }//GEN-LAST:event_searchtxtKeyReleased

    private void awfundsjCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awfundsjCheckBox1MouseClicked

        populateRequestTable();
    }//GEN-LAST:event_awfundsjCheckBox1MouseClicked

    private void fundsrecjCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundsrecjCheckBox2MouseClicked

       populateRequestTable();
    }//GEN-LAST:event_fundsrecjCheckBox2MouseClicked

    private void vaccineReqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineReqbtnActionPerformed


        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestVaccineJPanel", new RequestVaccineJPanel(userProcessContainer, userAccount, enterprise, organization, business));
        layout.next(userProcessContainer);
        
// TODO add your handling code here:
    }//GEN-LAST:event_vaccineReqbtnActionPerformed

    private void asjCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asjCheckBox3MouseClicked
        // TODO add your handling code here:
        populateVaccineRequestTable();
    }//GEN-LAST:event_asjCheckBox3MouseClicked

    private void VrecjCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VrecjCheckBox1MouseClicked
        // TODO add your handling code here:
        populateVaccineRequestTable();
    }//GEN-LAST:event_VrecjCheckBox1MouseClicked

    private void asjCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asjCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asjCheckBox3ActionPerformed

    private void VacctxtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VacctxtsearchKeyReleased

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
             Object[] row = new Object[8];
     
        
        for (VaccineWorkRequest request : userAccount.getWorkQueue().getVaccineWorkRequestList()){
                   if (request.getVaccineName().contains(Vacctxtsearch.getText())) {
     
              //row[0] = request;
            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
            
            model.addRow(row);
        }
    }
         
       
    }//GEN-LAST:event_VacctxtsearchKeyReleased

    private void NassignjCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NassignjCheckBox1MouseClicked
        populateRequestTable();
    }//GEN-LAST:event_NassignjCheckBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox NassignjCheckBox1;
    private javax.swing.JTextField Vacctxtsearch;
    private javax.swing.JCheckBox VrecjCheckBox1;
    private javax.swing.JCheckBox asjCheckBox3;
    private javax.swing.JCheckBox awfundsjCheckBox1;
    private javax.swing.JCheckBox fundsrecjCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton vaccineReqbtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
