
package Question4;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Test {

    public static void main(String[] args) {
        // Class Instantiation
        Course course1 = new Course("OOP");
        Course course2 = new Course("Database");
        Course course3 = new Course("SAND");

        // add students to the arrayList
        course1.addStudent("Danso");
        course1.addStudent("Jecica");
        course1.addStudent("Goma");

        course2.addStudent("Mamuodu");
        course2.addStudent("Ron");
        course2.addStudent("Nana");

        course3.addStudent("Asiri");
        course3.addStudent("Khant");
        course3.addStudent("Danso");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println("");
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
        System.out.println("");
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i] + ", ");
        }

        System.out.println("");
        System.out.print("Number of students in course3: " + course3.getNumberOfStudents());
        System.out.println("");
        String[] students3 = course3.getStudents();
        for (int i = 0; i < course3.getNumberOfStudents(); i++) {
            System.out.print(students3[i] + ", ");
        }
    }
}
