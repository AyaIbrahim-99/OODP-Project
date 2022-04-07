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
public interface Strategy {
    
    public boolean Login(int id, String passwrod, int mIndex);
}
