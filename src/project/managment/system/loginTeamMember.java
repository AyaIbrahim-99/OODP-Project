/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

/**
 *
 * @author Aya Ebrahim
 */
public class loginTeamMember implements Strategy {
    public boolean Login(int id, String pass, int mIndex)
    {
        for(int i =0;i<Helper.arrTeamMember.size();i++)
        {
            if(Helper.arrTeamMember.get(i).getId()== id)
            { 
                if(Helper.arrTeamMember.get(i).getPassword().equals(pass))
                {
                    Helper.memberindex=mIndex;
                    return true;

                }
            }    
        }       
        
        return false;
    
    }
}
