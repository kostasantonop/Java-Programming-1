public class Container {
    private int contains;
    
    public Container(){
        
    }

    //returns the amount contained inside the object
    public int contains(){
        return this.contains;
    }
    
    //adds to the amount inside the object
    public void add(int amount){
        if(amount > 0){
            if (this.contains + amount <= 100){
                this.contains += amount;
            }else{
                this.contains = 100;
            }
        }
    }
    
    //removes from the amount inside  the object
    public void remove(int amount){
        if(amount > 0){
            if (this.contains - amount >= 0){
                this.contains -= amount;
            }else{
                this.contains = 0;
            }
        }
      
    }
    
    //Example: 10/100 print format 
    public String toString(){
        return this.contains() + "/100";
    }
}
