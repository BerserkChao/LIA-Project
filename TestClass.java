import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//the test class is a bit funky. I wasn't sure what to add and how to test.
/**
 * The test class TestClass.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
    /**
     * Default constructor for test class TestClass
     */
    public TestClass()
    {
        //create athlete
        Athlete a1 = new Athlete("Lina", 25, Gender.FEMALE);
        Athlete s2 = new Athlete("Alex", 30, Gender.MALE);
        
        //create equipment
        Equipment bike = new Equipment("Trek","FX-3");
        Equipment rollerblades = new Equipment("K2","Vo2");
        
        //create activity list
            //List<Activity> activities = new ArrayList<>(); 
        
        //powered activities
            //activities.add(new PoweredActivity(a1, 10.5, TransportationMode.BIKING, bike));
            //activities.add(new PoweredActivity(a2, 8.2, TransportationMode.ROLLERBLADE, rollerblade));
            
        //List activities by athlete  - doesn't work
        System.out.println("Activities by Lina: ");
        //ActivUtil.listActivitiesByAthlete(a1, activities);
        
        //calc distance  - doesn't work
            //System.out.println("\nTotal Distance: " + ActivUtil;.calculateTotalDistance(activites) + " km");
        
        //calories burned by Alex as example -- doesn't work :c
                //System.out.println("The amount of calories Alex burned is :" 
                //+ ActivUtil.calculateCaloriesByAthlete(a2, activities));
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
