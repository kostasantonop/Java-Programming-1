import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {
    
    private ExerciseManagement managment;
    
    @Before
    public void initialize(){
        managment = new ExerciseManagement();
    }
    
    //tests if the list is empty at the beginning
    @Test
    public void exerciseListEmptyAtBeginning(){
        ExerciseManagement managment = new ExerciseManagement();
        assertEquals(0, managment.exerciseList().size());
    }
    
    //tests if 1 item is added to the list
    @Test
    public void addingExerciseGrowsByOne(){
        ExerciseManagement managment = new ExerciseManagement();
        managment.add("Write a test");
        assertEquals(1, managment.exerciseList().size());
    }
    
    //tests if the added item is in the list
    @Test
    public void addedExerciseIsInList(){
        ExerciseManagement managment = new ExerciseManagement();
        managment.add("Write a test");
        assertTrue(managment.exerciseList().contains("Write a test"));
    }
    
    //tests if an exercise marked as completed returns the true value
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        managment.add("New exercise");    
        managment.markAsCompleted("New exercise");           
        assertTrue(managment.isCompleted("New exercise"));
        
    }
}