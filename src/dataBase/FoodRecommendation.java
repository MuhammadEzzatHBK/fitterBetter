/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author mohamed mosaad
 */
public abstract class FoodRecommendation  {
    
    Manipulation M;
    public ArrayList<meal> baseData =readBaseData.read_csv("baseData.txt");
    // making new cleaned ArrayList of type meals
    public ArrayList<meal> CleanedData= M.DataCleaning(baseData);
    // to use it in the sub classes
    ArrayList<ExercisePlan> ExerciseData = ReadExercises.read_csv("Exercises.txt");
    protected ArrayList<String> BreakFastArray;
    protected ArrayList<String> LunchArray;
    protected ArrayList<String> DinnerArray;
    protected ArrayList<String> ExerciseArray;
    
    public FoodRecommendation ()
    {
        BreakFastArray =new ArrayList<String>();
        LunchArray = new ArrayList<String>();
        DinnerArray = new ArrayList<String>();
        ExerciseArray = new ArrayList<String>();
    }
    
    public abstract void SetBreakFast();
    public abstract void SetLunch();
    public abstract void SetDinner();
    public abstract ArrayList<String>  RecommendBreakFast();
    public abstract ArrayList<String>  RecommendLunch();
    public abstract ArrayList<String>  RecommendDinner();
    public abstract ArrayList<String>  Recommendexercises();
}
            