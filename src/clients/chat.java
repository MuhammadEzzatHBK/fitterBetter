/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import java.util.ArrayList;

/**
 *
 * @author Sara-Labtop
 */
public class chat {
    String id,pid;
    ArrayList<String> msgs=new ArrayList<String>();
    public chat(String id,String pid){
        this.id=id;
        this.pid=pid;
    }
    public void sendmsg(String m){
        msgs.add(m);
    }
    public void viewmsg(){
        for(int i=0;i<msgs.size();i++){
            msgs.get(i);
        }
    }
    
}
