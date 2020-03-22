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
public class physician extends person {
    private int age;
    private double salary;
    final static double baseSalary = 3000;
    private Vector<user> patients;
    static int physno = 0;
    private String id;
    physician(String firstN, String lastN, String userpass, String mail,int age){
      super(firstN, lastN,userpass, mail );
      physno ++;
      id = new String("P"+physno);
      salary = baseSalary;
      this.age = age;
    } 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raise(double raise){
        salary += raise;
    }
    public Vector getPatients() {
        return patients;
    }

    public void setPatients(Vector patients) {
        this.patients = patients;
    }

    public static int getPhysno() {
        return physno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Object getUser(int index){
        return patients.elementAt(index);
    }
}
