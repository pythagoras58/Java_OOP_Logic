/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goma;

/**
 *
 * @author Pythagoras
 */
public class Employee {
    //Create Employee Detail PLaceholders
    
    int employee_id, salaray;
    String Employee_name,
            Employee_Department, 
            Employee_address, 
            Employee_contact, 
            Employee_role;
    
    //Create our constructors

    public Employee() {
    }

    public Employee(int employee_id, int salaray, String Employee_name, String Employee_Department, String Employee_address, String Employee_contact, String Employee_role) {
        this.employee_id = employee_id;
        this.salaray = salaray;
        this.Employee_name = Employee_name;
        this.Employee_Department = Employee_Department;
        this.Employee_address = Employee_address;
        this.Employee_contact = Employee_contact;
        this.Employee_role = Employee_role;
    }
    
    //create getters and setters methods for all placeholders

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getSalaray() {
        return salaray;
    }

    public void setSalaray(int salaray) {
        this.salaray = salaray;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }

    public String getEmployee_Department() {
        return Employee_Department;
    }

    public void setEmployee_Department(String Employee_Department) {
        this.Employee_Department = Employee_Department;
    }

    public String getEmployee_address() {
        return Employee_address;
    }

    public void setEmployee_address(String Employee_address) {
        this.Employee_address = Employee_address;
    }

    public String getEmployee_contact() {
        return Employee_contact;
    }

    public void setEmployee_contact(String Employee_contact) {
        this.Employee_contact = Employee_contact;
    }

    public String getEmployee_role() {
        return Employee_role;
    }

    public void setEmployee_role(String Employee_role) {
        this.Employee_role = Employee_role;
    }
    
    //create a method to show details

    @Override
    public String toString() {
        return "Employee{" + "employee_id=" + employee_id + ", salaray=" + salaray + ", Employee_name=" + Employee_name + ", Employee_Department=" + Employee_Department + ", Employee_address=" + Employee_address + ", Employee_contact=" + Employee_contact + ", Employee_role=" + Employee_role + '}';
    }
    
    
    
}
