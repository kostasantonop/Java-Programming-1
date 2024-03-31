import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalHoldWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalHoldWeight(){
        int sum = 0;
        for(Suitcase suitcase:suitcases){
            sum += suitcase.totalWeight();
        }
        return sum;
    }
    public String toString(){
        return this.suitcases.size() + " suitcases (<" + this.totalHoldWeight() + "kg)";
    }
    
    public void printItems(){       
        if(this.suitcases.isEmpty()){
            System.out.println("No suitcases in this hold");
        }else{
            System.out.println(this);
            for(Suitcase suitcase:suitcases){
               suitcase.printItems();
            }
        
        }       
    }
}
