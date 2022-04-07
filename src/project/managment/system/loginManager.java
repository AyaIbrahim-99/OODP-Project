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
public class loginManager implements Strategy{
    
    public boolean Login(int id, String pass, int mIndex)
    {
        for(int i =0;i<Helper.arrManager.size();i++)
        {
            if(Helper.arrManager.get(i).getId()== id)
            { 
                if(Helper.arrManager.get(i).getPassword().equals(pass))
                {
                    Helper.memberindex=mIndex;
                    return true;

                }
            }    
        }       
        
        return false;

    }
}
