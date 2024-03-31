import java.util.*;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();       
    }
    
   //returns a list with only the names of the exercises
   public ArrayList<String> exerciseList() {        
       ArrayList<String> list = new ArrayList<>();        
       for (Exercise exercise: exercises) {            
            list.add(exercise.getName());        
        }
        return list;    
   }
    
   //adds a new exercise object to the list
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    //marks an exercise object as completed with the true value
    public void markAsCompleted(String exercise) {
        for (Exercise ex:exercises){
            if(ex.getName().equals(exercise)){
                ex.setCompleted(true);
            }
        }
    }
    
    //returns true or false depening on if an exercise object has been marked as completed or not.
    public boolean isCompleted(String exercise){
        for(Exercise ex:exercises){
            if(ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}

