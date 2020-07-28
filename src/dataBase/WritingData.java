/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author mohamed mosaad
 */
public class WritingData {
    
     public static void main(String[] args) throws Exception 
    {
        Manipulation M = new Manipulation() ;
        LoseWeight L = new LoseWeight();
        
        ArrayList<meal> baseData =readBaseData.read_csv("baseData.txt");
        
        
        
        try
        {
            File F = new File("NEWDATA.txt");
            PrintStream writer = new PrintStream(F);
            for(int i = 0 ; i < L.SetMealType().size();i++)
            {
                if(L.SetMealType().get(i) != null)
                        {
                            writer.println(L.SetMealType().get(i).getName()+','+L.SetMealType().get(i).getPortion_amount()+','+L.SetMealType().get(i).getPortion_name()+','+L.SetMealType().get(i).getGrain()+','+L.SetMealType().get(i).getVegetable()+','+L.SetMealType().get(i).getFruit()+','+L.SetMealType().get(i).getMeat()+','+L.SetMealType().get(i).getCalories()+','+L.SetMealType().get(i).getMealType());
                        }
            }
            writer.close();
        } 
        catch (FileNotFoundException fnf) 
        {
            System.err.println("the file wasn't found");
        }
    }
    
    
    
}
