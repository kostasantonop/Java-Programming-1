 import java.util.*;

class GradeRegister {
 
     private ArrayList<Integer> points;
     private ArrayList<Integer> passingPoints;
     
     public GradeRegister(){
         
         this.points = new ArrayList<>();
         this.passingPoints = new ArrayList<>();
     }
     
     //adds points given by the user to the point list
     public void addPoint(int point){
         this.points.add(point);
     }
     
     //calculates the average of all points
     public double average(){
         int sum = 0;
         for(Integer point:points){
             sum += point;
         }
         return (float) sum / this.points.size();
     }
     
     //calculates the average of points > 50 and stores passing points in a new list
     public String passingAverage(){
       int passingSum = 0;     
       for (Integer point:points){
           if (point >= 50){
               passingSum += point;
               this.passingPoints.add(point);
           }
       }
       if (passingSum == 0){
           return "-";
       }else{
           return Double.toString(passingSum / (float) this.passingPoints.size());
       }
     }
     
     //calculates the percentage of passing entries of points
     public double passingPercentage(){
         return  100 * (float) this.passingPoints.size() / this.points.size();
     }
     
     //converts points to grades
     public int pointToGrade(int point){
         if(point >= 90){
             return 5;
         }else if (point >= 80){
             return 4;
         }else if (point >= 70){
             return 3;
         }else if (point >= 60){
             return 2;
         }else if (point >= 50){
             return 1;
         }
        return 0;
     }
     
     //prints stars according to the points (and thus according to the grade) of each entry
     //next to its grade 
     public void printStars(){
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--){           
            System.out.print(i + ":");
            for(Integer point:points){
                if(this.pointToGrade(point) == i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
     }
}

