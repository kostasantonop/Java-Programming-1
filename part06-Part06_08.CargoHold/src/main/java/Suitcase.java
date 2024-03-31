import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if(item.getWeight() + this.totalWeight() > this.maxWeight){
            return;
        }
        this.items.add(item);
    }
    public int totalWeight(){
        int sum = 0;
        for(Item item:items){
            sum += item.getWeight();
        }
        return sum;
    }
    
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (" + this.totalWeight() + " kg)";
        }
        if(this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        String printedItems = "";
        
        for (int i=0; i < this.items.size(); i++){
            if(i == this.items.size() -1){
                printedItems += this.items.get(i);
            }else{
                printedItems += this.items.get(i) + "\n";
            }
        }        
        System.out.println(printedItems);
    }
    
    public Item heaviestItem(){     
        if(this.items.isEmpty()){
            return null;
        }
        Item returnItem = this.items.get(0);
        for (Item item:items){
            if(item.getWeight() > returnItem.getWeight()){
                returnItem = item;               
            }
        }
        return returnItem;        
    }
          
}
