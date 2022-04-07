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
public class Project extends Object{
    
    private int depId;

    public Project(int depId,int id , String name) {
        this.depId = depId;
        super.setId(id);
        super.setName(name);
        
    }
    public Project() {
        this.depId =0;
        super.setId(0);
        super.setName("");
        
    }
    public int getDepId() {
        return depId;
    }
    
   
}
