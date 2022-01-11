
package ExerciseOne;

//import GregorianCalendar
import java.util.GregorianCalendar;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */



public class GregorianCalendarTest {
    
    public static void main(String[] args) {
        // create an instance of the Gregorian Calendar Class
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        // Declare variables to hold year, month and day
        int year, month, day;
        //get the year
        year = gregorianCalendar.get(gregorianCalendar.YEAR);
        month = gregorianCalendar.get(gregorianCalendar.MONTH);
        day = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
        System.out.println("The Current Year, Day and Month in Year/Month/Day Format ");
        System.out.println(year + "/" + month + "/" + day);
        
        //set a specified elapsed time since January 1, 1970. Set the value to 1234567898765L
        gregorianCalendar.setTimeInMillis(1234567898765L);
        
        //get the new year, month and day after setting new time in milliseconds
        year = gregorianCalendar.get(gregorianCalendar.YEAR);
        month = gregorianCalendar.get(gregorianCalendar.MONTH);
        day = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
        
        // Display the new set Date
        System.out.println("Specified elapsed time since January 1, 1970, Day and Month in Year/Month/Day Format ");
        System.out.println(year + "/" + month + "/" + day);
        
    }
}
