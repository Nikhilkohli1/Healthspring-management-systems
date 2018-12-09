/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CrowdFunding.CFRFundingOrgsDirectory;
import Business.CrowdFunding.CFRFundsReceivedDirectory;
import Business.CrowdFunding.CFRPartnerBanksDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.AppointmentManagerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Vaccine.VaccineDetailsDirectory;
import Business.Vaccine.VaccineInventoryDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
   // added for Funding Orgs data
    private CFRFundingOrgsDirectory cfrFundingDir;
    private CFRFundsReceivedDirectory cfrFundsReceivedDir;
    private CFRPartnerBanksDirectory cfrPartnerBanksDir;
    private VaccineDetailsDirectory vaccineDetailsDir;
    private VaccineInventoryDirectory vaccineInvDir;
    
    private int organizationID;
    private static int counter=0;

    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"), 
        Lab("Lab Organization"),
        Patient("Patient Organization"), 
       // VaccineAdmin("Vaccine Centre Admin"),
        BloodBankStaff("BloodBankStaff"),
        VaccineManager("Vaccine Organization"),
       // CFRAdmin("CFR Admin Organization"), 
        CampaignOrganizer("Campaign Organization"),
        FinanceFellow("Finance Fellow Organization"), 
        TerminalCasesManager("Terminal Cases Organization"),
        AppointmentManager("Manage Patient Appointments"),
        CFRStrategist("CFR Strategist Organization"),
        MakeADifference("Make A Diff Organization"),
       // VaccineManager("Vaccine Manager"),
        VaccineLogisticsManager("Vaccine Logistics"),
        VaccineInventoryManager("Vaccine Inventory ");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
         this.name = name;
         workQueue = new WorkQueue();
         employeeDirectory = new EmployeeDirectory();
         userAccountDirectory = new UserAccountDirectory();
         patientDirectory = new PatientDirectory();
         cfrFundingDir = new CFRFundingOrgsDirectory ();
         cfrFundsReceivedDir = new CFRFundsReceivedDirectory();
         cfrPartnerBanksDir = new CFRPartnerBanksDirectory();
         organizationID = counter;
         vaccineDetailsDir = new VaccineDetailsDirectory();
         vaccineInvDir = new VaccineInventoryDirectory();
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    
        
    }

    public VaccineInventoryDirectory getVaccineInvDir() {
        return vaccineInvDir;
    }
    
    

    public VaccineDetailsDirectory getVaccineDetailsDir() {
        return vaccineDetailsDir;
    }
    
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public CFRFundingOrgsDirectory getCfrFundingDir() {
        return cfrFundingDir;
    }

    public CFRFundsReceivedDirectory getCfrFundsReceivedDir() {
        return cfrFundsReceivedDir;
    }

    public CFRPartnerBanksDirectory getCfrPartnerBanksDir() {
        return cfrPartnerBanksDir;
    }
    
    
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
