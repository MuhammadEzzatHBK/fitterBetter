/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mohamed mosaad
 */
public class GainWeight extends FoodRecommendation {
    
    @Override
    public void SetBreakFast()
    {
        //BreakFast Variables weights for gaining weight
        double[] BreakFastWeight = new double[]{100,20,60,20,10,0.5}; 
        // Scoring the food Algorithm
        for (int i = 0 ; i < CleanedData.size() ; i++)
        {
            CleanedData.get(i).setBreakFastScore((CleanedData.get(i).getGrain()* BreakFastWeight[0])+(CleanedData.get(i).getVegetable()* BreakFastWeight[1])+(CleanedData.get(i).getFruit()* BreakFastWeight[2])+(CleanedData.get(i).getMilk()* BreakFastWeight[3])+(CleanedData.get(i).getMeat()* BreakFastWeight[4])+(CleanedData.get(i).getCalories()* BreakFastWeight[5]));
        }
    }
    @Override
    public void SetLunch()
    {
        //Lunch Variables weights for gaining weight
        double[] LunchWeight = new double[]{50,100,60,20,100,0.5}; 
        
        for (int i = 0 ; i < CleanedData.size() ; i++)
        {
            CleanedData.get(i).setLunchScore((CleanedData.get(i).getGrain()* LunchWeight[0])+(CleanedData.get(i).getVegetable()* LunchWeight[1])+(CleanedData.get(i).getFruit()* LunchWeight[2])+(CleanedData.get(i).getMilk()* LunchWeight[3])+(CleanedData.get(i).getMeat()* LunchWeight[4])+(CleanedData.get(i).getCalories()* LunchWeight[5]));
        }
       
    }
    @Override
    public void SetDinner()
    {
        double[] DinnerWeight = new double[]{20,50,20,100,20,0.5}; 
        
        for (int i = 0 ; i < CleanedData.size() ; i++)
        {
            CleanedData.get(i).setDinnerScore((CleanedData.get(i).getGrain()* DinnerWeight[0])+(CleanedData.get(i).getVegetable()* DinnerWeight[1])+(CleanedData.get(i).getFruit()* DinnerWeight[2])+(CleanedData.get(i).getMilk()* DinnerWeight[3])+(CleanedData.get(i).getMeat()* DinnerWeight[4])+(CleanedData.get(i).getCalories()* DinnerWeight [5]));
        }
    }
    
    @Override
    // takes the ArrayList and return arraylist of strings contains breakfast meals name
    public ArrayList<String>  RecommendBreakFast()
    {
       SetBreakFast();
       //sort the arraylist in descinding order of the breakfast score
       Collections.sort(CleanedData , new Comparator<meal>()
       {
           @Override
           public int compare(meal m1 , meal m2)
           {
               return Double.valueOf(m2.getBreakFastScore()).compareTo(m1.getBreakFastScore());
           }
       });
       // takes the higher 15 score of breakfast and puts their names in array
       for(int i = 0 ; i < 16 ; i++)
       {
           BreakFastArray.add(CleanedData.get(i).getPortion_amount() + "\t" + CleanedData.get(i).getPortion_name() + CleanedData.get(i).getName())  ;
       }
       
       return BreakFastArray;
    }
    
    @Override
    // takes the ArrayList and return arraylist of strings contains lunch meals name
    public ArrayList<String>  RecommendLunch()
    {
       SetLunch();
        //sort the arraylist in descinding order of the lunch score
       Collections.sort(CleanedData , new Comparator<meal>()
       {
           @Override
           public int compare(meal m1 , meal m2)
           {
               return Double.valueOf(m2.getLunchScore()).compareTo(m1.getLunchScore());
           }
       });
       // takes the higher 15 score of lunch and puts their names in array
       for(int i = 0 ; i < 16 ; i++)
       {
           LunchArray.add(CleanedData.get(i).getPortion_amount() + "\t" + CleanedData.get(i).getPortion_name() + CleanedData.get(i).getName())  ;
       }
       
       return LunchArray;
    }
    @Override
    // takes the ArrayList and return arraylist of strings contains dinner meals name
    public ArrayList<String>  RecommendDinner()
    {
       SetDinner();
       //sort the arraylist in descinding order of the dinner score
       Collections.sort(CleanedData , new Comparator<meal>()
       {
           @Override
           public int compare(meal m1 , meal m2)
           {
               return Double.valueOf(m2.getDinnerScore()).compareTo(m1.getDinnerScore());
           }
       });
        // takes the higher 15 score of dinner and puts their names in array
       for(int i = 0 ; i < 16 ; i++)
       {
           DinnerArray.add(CleanedData.get(i).getPortion_amount() + "\t" + CleanedData.get(i).getPortion_name() + CleanedData.get(i).getName())  ;
       }
       
       return DinnerArray;
    }
    @Override
    public ArrayList<String>  Recommendexercises()
    {
        for (int i = 0 ; i < ExerciseData.size() ; i++)
        {
            if (ExerciseData.get(i).getExerciseType().equals("Gain Weight"))
            {
                ExerciseArray.add(ExerciseData.get(i).getExerciseName()+","+ExerciseData.get(i).getCalories()+","+ExerciseData.get(i).getExerciseImage());
            }
        }
        return ExerciseArray;
    }
    
}
