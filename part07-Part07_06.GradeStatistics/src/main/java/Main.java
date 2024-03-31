
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister gradeRegister = new GradeRegister();
        System.out.println("Enter point totals, -1 stops::");
        
        while (true){            
            int pointTotal = Integer.valueOf( scanner.nextLine());
            if (pointTotal == -1){
                break;
            }
            if(pointTotal < 0 || pointTotal > 100){
                continue;
            }
            gradeRegister.addPoint(pointTotal);
        }
        System.out.println("Point average (all): " + gradeRegister.average());
        System.out.println("Point average (passing): " + gradeRegister.passingAverage());
        System.out.println("Pass percentage: " + gradeRegister.passingPercentage());
        gradeRegister.printStars();
    }
}
