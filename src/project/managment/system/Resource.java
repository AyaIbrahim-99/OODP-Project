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
public class Resource extends Object {
    
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public Resource(int id ,String name ) { 
        this.state=new availableState();
        super.setId(id);
        super.setName(name);
    }

   
}
