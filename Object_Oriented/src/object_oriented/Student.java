/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented;

/**
 *
 * @author Pythagoras
 */
public class Student {
    
    String name, index_number,major, country;
    int age;

    public Student(String name, String index_number, String major, String country, int age) {
        this.name = name;
        this.index_number = index_number;
        this.major = major;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex_number() {
        return index_number;
    }

    public void setIndex_number(String index_number) {
        this.index_number = index_number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
    
    
}
