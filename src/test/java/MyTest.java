import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

public class MyTest {
    ArrayList<Student> students;
    ArrayList<Course> courses;
    ArrayList<Module> modules;
    Date date;
    Student myTestStudent= new Student("Eoin Coulter",21,17902302,new ArrayList<Course>(),new ArrayList<Module>(),date);
    Module myTestModule = new Module("TestModule","123",new ArrayList<Student>(),new ArrayList<Course>());
    Course testCourse = new Course("TestCourse",new ArrayList<Student>(),new ArrayList<Module>(),new LocalDate("2018-05-05"),new LocalDate("2018-05-06"));



    @Test
    public void gettingUsernameShouldReturnNamePlusAge() {

        // assert statements
        assertEquals("eoincoulter21", myTestStudent.getUserName(), "" +
                "Correct, Test Passed");

    }


    @Test
    //StudentTests
    public void testingAddCourse(){
        myTestStudent.addCourse(testCourse);
        assertEquals(1,myTestStudent.getCourses().size(),"testPass");

    }
    @Test

    public void testStudentToModule(){
        myTestStudent.addStudentToModule(myTestStudent,myTestModule);

        assertEquals(1,myTestStudent.getModules().size());
        assertEquals(1,myTestModule.getStudents().size(),"testing");
    }

//module tests
    @Test

    public void moduleAddStudentTest(){
        myTestModule.addStudent(myTestStudent,myTestModule);


        assertEquals(1,myTestModule.getStudents().size(),"testing");
    }

    @Test

    public void addModuleToCourseTest(){
        myTestModule.addModuleToCourse(myTestModule,testCourse);

        assertEquals(1,myTestModule.getCourses().size());
        assertEquals(1,testCourse.getModule().size());
    }


    //courseTest
    @Test
    public void addModuleInCourseTest(){
        testCourse.AddModuleToCourse(myTestModule,testCourse);
        assertEquals(1,testCourse.getModule().size());




    }
    @Test

    public void addStudentToCourseTest(){
        testCourse.AddStudentToCourse(myTestStudent,testCourse);

        assertEquals(1,testCourse.getStudents().size(),"testing course has student");
        assertEquals(1,myTestStudent.getCourses().size(),"testing Student Has Course");
    }






}
