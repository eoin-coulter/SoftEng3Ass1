import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String Name;
    private ArrayList<Student> Students;
    private ArrayList<Module> Module;
    private LocalDate StartDate;
    private LocalDate EndDate;


    public String getName() {
        return Name;
    }

    public void AddStudentToCourse(Student student){

        if(this.Students.contains(student)){
            student.addCourse(this);
            return;

        }
         else
        this.Students.add(student);
         student.addCourse(this);

    }



    public void AddModuleToCourse(Module module,Course course){
        if (this.Module.contains(module)){

            return;
        }else

        Module.add(module);
            return;
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

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public ArrayList<Module> getModule() {
        return Module;
    }

    public void setModule(ArrayList<Module> module) {
        Module = module;
    }

    public Course(String name, ArrayList<Student> students,ArrayList<Module> modules, LocalDate startDate, LocalDate endDate) {
        Name = name;
        Students = students;
        StartDate = startDate;
        EndDate = endDate;
        Module = modules;
    }
}
