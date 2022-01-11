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
public class Object_Oriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the student class
        
        Student st = new Student(
                "Solomon",
                "20215220014",
                "Computer Science and Technology",
                "Ghana",
                25
        );
        
        System.out.println("The Details of Student: ");
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student ID: " + st.getIndex_number());
        System.out.println("Student Major: " + st.getMajor());
        System.out.println("Student Country: " + st.getCountry());
        System.out.println("Student Age: " + st.getAge());



    }
    
}
