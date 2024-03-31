
import java.util.ArrayList;


public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    //a recipe is added to the cookbook
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public void printRecipes(){
        System.out.println(this.recipes);
    }
    
    //output is formated thus:
    public String toString(){
        String output = "";
        for (Recipe recipe:recipes){
            output += recipe + "\n";
        }
        return "Recipes:\n" + output;
    }
    
    //a recipe is printed according to its name
    public void findName(String name){
        for(Recipe recipe:recipes){
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(recipe);
            }
        }
    }
    
    //recipes are printed if they have lower cooking time than the given time
    public void findTime(int time){
        for(Recipe recipe:recipes){
            if(recipe.getCookingTime() <= time){
                System.out.println(recipe);
            }
        }
    }
    
    //all recipes with a certain ingredient are printed
    public void findIngredient(String ingredients){
        for(Recipe recipe:recipes){
            if(recipe.getIngredients().contains(ingredients)){
                System.out.println(recipe);
            }
        }
    }

}

