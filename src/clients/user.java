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
public class user extends person {
    private String id, pid, state;
    static int userno = 0;
    private int age;
    private double weight, height, bmi,goalM;
    private boolean goalT;
    private int xp ;
    private ArrayList<String> track=new ArrayList<String>();
    private boolean active = false;
    private chat currentchat;
     user(String firstN, String lastN, String userpass, String mail, int age , double weight , double height ){
      super(firstN, lastN,userpass, mail );
      this.age = age;
      this.weight = weight;
      this.height = height;
      bmi = weight/(height*height);
      userno++;
      id = "U"+userno;
     track.add(String.valueOf(weight));
     }
     public void getchat(ArrayList<chat> Allchats)
     {
         for(int i=0;i<Allchats.size();i++)
         {
            if(Allchats.get(i).id.equals(id))
                currentchat=Allchats.get(i);
         }
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

     

    public void setWeight(double weight) {
        this.weight = weight;
       track.add(String.valueOf(weight));
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

    public void setBmi() {
       double h=(height*height);
      bmi=(weight/h)*10000;
        
    }

    public double getGoalM() {
        return goalM;
    }

    public void setGoalM() {
      double temp;
      double h=(height*height);
        setGoalT();
       if(goalT)
          temp=bmi-25;
       else temp=25-bmi;
       goalM=(temp/10000)*h;
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
    
    public ArrayList<String> getTrack(){
        return track;
    }
    public void activate(){active = true;}
    
    
}

