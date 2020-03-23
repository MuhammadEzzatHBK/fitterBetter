package javaapplication1;
import dataBase.*;
import java.util.List;

public class JavaApplication1 {
    
    public static void main(String[] args)
    {
        // read baseData from file into program
        List<meal> baseData =readBaseData.read_csv("baseData.txt");
        
        // printing all Meals' name from CSV file
         baseData.forEach((meal m) -> {
            System.out.println(m.getName());
        });
        
    } 
}
