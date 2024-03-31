import java.util.*;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    //adds one joke in the arraylist
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    //returns a random joke to be printed 
    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }else{
            return this.jokes.get((int) (Math.random() * this.jokes.size()));
        }
    }
    
    //prints all jokes in the arraylist
    public void printJokes(){
        for (String joke:jokes){
            System.out.println(joke);
        }
    }
}
