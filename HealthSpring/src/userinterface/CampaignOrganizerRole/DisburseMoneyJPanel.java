/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CampaignOrganizerRole;

import Business.CrowdFunding.CFRCaseDirectory;
import Business.CrowdFunding.CFRFundsReceivedDirectory;
import Business.CrowdFunding.CFRPartnerBanks;
import Business.CrowdFunding.CFRPartnerBanksDirectory;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFundsReceivedWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JPanel;
//import opencsv.CSVWriter;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;


/**
 *
 * @author nikhi
 */
public class DisburseMoneyJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private CFRPartnerBanksDirectory cfrPartnerBanksDir;
    private CFRFundsReceivedDirectory cfrFundsrecDir;
    //private CFRFundsReceivedWorkRequest request;
    private CampaignOrganization campaignOrganization;
    //private static final String STRING_ARRAY_SAMPLE = "./string-array-sample.csv";
     private CFRPartnerBanksDirectory partnerbanksDir;
     private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
     Date date = new Date();
     private ButtonGroup bg1= new ButtonGroup();
    

  
    
    public DisburseMoneyJPanel(JPanel userProcessContainer,  UserAccount account, Enterprise enterprise,CampaignOrganization organization) throws IOException {
        initComponents();
          this.userProcessContainer = userProcessContainer;
      //  this.request = request;
        this.enterprise = enterprise;
        this.campaignOrganization = organization;
        this.userAccount = account;
        this.cfrFundsrecDir = organization.getCfrFundsReceivedDir();
        this.cfrPartnerBanksDir = organization.getCfrPartnerBanksDir();
       populateBanksCombo();
       groupbutton();
        
    }

  private void populateBanksCombo(){
        payeejComboBox1.removeAllItems();
        
        for ( CFRPartnerBanks banks : cfrPartnerBanksDir.getpartnerBankList()){
        payeejComboBox1.addItem(banks);
        }
  }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        payeejComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bnametxt = new javax.swing.JTextField();
        ifsctxt = new javax.swing.JTextField();
        accnumtxt = new javax.swing.JTextField();
        brnametxt = new javax.swing.JTextField();
        accnametxt = new javax.swing.JTextField();
        filepathlbl = new javax.swing.JLabel();
        bemailtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DisAllFundsjRadioButton1 = new javax.swing.JRadioButton();
        DisResplFundsjRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("DISBUSEMENT OF FUNDS");

        backbtn.setBackground(new java.awt.Color(255, 102, 102));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("SELECT BANK");

        payeejComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        payeejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeejComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DISBURSE FUNDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("BANK NAME");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("IFSC CODE");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("BRANCH NAME");

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("CFR ACCOUNT NUMBER");

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("ACC HOLDER NAME");

        filepathlbl.setForeground(new java.awt.Color(255, 102, 102));

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("BANK EMAIL");

        DisAllFundsjRadioButton1.setText("DISBURSE ALL PENDING FUNDS(IRRESPECTIVE OF THE ACCOUNT)");

        DisResplFundsjRadioButton1.setText("DISBURSE ONLY RESPECTIVE ACCOUNT FUNDS");

        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("CHOOSE DISBURSEMENT OPTION: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filepathlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisResplFundsjRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisAllFundsjRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(361, 361, 361)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bemailtxt)
                                    .addComponent(brnametxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(payeejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ifsctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(accnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisAllFundsjRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(DisResplFundsjRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ifsctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accnametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(filepathlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 148, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CampaignOrganizerWorkAreaJPanel comjp = (CampaignOrganizerWorkAreaJPanel) component;
        comjp.populateTable();
        comjp.populateDisburseTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void payeejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeejComboBox1ActionPerformed
        CFRPartnerBanks banks = (CFRPartnerBanks)payeejComboBox1.getSelectedItem();
        bnametxt.setText(banks.getBankname());
        brnametxt.setText(banks.getBranchname());
        ifsctxt.setText(String.valueOf(banks.getIfsc()));
        accnametxt.setText(banks.getAccount_name());
        accnumtxt.setText(String.valueOf(banks.getAccount_num()));
        bemailtxt.setText(banks.getBank_email());
    }//GEN-LAST:event_payeejComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(DisAllFundsjRadioButton1.isSelected()){
    
        try {
              for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Awaiting Disbursement"))
            {
             // TODO add your handling code here:
             request.setPartner_bank(bnametxt.getText());
             request.setBank_email(bemailtxt.getText());
             request.setIfsc(Integer.parseInt(ifsctxt.getText()));
             request.setBank_email(bemailtxt.getText());
             request.setCfr_AccHolder_Name(accnametxt.getText());
             
             }
              }
             populatetxtfile();
         } catch (IOException ex) {
             Logger.getLogger(DisburseMoneyJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
         if(DisResplFundsjRadioButton1.isSelected()){
         try {
              for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Awaiting Disbursement") && request.getCfr_acc_num() == Long.parseLong(accnumtxt.getText()) )
            {
             // TODO add your handling code here:
             request.setPartner_bank(bnametxt.getText());
             request.setBank_email(bemailtxt.getText());
             request.setIfsc(Integer.parseInt(ifsctxt.getText()));
             request.setBank_email(bemailtxt.getText());
             request.setCfr_AccHolder_Name(accnametxt.getText());
             }
              }
             populatecsvfile();
         } catch (IOException ex) {
             Logger.getLogger(DisburseMoneyJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed
 public void populatetxtfile() throws IOException {
   
     try {
         
         File file = new File("HealthSpring_CFR_Disbursed_Funds_" +sdf.format(date) + ".csv");
            file.setWritable(true);
            file.setReadable(true);
         String File_Name = "HealthSpring_CFR_Disbursed_Funds_" +sdf.format(date) + ".csv";
        FileWriter writer = new FileWriter(file, true);
         //FileWriter writer = new FileWriter(file);
     
            writer.write("From Bank");
            writer.write(",");
            writer.write("CFR Account Num");
            writer.write(",");
            writer.write("IFSC");
            writer.write(",");
            writer.write("Account Holder");
            writer.write(",");
            writer.write("Amount");
            writer.write(",");
            writer.write("Category");
            writer.write(",");
            writer.write("Reference Num");
            writer.write(","); 
            writer.write("To Bank");
            writer.write(",");
            writer.write("To Account Num");
            writer.write(",");
            writer.write("To Account Holder");
            writer.write(",");
            writer.write("Date");
           
           
            writer.write("\r\n");   // write new line
           // writer.
           
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            //if (request.getStatus() == "Awaiting Disbursement") {
        if (request.getStatus().equalsIgnoreCase("Awaiting Disbursement"))
            {
           // FileWriter writer = new FileWriter("N:/AED FInal Project/MyFile.txt", true);
            writer.write(request.getPartner_bank());
            writer.write(",");
            writer.write(String.valueOf(request.getCfr_acc_num()));
            writer.write(",");
            writer.write(String.valueOf(request.getIfsc()));
            writer.write(",");
            writer.write(request.getCfr_AccHolder_Name());
            writer.write(",");
            writer.write(String.valueOf(request.getCost()));
            writer.write(",");
            writer.write(request.getCategory());
            writer.write(",");
            writer.write(String.valueOf(request.getRefnum()));
            writer.write(",");
            writer.write(request.getB_name());
            writer.write(",");
            writer.write(String.valueOf(request.getAcc_num()));
            writer.write(",");
            writer.write(request.getPatient());
            writer.write(",");
            writer.write(String.valueOf(date));
            writer.write("\r\n");   // write new line
            
            
            request.setStatus("Funds Disbursed");
            
            //}
        }
        }
         filepathlbl.setText("The output file for the Disbursement has been created at below path :\n " +file.getAbsolutePath()+".csv");
       
         writer.close();
       
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 }
 
 public void populatecsvfile() throws IOException {
   
     try {
         
         File file = new File("HealthSpring_CFR_Disbursed_Funds_" +sdf.format(date) + ".csv");
            file.setWritable(true);
            file.setReadable(true);
         String File_Name = "HealthSpring_CFR_Disbursed_Funds_" +sdf.format(date) + ".csv";
        FileWriter writer = new FileWriter(file, true);
         //FileWriter writer = new FileWriter(file);
     
            writer.write("From Bank");
            writer.write(",");
            writer.write("CFR Account Num");
            writer.write(",");
            writer.write("IFSC");
            writer.write(",");
            writer.write("Account Holder");
             writer.write(",");
            writer.write("Amount");
            writer.write(",");
            writer.write("Category");
            writer.write(",");
            writer.write("Reference Num");
            writer.write(",");
            
            writer.write("To Bank");
            writer.write(",");
            writer.write("To Account Num");
            writer.write(",");
            writer.write("To Account Holder");
            writer.write(",");
            writer.write("Date");
           
           
            writer.write("\r\n");   // write new line
           // writer.
           
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            //if (request.getStatus() == "Awaiting Disbursement") {
                     if (request.getStatus().equalsIgnoreCase("Awaiting Disbursement") && request.getCfr_acc_num() == Long.parseLong(accnumtxt.getText()) )
            {
       
           // FileWriter writer = new FileWriter("N:/AED FInal Project/MyFile.txt", true);
            writer.write(request.getPartner_bank());
            writer.write(",");
            writer.write(String.valueOf(request.getCfr_acc_num()));
            writer.write(",");
            writer.write(String.valueOf(request.getIfsc()));
            writer.write(",");
            writer.write(request.getCfr_AccHolder_Name());
            writer.write(",");
            writer.write(String.valueOf(request.getCost()));
            writer.write(",");
            writer.write(request.getCategory());
            writer.write(",");
            writer.write(String.valueOf(request.getRefnum()));
            writer.write(",");
            writer.write(request.getB_name());
            writer.write(",");
            writer.write(String.valueOf(request.getAcc_num()));
            writer.write(",");
            writer.write(request.getPatient());
            writer.write(",");
            writer.write(String.valueOf(date));
            writer.write("\r\n");   // write new line
            
            
            request.setStatus("Funds Disbursed");
            
            //}
        }
        }
         filepathlbl.setText("The output file for the Disbursement has been created at below path :\n " +file.getAbsolutePath()+".csv");
       
         writer.close();
       
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 }
   
 // emailing code 
    public void groupbutton(){
   // ButtonGroup bg1= new ButtonGroup();
    DisAllFundsjRadioButton1.setActionCommand("DisAllFundsjRadioButton1");
    bg1.add(DisAllFundsjRadioButton1);
    
    DisResplFundsjRadioButton1.setActionCommand("DisResplFundsjRadioButton1");
    bg1.add(DisResplFundsjRadioButton1);
    
    
    }
 //DisAllFundsjRadioButton1
//DisResplFundsjRadioButton1
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DisAllFundsjRadioButton1;
    private javax.swing.JRadioButton DisResplFundsjRadioButton1;
    private javax.swing.JTextField accnametxt;
    private javax.swing.JTextField accnumtxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bemailtxt;
    private javax.swing.JTextField bnametxt;
    private javax.swing.JTextField brnametxt;
    private javax.swing.JLabel filepathlbl;
    private javax.swing.JTextField ifsctxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox payeejComboBox1;
    // End of variables declaration//GEN-END:variables
}
