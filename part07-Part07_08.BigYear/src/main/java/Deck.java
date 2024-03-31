
import java.util.ArrayList;

public class Deck {
    ArrayList<Bird> birds;
    
    public Deck(){
        this.birds = new ArrayList<>();
    }
    
    //adds bird to the list
    public void addBird(Bird bird){
        this.birds.add(bird);
    }
    
    //checks by object if the bird is already in the list
    public boolean birdInList(Bird bird){
       return this.birds.contains(bird);
    }
    
    //checks by name if the bird is already in the list
    public boolean birdInList(String checkBird){
       for (Bird bird:birds){
           if(bird.getEnglishName().equals(checkBird) || bird.getLatinName().equals(checkBird)){
               bird.observed();
               return true;
           }          
       }
        return false;
    }

    //returns a string to be printed, containing all birds 
    public String all(){
        String output = "";
        for (Bird bird:birds){
            output += bird + "\n";
        }
        return output;
    }
    
    //prints a specific bird according to user inpu
    public void one(String name){
        for (Bird bird:birds){
            if(bird.getEnglishName().equals(name) || bird.getLatinName().equals(name)){               
                System.out.println(bird);
           }
        }      
    }
}
