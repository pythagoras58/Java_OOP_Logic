
package Question2;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Person {

    // Declare all placeholders
    private String name;
    private String address;
    private String phone;
    private String email;
    
    // constructor

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // toString

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
    
}
