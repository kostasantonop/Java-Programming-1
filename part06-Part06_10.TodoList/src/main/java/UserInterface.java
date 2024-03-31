import java.util.*;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    //main portion of the user interface
    public void start(){
        while(true){
            System.out.println("Give command");
            String command = scanner.nextLine();
            //stop breaks out of the start method
            if (command.equals("stop")){
                break;
            //add allows the user to add tasks to the todo list
            }else if (command.equals("add")){
                System.out.println("Give task:");
                String task = scanner.nextLine();
                this.todoList.add(task);
            //list prints all the tasks in the list according with the toString 
            //forgmat of the TodoList class
            }else if (command.equals("list")){
                System.out.println(this.todoList);
            //remove, removes an element of the tasks ArrayList of the 
            //TodoList class according to the user input
            }else if (command.equals("remove")){
                System.out.println("Give id of task to be removed:");
                int task = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(task);
            }
        }
    }
}
