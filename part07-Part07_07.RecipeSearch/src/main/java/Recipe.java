
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;       
    }
    
}
