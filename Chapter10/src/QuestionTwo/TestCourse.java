
package QuestionTwo;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class TestCourse {
    public static void main(String[] args) {
        //instantiate the Course class
        Course course = new Course("OOP");
        
        // three students
        course.addStudent("Danso");
        course.addStudent("Jecica");
        course.addStudent("Hubai");
        
        // remove one of the students
        course.dropStudent("Hubai");
        
        //display the students in the course
        System.out.println("The Students in the course: " + course.getCourseName());
        String[] studentList = course.getStudents();
        
        for(int i=0; i<course.getNumberOfStudents();i++){
            
            System.out.println(studentList[i]);
        }
    }
}
