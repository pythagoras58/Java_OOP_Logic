
package Question2;


/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Faculty extends Employee {

    // Placeholders
    private String officeHours;
    private String rank;

    // constructor
    public Faculty(String name, String address, String phone, String email, 
            String office, double salary, String date_hired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, date_hired);
        this.rank = rank;
        this.officeHours = officeHours;
    }
    
    // setters and getters

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
    // to string

    @Override
    public String toString() {
        return super.toString() + " Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
    

}
