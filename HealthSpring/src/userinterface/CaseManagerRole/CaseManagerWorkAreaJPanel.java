/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.CrowdFunding.CFRCaseDirectory;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
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
        
       // for(WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
         for(WorkRequest request : CaseOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
   
  /*   public void populateSecTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }*/
   public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) CFRFinanceWorkReqJTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
          //  String result = ((LabTestWorkRequest) request).getTestResult();
           // row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }



    
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("CASE MANAGER WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 20, 204, 26));

        jLabel2.setText("WORK QUEUE (NEW CASES)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 78, 156, 24));

        CFRFinanceWorkReqJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CASE ID", "PATIENT", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CFRFinanceWorkReqJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 636, 125));

        jButton1.setText("ADD CASE DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 204, -1));

        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        CFRCaseWorkQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(CFRCaseWorkQueueJTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 120, 636, 125));

        jLabel3.setText("WORK REQUEST (FINANCE FELLOW)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 200, -1));
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
        
         
        
      /*  AddCasedetailsJPanel AddCasedetailsJPanel = new AddCasedetailsJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("AddCasedetailsJPanel", AddCasedetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
*/

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CFRCaseWorkQueueJTable1;
    private javax.swing.JTable CFRFinanceWorkReqJTable1;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}