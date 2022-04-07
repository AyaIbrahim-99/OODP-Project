/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

import java.util.ArrayList;
import static project.managment.system.Helper.arrMember;

/**
 *
 * @author Abo El-Ata
 */
public class Manager extends Member {

    public Manager(int id, String name, String address, String phone, String email, String jobTitle, String password) {
        super(id, name, address, phone, email, jobTitle, password);
    }
    
    private ArrayList<ProjectCommands> PClist = new ArrayList<>();
 
    public void TakeCommand(ProjectCommands PC)
    {
        this.PClist.add(PC);
    }
    public void PlaceCommand()
    {
        for (int i=0;i<PClist.size();i++)
        {
            PClist.get(i).execute();
        }
        PClist.clear();
    }
    public static void editTeamMember(Member t, int index){
        Helper.arrTeamMember.set(index,t);
        for (int j = 0; j < Helper.arrMember.size(); j++) {
            if(Helper.arrTeamMember.get(index).getId()==Helper.arrMember.get(j).getId()){
                Helper.arrMember.set(j, t);
            }
        }
    }
    public static void deleteTeamMember(int i){
        Helper.arrTeamMember.remove(i);
    }
     public static void addResource(Resource r)
    {
        Helper.arrResource.add(r);
    }
     public static void addTask(Task t)
    {
        Helper.arrTask.add(t);
    }
      public static void deleteTask(int t)
    {
        Helper.arrTask.remove(t);
    }

    @Override
    public void register(Member m) {
         
            Helper.arrManager.add(m);
            arrMember.add(m);
    }
     
    
    
    
}
