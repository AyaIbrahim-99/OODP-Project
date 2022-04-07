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
public class ProjectManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Helper.readMembers();
        Helper.readDep();
        Helper.readTask();
        Helper.readResource();
        Helper.readProjects();

        Home h = new Home();
        h.show();      
        Runtime.getRuntime().addShutdownHook(new Thread() {

    @Override
    public void run() {
        Helper.writeAllFiles();
    }

});

    }
    
}
