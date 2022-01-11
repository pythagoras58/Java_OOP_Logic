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
public class getEmployee {
    
    public static void main(String[] args) {
        Employee first_employee = new Employee(
                "Robert",
                "64C- WallsStreat",
                70000.22,
                1994
        );
        
        Employee second_employee = new Employee(
                "Sam",
                "68D- WallsStreat",
                3000.22,
                2000
        );
        
         Employee third_employee = new Employee(
                "John",
                "26B- WallsStreat",
                20000.22,
                1999
        );
         
        System.out.println("Name "  +   "Year Of Join   "  +   "Address");
        System.out.println(first_employee.getName() + first_employee.getYear_joined() + first_employee.getAddress());
        System.out.println(second_employee.getName() + second_employee.getYear_joined() + second_employee.getAddress());
        System.out.println(third_employee.getName() + third_employee.getYear_joined() + third_employee.getAddress());

    }
}
