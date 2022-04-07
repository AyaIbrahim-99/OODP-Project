/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

import static project.managment.system.Helper.arrMember;

/**
 *
 * @author Abo El-Ata
 */
public class memberFactory {
    public Member getMember(String memberType, int id, String name, String address, String phone, String email, String jobTitle, String password)
    {
        if(memberType.equals("Manager")){
            Manager m = new Manager(id,name, address, phone, email, jobTitle, password);
            Helper.arrManager.add(m);
            arrMember.add(m);
            return m;

        }
        else if(memberType.equals("Team member")){
            teamMember t = new teamMember(id,name, address, phone, email, jobTitle, password);
             Helper.arrTeamMember.add(t);
             arrMember.add(t);
           return t;

        }
        return null;
        
    }
    
    public Member getMember(boolean x ,String memberType, int id, String name, String address, String phone, String email, String jobTitle, String password)
    {
        if(memberType.equals("Manager")){ 
            return new Manager(id,name, address, phone, email, jobTitle, password);
        }
        
        else if(memberType.equals("Team member")){
           return new teamMember(id,name, address, phone, email, jobTitle, password);
        }
        return null;
        
    }
    
}
