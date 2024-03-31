
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        Scanner scan = new Scanner(System.in);
        Deck deck = new Deck();
        while (true){
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")){
                break;
            }else if (command.equals("Add")){
                System.out.println("Name?");
                String englishName = scan.nextLine();
                System.out.print("Name in Latin?");
                String latinName = scan.nextLine();
                if (!(deck.birdInList(new Bird(englishName, latinName)))){                    
                    deck.addBird(new Bird(englishName, latinName));
                }else{
                    System.out.println("This bird already exists on the list");
                }
            }else if(command.equals("Observation")){   
                System.out.println("Bird?");
                String name = scan.nextLine();              
                if(deck.birdInList(name)){
                    System.out.println(name + " observed!");          
                }else{
                    System.out.println("Thats not a bird!");
                }
            }else if (command.equals("All")){
                System.out.println(deck.all());
            }else if (command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                deck.one(name);
            }
        }

    }

}
