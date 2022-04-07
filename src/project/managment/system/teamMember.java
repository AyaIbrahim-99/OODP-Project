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
public class teamMember extends Member{

    public teamMember(int id, String name, String address, String phone, String email, String jobTitle, String password) {
        super(id, name, address, phone, email, jobTitle, password);
    }
    
    public static void logTaskProgress( int index , String status)
    {
        if(status.equals("Done"))
            Helper.arrTask.get(index).setStatus("In progress");
        else
            Helper.arrTask.get(index).setStatus("Done");

       
    }

    @Override
    public void register(Member t) {
             Helper.arrTeamMember.add(t);
             arrMember.add(t);
    }
    
}
