
package Question2;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Student extends Person {

    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    // constructor
    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status) {
        // use the defined constants as cases for the Student
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "freshman";
        }
    }
    
    // toString

    @Override
    public String toString() {
        return super.toString() + " Status: " + getStatus();
    }

    

}
