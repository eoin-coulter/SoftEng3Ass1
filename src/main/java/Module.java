import java.util.ArrayList;

public class Module {


    private String Name;
    private String ID;
    private ArrayList<Student> Students;
    private ArrayList<Course> Courses;


    public Module(String name, String id, ArrayList<Student> students, ArrayList<Course> courses) {
        Name = name;
        ID = id;
        Students = students;
        Courses = courses;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }

    public ArrayList<Course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        Courses = courses;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
