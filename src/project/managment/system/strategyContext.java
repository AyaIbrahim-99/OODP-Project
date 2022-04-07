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
public class strategyContext {
    private Strategy s;

    public strategyContext( Strategy s){
        this.s = s;
    }

    public boolean strategyLogin(int id, String pass, int mIndex)
    {
        return s.Login(id, pass, mIndex);
    }
    
}
