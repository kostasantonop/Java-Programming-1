import java.nio.file.Paths;
import java.util.*;

public class UserInterface {
    private Scanner scanner;   
    private ArrayList<String> recipes;
    private ArrayList<String> ingredients;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }
    
    public void start(){
        RecipeBook recipeBook = new RecipeBook(); 
        //name file is given my user. The file needs to be written in lines
        //The first line inlcudes the name of the recipie
        //The second is the cooking time the recipe needs
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        System.out.println("");
        System.out.println("Commands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");     
        
        //the file is read line by line. The first line is the name of the recipe
        //The second line is the cooking time
        //The rest of the lines are the ingredients
        //An empty line means we are moving to the next recipe
        try(Scanner sc = new Scanner(Paths.get(fileName))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();               
                if(line.isEmpty()){
                    continue;
                }
                //first line is the name
                String name = line;
                //second line is the time it takes for the recipe to be cooked
                int time = Integer.valueOf(sc.nextLine());   
                //All the other lines are ingredients             
                while(sc.hasNextLine()){
                    String ingredient = sc.nextLine(); 
                    //If we reach empty line it means we are moving on to the
                    //next recipe and there are no more ingredients
                    if (ingredient.isEmpty()){
                        break;
                    }else{
                        this.ingredients.add(ingredient);
                    }
                }
                //a new recipe is created based on every iteration of
                //the for loop
                recipeBook.addRecipe(new Recipe(name, time, this.ingredients));
                this.ingredients.clear();
            }          
        }catch(Exception e){
            System.out.println("Error,,: " + e.getMessage());
        }
        
        while(true){
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if(command.toLowerCase().equals("stop")){
                break;
            }else if (command.toLowerCase().equals("list")){
                System.out.println(recipeBook);
            }else if (command.toLowerCase().equals("find name"))  {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                recipeBook.findName(searchedWord);
            }else if (command.toLowerCase().equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                recipeBook.findTime(time);
            }else if (command.toLowerCase().equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                recipeBook.findIngredient(ingredient);
                
            }          
        }
    }
}

