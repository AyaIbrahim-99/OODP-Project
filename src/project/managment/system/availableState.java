/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

/**
 *
 * @author Abo El-Ata
 */
public class availableState implements State{

    @Override
    public void doAction(Resource r) {
       r.setState(this);
    }
    public boolean isreserved(){
        return false;
    }
    
}
