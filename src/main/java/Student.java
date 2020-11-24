import java.util.ArrayList;
import java.util.Date;

public class Student {



    private String Name;
    private int Age;
    private int ID;
    private String UserName;
    private Course Courses;
    private ArrayList<Module> Modules;
    private Date DOB;


    public Student(String name, int age, int id, Course courses, ArrayList<Module> modules, Date dob) {
        this.Name = name;
        this.Age = age;
        this.ID = id;

        this.Courses = courses;
        this.Modules = modules;
        this.DOB = dob;
    }


    public String getName() {
        return Name;
    }

    public void addCourse( Course course){
        if (this.Courses != null){
            return;
        }
        else{
            this.Courses = course;
            this.Modules = course.getModule();
        }
    }



    public void addStudentToModule(Student student,Module module){
        if (module.getStudents().contains(student)) {
            return;
        }
        else{
            student.Modules.add(module);
            module.addStudent(student,module);
            return;
        }


    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Course getCourses() {
        return Courses;
    }

    public void setCourses(Course courses) {
        Courses = courses;
    }

    public ArrayList<Module> getModules() {
        return Modules;
    }

    public void setModules(ArrayList<Module> modules) {
        Modules = modules;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getUserName() {
        String name = this.getName().toLowerCase();
        name = name.replaceAll("\\s+","");
        int age = this.getAge();
        this.UserName = name + age;
        return this.UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
