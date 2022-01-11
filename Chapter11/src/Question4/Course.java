
package Question4;

import java.util.ArrayList;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Course {

    // Data fields
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
        numberOfStudents++;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] specificStudent = new String[students.size()];
        return students.toArray(specificStudent);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

}
