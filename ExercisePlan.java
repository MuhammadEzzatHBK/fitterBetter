/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

/**
 *
 * @author mohamed mosaad
 */
public class ExercisePlan {
    private String ExerciseName;
    private double Calories;
    private String ExerciseType; 
    
    public ExercisePlan(String[] metadata)
    {
        ExerciseName = metadata[0];
        ExerciseName = ExerciseName.substring(1);
        Calories  =  Double.valueOf(metadata[1]);
        ExerciseType = metadata[2];
        ExerciseType = ExerciseType.substring(0, ExerciseType.length()-2);
    }
    

    public String getExerciseName() {
        return ExerciseName;
    }

    public void setExerciseName(String ExerciseName) {
        this.ExerciseName = ExerciseName;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public String getExerciseType() {
        return ExerciseType;
    }

    public void setExerciseType(String ExerciseType) {
        this.ExerciseType = ExerciseType;
    }
}
