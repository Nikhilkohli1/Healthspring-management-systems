/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VaccinationCentre;

import Business.Organization.Organization;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.Role.VaccineManagerRole;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class VaccineOrganization extends Organization{
    

    public VaccineOrganization() {
        super(Organization.Type.VaccineManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineManagerRole());
        return roles;
    }
     
    
}

    

