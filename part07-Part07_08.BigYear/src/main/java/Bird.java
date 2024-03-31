public class Bird {
    
    private String englishName;
    private String latinName;
    private int observations;
    
    public Bird(String englishName, String latinName){
        this.englishName = englishName;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }
    
    //if the bird is observed, this counter goes up by 1
    public void observed(){
        this.observations++;
    }
    
    //custom equals so we can check with contains if the bird is already in the list
    @Override
    public boolean equals(Object obj) {
      if(!(obj instanceof Bird)) {
         return false;
      }
      Bird bird = (Bird)obj;
      return this.englishName.equals(bird.getEnglishName()) && this.latinName.equals(bird.getLatinName());
    }
    
    public String toString(){        
        return this.englishName + " (" + this.latinName + "): " + this.observations + " observations";
    }
    
    
}
