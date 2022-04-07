/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

/**
 *
 * @author Rana
 */
public class Edit implements ProjectCommands{

    Project proj;
    public Edit(Project p)
    {
        this.proj=p;
    }
    @Override
    public void execute() {
             
       Helper.arrProjects.set(ManageProject.editIndex, proj);
              
    }
    
}
