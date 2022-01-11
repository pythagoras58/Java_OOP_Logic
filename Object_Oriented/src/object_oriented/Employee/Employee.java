/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented.Employee;

/**
 *
 * @author Pythagoras
 */
public class Employee {
    String name,address;
    Double salary;
    int year_joined;

    public Employee(String name, String address, Double salary, int year_joined) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.year_joined = year_joined;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getYear_joined() {
        return year_joined;
    }

    public void setYear_joined(int year_joined) {
        this.year_joined = year_joined;
    }
    
    
}
