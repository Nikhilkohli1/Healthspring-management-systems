/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BloodBankStaff.getValue())){
            organization = new BloodBankStaffOrganization();
            organizationList.add(organization);
        }
        // create Appointment manager 
        else if (type.getValue().equals(Type.AppointmentManager.getValue())){
            organization = new AppointmentManager();
            organizationList.add(organization);
        }
        return organization;
    }
    
     /*  public Organization createBloodBankOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.BloodBankStaff.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        return organization;
    }*/
}