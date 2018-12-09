/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.CrowdFunding.CFRCaseDirectory;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author nikhi
 */

public class CaseManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TerminalCaseManagerWorkAreaJPanel
     */
    private  JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private TerminalCasesOrganization CaseOrganization;
    private EcoSystem business;
    private CFRCaseDirectory cfrCaseDir;
    
    

    public CaseManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.CaseOrganization = (TerminalCasesOrganization)organization;
        this.enterprise = enterprise;
        this.cfrCaseDir = new CFRCaseDirectory();
        populateTable();
        populateRequestTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
   public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)CFRCaseWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[7];
           
         if (pcCheckBox1.isSelected() == true){
         for(CFRCaseWorkRequest request : CaseOrganization.getWorkQueue().getCFRCaseWorkRequestList()){
            if (request.getStatus() == "CFR Case Assigned") {
           // row[0] = request;
           row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        }
         }
    }
          if (najCheckBox1.isSelected() == true){
         for(CFRCaseWorkRequest request : CaseOrganization.getWorkQueue().getCFRCaseWorkRequestList()){
            if (request.getStatus() == "Request Sent") {
           // row[0] = request;
           row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        }
         }
    }
          
           if (pcCheckBox1.isSelected() == false && najCheckBox1.isSelected() == false){
         for(CFRCaseWorkRequest request : CaseOrganization.getWorkQueue().getCFRCaseWorkRequestList()){
          //  if (request.getStatus() == "Request Sent") {
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        
         }
    }
   }
   /* if (pcCheckBox1.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getStatus() == "Finance Case Assigned") {
       */
 
   public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) CFRFinanceWorkReqJTable1.getModel();
        
        model.setRowCount(0);
          Object[] row = new Object[7];
        
        
        if (afcheckbox2.isSelected() == true){
        for (CFRFinanceFellowWorkRequest request : userAccount.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getStatus() == "Orgs Notified for Funding" ||  request.getStatus() == "Awaiting for Finance Team") {
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        }
         }
    }
          else {
         for (CFRFinanceFellowWorkRequest request : userAccount.getWorkQueue().getCFRFinFellowWorkRequestList()){
            //if (request.getStatus() == "Orgs Notified for Funding") {
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        }
         
          }
    }

   /*
         DefaultTableModel model = (DefaultTableModel)CFRCaseWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
       // for(WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
         for(WorkRequest request : CaseOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
  
   */


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CFRFinanceWorkReqJTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CFRCaseWorkQueueJTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        pcCheckBox1 = new javax.swing.JCheckBox();
        afcheckbox2 = new javax.swing.JCheckBox();
        najCheckBox1 = new javax.swing.JCheckBox();
        searchtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        searchtxt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("CASE MANAGER WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 20, 204, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("WORK QUEUE (CASE MANAGER)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 24));

        CFRFinanceWorkReqJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT", "CASE ID", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CFRFinanceWorkReqJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 636, 110));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("ADD CASE DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 170, 30));

        assignJButton.setBackground(new java.awt.Color(255, 102, 102));
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 30));

        refreshJButton.setBackground(new java.awt.Color(255, 102, 102));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        CFRCaseWorkQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT", "CASE ID", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "FULFILLED BY", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(CFRCaseWorkQueueJTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 636, 125));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("WORK REQUEST (FINANCE FELLOW)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 30));

        pcCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        pcCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        pcCheckBox1.setText("PENDING CASES");
        pcCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcCheckBox1MouseClicked(evt);
            }
        });
        pcCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcCheckBox1ActionPerformed(evt);
            }
        });
        add(pcCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        afcheckbox2.setBackground(new java.awt.Color(255, 255, 255));
        afcheckbox2.setForeground(new java.awt.Color(255, 102, 102));
        afcheckbox2.setText("AWAITING FUNDING");
        afcheckbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                afcheckbox2MouseClicked(evt);
            }
        });
        afcheckbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afcheckbox2ActionPerformed(evt);
            }
        });
        add(afcheckbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 160, -1));

        najCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        najCheckBox1.setText("NOT ASSIGNED");
        najCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                najCheckBox1MouseClicked(evt);
            }
        });
        najCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                najCheckBox1ActionPerformed(evt);
            }
        });
        add(najCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 120, 30));

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("SEARCH BY CATEGORY");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 274, 150, 20));

        searchtxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxt2ActionPerformed(evt);
            }
        });
        searchtxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxt2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxt2KeyReleased(evt);
            }
        });
        add(searchtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, 30));

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("SEARCH BY PATIENT");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

           int selectedRow = CFRCaseWorkQueueJTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CFRCaseWorkRequest request = (CFRCaseWorkRequest)CFRCaseWorkQueueJTable1.getValueAt(selectedRow, 0);
     
        request.setStatus("CFR Case Processing");
        
        AddCasedetailsJPanel AddCasedetailsJPanel = new AddCasedetailsJPanel(userProcessContainer, request, userAccount,enterprise , cfrCaseDir);
        userProcessContainer.add("AddCasedetailsJPanel", AddCasedetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = CFRCaseWorkQueueJTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CFRCaseWorkRequest request = (CFRCaseWorkRequest)CFRCaseWorkQueueJTable1.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("CFR Case Assigned");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void pcCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcCheckBox1ActionPerformed

        populateTable();

    }//GEN-LAST:event_pcCheckBox1ActionPerformed

    private void afcheckbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afcheckbox2ActionPerformed

        populateTable();
    }//GEN-LAST:event_afcheckbox2ActionPerformed

    private void najCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_najCheckBox1ActionPerformed

        populateTable();
    }//GEN-LAST:event_najCheckBox1ActionPerformed

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
  //    populateTable();
        
    }//GEN-LAST:event_searchtxtKeyPressed

    private void pcCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcCheckBox1MouseClicked
       populateTable();
      
    }//GEN-LAST:event_pcCheckBox1MouseClicked

    private void najCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_najCheckBox1MouseClicked
        // TODO add your handling code here:
        populateTable();
      
    }//GEN-LAST:event_najCheckBox1MouseClicked

    private void afcheckbox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_afcheckbox2MouseClicked
        // TODO add your handling code here:
       populateRequestTable();      
    }//GEN-LAST:event_afcheckbox2MouseClicked

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)CFRCaseWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[7];
       
         for(CFRCaseWorkRequest request : CaseOrganization.getWorkQueue().getCFRCaseWorkRequestList()){
          if (request.getCategory().contains(searchtxt.getText()))
           {
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        
         }
         }
    }//GEN-LAST:event_searchtxtKeyReleased

    private void searchtxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxt2ActionPerformed

    private void searchtxt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxt2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxt2KeyPressed

    private void searchtxt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxt2KeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) CFRFinanceWorkReqJTable1.getModel();
        
        model.setRowCount(0);
          Object[] row = new Object[7];
        
        
        for (CFRFinanceFellowWorkRequest request : userAccount.getWorkQueue().getCFRFinFellowWorkRequestList()){
          //  if (request.getStatus() == "Orgs Notified for Funding" ||  request.getStatus() == "Awaiting for Finance Team") {
             if (request.getPatient().contains(searchtxt2.getText()))
           {
         
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_searchtxt2KeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CFRCaseWorkQueueJTable1;
    private javax.swing.JTable CFRFinanceWorkReqJTable1;
    private javax.swing.JCheckBox afcheckbox2;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox najCheckBox1;
    private javax.swing.JCheckBox pcCheckBox1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTextField searchtxt2;
    // End of variables declaration//GEN-END:variables
}
