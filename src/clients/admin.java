/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class admin extends person {
    private String id;
    private static Vector<user> users;
    private static Vector<physician> phys;
    private static int adminno = 0;
    
            
    admin(String firstN, String lastN, String userpass, String mail){
      super(firstN, lastN,userpass, mail );
      adminno++;
      id = new String("A"+adminno);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Vector getUsers() {
        return users;
    }

    public static void setUsers(Vector users) {
        admin.users = users;
    }

    public static Vector getPhys() {
        return phys;
    }

    public static void setPhys(Vector phys) {
        admin.phys = phys;
    }

    public static int getAdminno() {
        return adminno;
    }

    public static void setAdminno(int adminno) {
        admin.adminno = adminno;
    }
    
    public Object getUser(int index){
        return (users.elementAt(index));
    }
    public Object getPhysician(int index){
        return (phys.elementAt(index));
    }
    public void addUser(user X){
       users.add(X);
       int min = phys.elementAt(0).getPatients().size();
       int minindex = 0;
       for(int i =0;i<phys.size();i++){
          if(phys.elementAt(i).getPatients().size() < min){
            min = phys.elementAt(i).getPatients().size();
            minindex=i;
          }
       }
       phys.elementAt(minindex).getPatients().add(X);
       X.setPid(phys.elementAt(minindex).getId());
    }
    public void addPhysician(physician X){
        phys.add(X);
    }
    public void removeUser(String id){
        int uremoval = -1;
        int premoval = -1;
        int puremoval = -1;
        for(int i = 0;i<users.size();i++){
        if(users.elementAt(i).getId() == id)
            uremoval = i;
        }
        if(uremoval == -1)
            return;
        for(int i = 0;i<phys.size();i++){
          Vector<user> X = phys.elementAt(i).getPatients();
          for(int j = 0; j<X.size();j++){
              if(X.elementAt(j).getId()==id){
              premoval = i;    
              puremoval = j;
              }
                  
          }
        }
        if(premoval == -1 || puremoval == -1)
            return;
        phys.elementAt(premoval).getPatients().removeElementAt(puremoval);
        users.removeElementAt(uremoval);
      
    }
    public void removePhysician(String id){
       int removal = -1;
    for(int i=0;i<phys.size();i++){
        if(phys.elementAt(i).getId()==id)
            removal = i;
    }
    if(removal == -1)
        return;
    for(int i=0;i<phys.elementAt(removal).getPatients().size();i++){
       int min = phys.elementAt(0).getPatients().size();
       int minindex = 0;
       for(int j =0;j<phys.size();j++){
          if(phys.elementAt(j).getPatients().size() < min){
            min = phys.elementAt(j).getPatients().size();
            minindex=j;
          }
       }
       phys.elementAt(minindex).getPatients().addElement(phys.elementAt(removal).getPatients().elementAt(i));
       int x = phys.elementAt(minindex).getPatients().size();
       user added = (user)phys.elementAt(minindex).getPatients().elementAt(x-1);
       added.setPid(phys.elementAt(minindex).getId());
    }
    phys.removeElementAt(removal);
    
    }
    public void activate(String userid){
        for(int i=0;i<users.size();i++){
        if(users.elementAt(i).getId().equals(userid))
            users.elementAt(i).activate();
        }
    }
    public Vector<user> searchUsers(String n){
    Vector<user>target = new Vector();
    for(int i=0;i<users.size();i++){
        if(users.elementAt(i).getFirstN().contains(n)||users.elementAt(i).getLastN().contains(n))
            target.add(users.elementAt(i));
    }
    return(target);
    }
    public Vector<physician> searchPhys(String n){
     Vector<physician>target = new Vector();
    for(int i=0;i<phys.size();i++){
        if(phys.elementAt(i).getFirstN().contains(n)||phys.elementAt(i).getLastN().contains(n))
            target.add(phys.elementAt(i));
    }
    return(target);
    
    }
}
