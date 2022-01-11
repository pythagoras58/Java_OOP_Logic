/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented.School;

/**
 *
 * @author Pythagoras
 */
public class School {
    int school_id;
    String school_name;
    Double school_fee;

    public School(int school_id, String school_name, Double school_fee) {
        this.school_id = school_id;
        this.school_name = school_name;
        this.school_fee = school_fee;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public Double getSchool_fee() {
        return school_fee;
    }

    public void setSchool_fee(Double school_fee) {
        this.school_fee = school_fee;
    }
    
    void show(){
        System.out.println("School ID: " + school_id);
        System.out.println("School Name: " + school_name);
        System.out.println("School Fees: " + school_fee);
        System.out.println("");
    }
}
