
package Question2;


/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Employee extends Person {

    // Placeholders
    private String office;
    private double salary;
    private String date_hired;

    public Employee(String name, String address, String phone, String email, 
            String office, double salary, String date_hired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    // getters 
    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDate_hired() {
        return date_hired;
    }

    // setters
    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

    // to String
    @Override
    public String toString() {
        return super.toString() + "Office: " + office
                + "Salary: CYN " + getSalary() + " Date hired: " + getDate_hired();
    }

}
