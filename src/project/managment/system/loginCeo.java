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
public class loginCeo implements Strategy{
   
    Ceo c = Ceo.getInstance();
    public boolean Login(int id, String pass, int mIndex)
    {
        if(id==c.getId()){
            if(c.getPassword().equals(pass))
                return true;
        }
        return false;
    
    }
}   
