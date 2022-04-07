/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.managment.system.Helper;
import project.managment.system.Project;
import project.managment.system.ProjectCommands;

/**
 *
 * @author Rana
 */
public class Add implements ProjectCommands {

    Project proj;

    Add(Project p) {
        proj=p;
       // Helper.arrProjects.add(proj);
    }
       
    @Override
    public void execute()
    {
     Helper.arrProjects.add(proj);
     
     //Helper.add_editProjects(projectsList);
    
    }
//  public void execute(int id, int depid,String name) {
//        
//        Project p = new Project();
//        p.setDepId(depid);
//        p.setID(id);
//        p.setName(name);
//
//              projectsList.add(p);
//              help.add_editProjects(projectsList);
//           
//    }
    
}
