/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abo El-Ata
 */
public class Helper {
    public static  ArrayList<Member> arrTeamMember = new ArrayList<>();
    public static  ArrayList<Member> arrManager = new ArrayList<>();
    public static  ArrayList<Department> arrDepartment = new ArrayList<>();
    public static  ArrayList<Project> arrProjects = new ArrayList<>();
    public static  ArrayList<Task> arrTask = new ArrayList<>();
    public static  ArrayList<Resource> arrResource = new ArrayList<>();
    public static  ArrayList<Member> arrMember = new ArrayList<>();
    public static  ArrayList<Manager> Managerlist= new ArrayList<>();
    public static  int memberindex;
   
     
    public static void readResource() {
        java.io.File file4 = new java.io.File("Resources.txt");
        Scanner input;
        int counter = 0;
        try {
            input = new Scanner(file4);
            counter = 0;
            Resource r;
            
            while (input.hasNext()) {
                int id = Integer.valueOf(input.nextLine());
                String name = input.nextLine();
                String res = input.nextLine();
                if(res.equals("r")){
                    r = new Resource(id, name);
                    r.setState(new reservedState());
                }
                else{
                      r = new Resource(id, name);
                      r.setState(new availableState());

                }
                arrResource.add(r);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void readTask() {
        java.io.File file4 = new java.io.File("Tasks.txt");
        Scanner input;
        int counter = 0;
        try {
            input = new Scanner(file4);
            counter = 0;
            Task t;
            while (input.hasNext()) {
                int Taskid = Integer.valueOf(input.nextLine());
                int projectId = Integer.valueOf(input.nextLine());
                String title = input.nextLine();
                Date fromDate=null ;
                try {
                    fromDate=  new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());
                } catch (ParseException ex) {
                    Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
                }
                Date toDate=null;
                try {
                    toDate = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());
                } catch (ParseException ex) {
                    Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
                }
                String[] memberId = input.nextLine().split(",");
                String[] resourcesId = input.nextLine().split(",");
                String status = input.nextLine();

                t = new Task(Taskid, projectId,title,fromDate,toDate,memberId,resourcesId,status);
                arrTask.add(t);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void readDep() {
        java.io.File file4 = new java.io.File("Department.txt");
        Scanner input;
        int counter = 0;
        try {
            input = new Scanner(file4);
            counter = 0;
            Department d;
            while (input.hasNext()) {
                int id = Integer.valueOf(input.nextLine());
                String name = input.nextLine();
                
                
                d = new Department(id, name);
                arrDepartment.add(d);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }  
    public static void readMembers() {
        java.io.File file4 = new java.io.File("Members.txt");
        Scanner input;
        int counter = 0;
        try {
            input = new Scanner(file4);
            counter = 0;
            memberFactory s=new memberFactory();
            Member m ;
            while (input.hasNext()) {
                int id = Integer.valueOf(input.nextLine());
                String name = input.nextLine();
                String address = input.nextLine();
                String phone = input.nextLine();
                String email = input.nextLine();
                String jobTitle = input.nextLine();
                String password = input.nextLine();
                m = s.getMember(jobTitle,id, name,address,phone,email,jobTitle , password);                 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void readProjects() {
        java.io.File file4 = new java.io.File("project.txt");
        Scanner input;
        int counter = 0;
        try {
            input = new Scanner(file4);
            counter = 0;
            Project p;
            while (input.hasNext()) {
                int id = Integer.valueOf(input.nextLine());
                int Depid = Integer.valueOf(input.nextLine());
                String name = input.nextLine();
                p = new Project(Depid,id,name);
               
                arrProjects.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeProjects(){
          try {
            File file = new File("Project.txt");
            PrintWriter pw = new PrintWriter(file);

            pw = new PrintWriter(file);

            for (int i = 0; i < Helper.arrProjects.size(); i++) {
                Project temp2 = Helper.arrProjects.get(i);
                pw.println(String.valueOf(temp2.getId()));
                pw.println(String.valueOf(temp2.getDepId()));
                pw.println(temp2.getName());
            }
            pw.close();

        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    public static void writeResource(){
          try {
            File file = new File("Resources.txt");
            PrintWriter pw = new PrintWriter(file);
            pw = new PrintWriter(file);
            availableState s = new availableState();
            for (int i = 0; i < arrResource.size(); i++) {
                pw.println(String.valueOf(arrResource.get(i).getId()));
                pw.println(arrResource.get(i).getName());
            if(Helper.arrResource.get(i).getState().getClass()== s.getClass())
                    pw.println("a");
            else
                    pw.println("r");
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    public static void writeTask(){
          try {
            File file = new File("Tasks.txt");
            PrintWriter pw = new PrintWriter(file);
            pw = new PrintWriter(file);
            for (int i = 0; i < arrTask.size(); i++) {
                pw.println(String.valueOf(arrTask.get(i).getId()));
                pw.println(String.valueOf(arrTask.get(i).getProjectId()));
                pw.println(arrTask.get(i).getName());
                Date d=arrTask.get(i).getFromDate();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                pw.println(dateFormat.format(arrTask.get(i).getFromDate()));
                pw.println(dateFormat.format(arrTask.get(i).getToDate()));
                String temp="";
                String[]memberId=arrTask.get(i).getMemberId();
                for(int k=0;k<memberId.length;k++)
                {
                    if(k==memberId.length)
                        temp+=memberId[k];
                    else
                        temp+=memberId[k]+",";
                    
                }
                pw.println(temp);
                temp="";
                String[]resourceId=arrTask.get(i).getResourcesId();
                for(int k=0;k<resourceId.length;k++)
                {
                    if(k==resourceId.length)
                        temp+=resourceId[k];
                    else
                        temp+=resourceId[k]+",";
                }
                pw.println(temp);
                pw.println(arrTask.get(i).getStatus());
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    public static void writeDep(){
          try {
            File file = new File("Department.txt");
            PrintWriter pw = new PrintWriter(file);
            pw = new PrintWriter(file);
            for (int i = 0; i < arrDepartment.size(); i++) {
                pw.println(String.valueOf(arrDepartment.get(i).getId()));
                pw.println(arrDepartment.get(i).getName());
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    public static void writeMember() {
        try {
            File file = new File("Members.txt");
            PrintWriter pw = new PrintWriter(file);

            pw = new PrintWriter(file);

            for (int i = 0; i < Helper.arrMember.size(); i++) {
                Member temp2 = Helper.arrMember.get(i);
                pw.println(String.valueOf(temp2.getId()));
                pw.println(temp2.getName());
                pw.println(temp2.getAddress());
                pw.println(temp2.getPhone());
                pw.println(temp2.getEmail());
                pw.println(temp2.getJobTitle());
                pw.println(temp2.getPassword());
            }
            pw.close();
            //display();
            

        }// try
        catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void writeAllFiles(){
        writeMember();
        writeDep();
        writeResource();
        writeTask();
        writeProjects();
    }
}
