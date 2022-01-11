
package Question2;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Staff extends Employee{
    
    // placeholder
    private String title;
    
    // constructor
    public Staff(String name, String address, String phone,
            String email, String office, double salary, String date_hired, String title) {
        super(name, address, phone, email, office, salary, date_hired);
        this.title = title;
    }
    
    // getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    // toString

    @Override
    public String toString() {
        return super.toString() + " Staff{" + "title=" + title + '}';
    }
    
    
}
