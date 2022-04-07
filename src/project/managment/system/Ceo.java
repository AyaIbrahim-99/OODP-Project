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
public class Ceo {
    private final int id = 1;
    private final String password = "123123";
    private static Ceo instance = new Ceo();
    
    public static Ceo getInstance (){
    return instance;
    }
    
    public void addDep(Department d)
    {
        Helper.arrDepartment.add(d);
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    public void editDep(int index ,Department d)
    {
        Helper.arrDepartment.set(index , d);

    }
    public void deleteDep(int index)
    {
        Helper.arrDepartment.remove(index);
    }
    public void editManager(int i ,Member m)
    {
        Helper.arrManager.set(i,m);
        for (int j = 0; j < Helper.arrMember.size(); j++) {
            if(Helper.arrManager.get(i).getId()==Helper.arrMember.get(j).getId()){
                Helper.arrMember.set(j, m);
            }
        }
    }
    public void deleteManager(int m)
    {
        Helper.arrManager.remove(m);
    }
    
}
