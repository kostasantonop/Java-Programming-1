import java.util.*;

public class TodoList {
    //a list is made out of multiple tasks that are stored in an ArrayList
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<String>();
    }
    
    //a new task is added to the Todo List
    public void add(String task){
        if (!(this.tasks.contains(task))){
            this.tasks.add(task);
        }
    }
    
    //all the tasks are printed
    public void print(){
        for (int i = 0; i < this.tasks.size(); i++){
            System.out.println((i + 1) + ": " + this.tasks.get(i));
        }
    }
    
    // a task is removed from the list according to its index
    public void remove(int number){
        this.tasks.remove(number -1);
    }
    
    //formats the output of the this.tasks to include a task counter
    public String toString(){
        String printMessage = "";
        for (int i = 0; i < this.tasks.size(); i++){
            if (i == this.tasks.size() -1){
                printMessage += (i + 1) + ": " + this.tasks.get(i);
            }else{
                printMessage += (i + 1) + ": " + this.tasks.get(i) + "\n";
            }
        }
        return printMessage;
    }
}
