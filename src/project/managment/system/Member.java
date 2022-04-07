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
public abstract class Member extends Object{
    
    private String address;
    private String phone;
    private String email; 
    private String password;
    private String jobTitle; 


    
     Member(int id, String name,String address,String phone,String email,String jobTitle, String password) {
        super.setId(id);
        super.setName(name);
        this.password=password;
        this.jobTitle= jobTitle;
        this.email=email;
        this.phone=phone;
        this.address=address;
        
    }
      public abstract void register(Member m) ;
    
     
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
   
}
