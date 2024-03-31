
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            //every repetition we see how much is contained inside every container
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            //input needs to be of the type : add 15, remove 4,move 20 etc
            String input = scan.nextLine();
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int amount = 0;
            //Ensuring there is only 1 space in the input (Example: add 15)
            if(splitInput.length == 2){
                amount = Integer.valueOf(splitInput[1]);
            }       
            //exit the program
            if (command.equals("quit")) {
                break;
            //add to the first container
            }else if (command.equals("add")){
                first.add(amount);
            //remove from the second container
            }else if (command.equals("remove")){
                second.remove(amount);
            //move from 1st to the 2nd container
            }else if (command.equals("move")){
                if(first.contains() - amount < 0){
                    second.add(first.contains());
                    first.remove(100);
                } else{
                    first.remove(amount);
                    if (second.contains() + amount > 100){
                        second.add(100);
                    }else{
                        second.add(amount);
                    }
                }
            }            
        }
    }
}
