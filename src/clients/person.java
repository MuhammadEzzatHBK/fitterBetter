/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

/**
 *
 * @author lenovo
 */
public abstract class person {
    private String firstN;
    private String lastN;
    private String userpass;
    private String mail;
    
    person(String firstN, String lastN, String userpass, String mail ){
        this.firstN = firstN;
        this.lastN = lastN;
        this.userpass = userpass;
        this.mail = mail;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
