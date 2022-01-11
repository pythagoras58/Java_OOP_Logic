package QuestionTwo;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Course {

    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        // for automatic increment of the array size
        if (numberOfStudents == students.length) {
            String[] newString = new String[students.length + 1];
            for (int i = 0; i < numberOfStudents; i++) {
                newString[i] = students[i];
            }
            // make the increment
            students = newString;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // implementation of dropStudent :: reversal of the addStudent method
        // get the student first by id
        int id = getStudentID(student);
        if (id >= 0) {
            // drop the student based on the student's id
            dropStudentByID(id);
        } else {
            System.out.println(student + " is not in the course: " + courseName);
        }

    }

    //removes all students from the course//
    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    // methods to support Student Droping :: dropStudent method
    private int getStudentID(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    // delete the student
    private void dropStudentByID(int id) {
        String[] newString = new String[students.length - 1];

        for (int i = 0; i < newString.length; i++) {
            for (int j = 0; j < newString.length; j++) {
                if (i == id) {
                    j++;
                }
                newString[i] = students[j];
            }
        }
        this.students = newString;
        numberOfStudents--;
    }
}
