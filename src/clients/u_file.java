/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class u_file {
    
    public void write(user u){
       try {
			FileOutputStream f = new FileOutputStream(new File("usersfile.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(u);
			

			o.close();
			f.close();

			

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}

    } 
    public void readall(){
        ObjectInputStream oi=null;
       try {
           Vector<user> u_temp=new Vector<user>();
           FileInputStream fi = new FileInputStream(new File("usersfile.txt"));
            oi = new ObjectInputStream(fi);
            try {
                while (true) {
                    u_temp.add((user) oi.readObject());
                }
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }      catch (IOException ex) {
                Logger.getLogger(u_file.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(u_file.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally {
                admin.setUsers(u_temp);
                oi.close();
                fi.close();
            }
   } catch (IOException ex) {
            Logger.getLogger(u_file.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
   }
}

