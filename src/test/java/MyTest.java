import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

public class MyTest {

    ArrayList<Course> courses;
    ArrayList<Module> modules;
    Date date;



    @Test
    public void gettingUsernameShouldReturnNamePlusAge() {
         Student myTestStudent= new Student("Eoin Coulter",21,17902302,courses,modules,date);

        // assert statements
        assertEquals("eoincoulter21", myTestStudent.getUserName(), "Correct, Test Passed");

    }


}
