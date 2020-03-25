/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class user extends person {
    private String id, pid, state;
    static int userno = 0;
    private int age;
    private double weight, height, bmi,goalM;
    private boolean goalT;
    private int xp ;
    private Vector track;
    private boolean active = false;
    private double requiredWater;
    private double actualWater;
    
     user(String firstN, String lastN, String userpass, String mail, int age , double weight , double height ){
      super(firstN, lastN,userpass, mail );
      this.age = age;
      this.weight = weight;
      this.height = height;
      bmi = weight/(height*height);
      userno++;
      id = new String("U"+userno);
      track.add(weight);
      requiredWater = weight/30;
     }

    public void water_Ex(int ex)
    {
        requiredWater = weight/30;
        requiredWater += 0.35*ex;
    }
    public void water_Drink(double amount)
    {
        actualWater += amount;
        water_Compare();
    }
    public double water_Compare()
    {
        return (actualWater/requiredWater)*100;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public static int getUserno() {
        return userno;
    }

    public static void setUserno(int userno) {
        user.userno = userno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        track.add(weight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getGoalM() {
        return goalM;
    }

    public void setGoalM() {
        goalM = Math.abs((25*(height*height))-weight);
    }

    public boolean isGoalT() {
        return goalT;
    }

    public void setGoalT() {
        if(bmi > 25)
            goalT = true;
        else
            goalT = false;
            
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    public void incXp(int x) {
        xp  += x;
    }
    public String getState(){
        return state;
    }
    public void setState(){
        if(bmi <20)
            state = "Underweight";
        if(bmi<=25)
            state = "Fit";
        if(bmi < 30)
            state = "Overweight";
        if(bmi < 35)
            state = "Obese";
        else
            state = "Severely obese";
    }
    
    public Vector getTrack(){
        return track;
    }
    public void activate(){active = true;}
}
