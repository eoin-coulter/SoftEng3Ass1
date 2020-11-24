import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

public class MyTest {
   Course course;
    ArrayList<Course> courses;

    Date date;
    Student testStudent= new Student("Eoin Coulter",21,17902302,course ,new ArrayList<Module>(),date);
    Module testModule = new Module("TestModule","123",new ArrayList<Student>(),new ArrayList<Course>());
    Course testCourse = new Course("TestCourse",new ArrayList<Student>(),new ArrayList<Module>(),new LocalDate("2018-05-05"),new LocalDate("2018-05-06"));



    //Student Tests

    @Test
    public void testingAddCourse(){
        testStudent.addCourse(testCourse);
        assertEquals("TestCourse",testStudent.getCourses().getName(),"testPass");


    }
    @Test
    public void testStudentToModule(){

        testStudent.addStudentToModule(testStudent,testModule);


        assertEquals(1,testStudent.getModules().size());
        assertEquals(1,testModule.getStudents().size(),"testing");

        assertEquals(testModule.getStudents().get(0).getUserName(), testStudent.getUserName(), "Student Added Correctly");
        assertEquals(testStudent.getModules().get(0).getName(), testModule.getName(), "Module Added Correctly");
    }

    @Test
    public void userNameTest() {

        assertEquals("eoincoulter21", testStudent.getUserName(),"Test Passed");
    }

    //Module Tests

    @Test
    public void moduleAddStudentTest(){
        testModule.addStudent(testStudent,testModule);
        assertEquals(1,testModule.getStudents().size(),"Different number of students");

        assertEquals(testModule.getStudents().get(0).getUserName(), testStudent.getUserName(), "User Added Correctly");
    }

    @Test
    public void addModuleToCourseTest(){
        testModule.addModuleToCourse(testModule,testCourse);

        assertEquals(1,testModule.getCourses().size(), "Testing number of courses");
        assertEquals(1,testCourse.getModule().size(),"Testing number of modules");

        assertEquals(testCourse.getModule().get(0).getName(), testModule.getName(), "Correct Module Added");

    }



    @Test
    public void addModuleInCourseTest(){
        testCourse.AddModuleToCourse(testModule,testCourse);
        assertEquals(1,testCourse.getModule().size());

        assertEquals(testCourse.getModule().get(0).getName(), testModule.getName(), "Correct Module Added");
    }

    @Test
    public void addStudentToCourseTest(){
        testCourse.AddStudentToCourse(testStudent);

        assertEquals(1,testCourse.getStudents().size(),"Course has student");
        assertEquals(1,testStudent.getCourses().getStudents().size(),"student in course");

        assertEquals(testCourse.getStudents().get(0).getUserName(), testStudent.getUserName(), "correct student added");
    }










}
