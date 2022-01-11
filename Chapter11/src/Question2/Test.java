
package Question2;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Test {
    public static void main(String[] args) {
        
        // instantiate person class
        Person person = new Person(" Danso Solomon", " Ghana", " +233578527885", " solomondanso58@gmail.com");
        
        // instantiate student class
        Student student = new Student(" Jecica", " Cote Divoire", " +23253665889", " jecica@gmail.com", 1);
        
        // instantiate employee class
        Employee employee = new Employee(" Goma", " Zimbabwe", " +257889955662", " goma@gmail.com",
                " Student Registry", 5000.6, " 23-12-2019");
        
        // Instantiate the Faculty class
        Staff staff = new Staff("Asiri", "Bangladesh", "+235896677445", "asiri@gmail.com",
                "Academic Manager", 9000, "12-12-2018", "Professor");
        
        
        // print outs
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(staff.toString());
    }
}
