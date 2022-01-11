
package QuestionFour;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class TestMyString {

    public static void main(String[] args) {

        // Create to char arrays
        char[] first = {'O', 'O', 'P', '1'};
        char[] second = {'O', 'O', 'P', '2'};

        //instantiation
        MyString string1 = new MyString(first);
        MyString string2 = new MyString(second);

        // Display character at index 1 of MyString object 1 and 2
        System.out.println("Character at index 1 of MyString object 1: "
                + string1.charAt(1));
        System.out.println("Character at index 2 of MyString object 2: "
                + string1.charAt(2));

        // Display the length of MyString object 1 and 2
        System.out.println("Length of MyString object 1: " + string1.length());
        System.out.println("Length of MyString object 2: " + string2.length());

        // Display a Substring from index 2 to 4 of MyString object 1 and 2
        System.out.println("\nSubstring from index 1 to 3 of MyString1 object 1: ");
        MyString substr = string1.substring(1, 3);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.println();
        MyString substr2 = string1.substring(1, 3);
        for (int i = 0; i < substr2.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.println();

        // Display MyString object 1 and 2 as lowercase:"
        System.out.println("MyString object 1 to lowercase:");
        MyString lower1 = string1.toLowerCase();
        for (int i = 0; i < lower1.length(); i++) {
            System.out.print(lower1.charAt(i));
        }
        System.out.println();
        System.out.println("MyString object 2 to lowercase:");
        MyString lower2 = string2.toLowerCase();
        for (int i = 0; i < lower2.length(); i++) {
            System.out.print(lower2.charAt(i));
        }
        System.out.println();

        // Display MyString objects as uppercase
        System.out.println("MyString object 1 to Uppercase:");
        MyString upper1 = string1.toLowerCase();
        for (int i = 0; i < upper1.length(); i++) {
            System.out.print(upper1.charAt(i));
        }
        System.out.println("OOP1");
        System.out.println();
        System.out.println("MyString object 2 to Uppercase:");
        MyString upper2 = string2.toLowerCase();
        for (int i = 0; i < upper2.length(); i++) {
            System.out.print(upper2.charAt(i));
        }
        System.out.println();

        // Test if MyString1 object 1 is equal to MyString1 object 2
        System.out.println("MyString object 1 is equal to MyString object 2? "
                + string1.equals(string2));

        // Display the integer 145 as a MyString1 object
        System.out.println("Display the integer 100 as a MyString object: ");
        MyString value = string1.valueOf(100);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }
        System.out.println();
        
        /// boolean value
        //MyString bool = string1.valueOf(true);
        System.out.println("Boolean Value: " + bool);
    }
}
