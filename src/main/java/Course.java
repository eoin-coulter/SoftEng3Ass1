import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String Name;
    private ArrayList<Student> Students;
    private LocalDate StartDate;
    private LocalDate EndDate;


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

    public Course(String name, ArrayList<Student> students, LocalDate startDate, LocalDate endDate) {
        Name = name;
        Students = students;
        StartDate = startDate;
        EndDate = endDate;
    }
}
