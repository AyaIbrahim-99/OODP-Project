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
public class delete implements ProjectCommands{

    Project proj;
    public delete(Project p)
    {
        this.proj=p;
    }
    @Override
    public void execute() {
        for(int i=0;i<Helper.arrProjects.size();i++)
        {
            if (proj.getId()==Helper.arrProjects.get(i).getId())
            {
               
                Helper.arrProjects.remove(i);
                break;

            }
            
        }

    }
    
}
