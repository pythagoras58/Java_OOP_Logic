package QuestionFive;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class TestMyStringBuilder {

    public static void main(String[] args) {
        // array variable
        char[] chars = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        //create instances of the overloaded constructor:: char and string
        MyStringBuilder myStringBuilder1 = new MyStringBuilder("ObjectOriented");
        MyStringBuilder myStringBuilder2 = new MyStringBuilder(chars);

        // test append string
        System.out.println("Append the string \" MyStringBuilder\" to string: "
                + myStringBuilder1.append(new MyStringBuilder(" New Course Name")));

        // test append int
        System.out.println("\nAppend integer 20210014 to the string: " + myStringBuilder1.append(20210014));

        // Test length
        System.out.println("Length of string: " + myStringBuilder1.length());
        System.out.println("Length of Char: " + myStringBuilder2.length());

        // test indexing
        System.out.println("String value at index 3: " + myStringBuilder1.charAt(3));
        System.out.println("Array Character value at index 3: " + myStringBuilder2.charAt(3));

        // test lowercase
        System.out.println("String to lower case: " + myStringBuilder1.toLowerCase());
        System.out.println("Array Characters to lower case: " + myStringBuilder2.toLowerCase());

        // test uppercase
        System.out.println("String to upper case: " + myStringBuilder1.UpperCase());
        System.out.println("Array Characters to upper case: " + myStringBuilder2.UpperCase());

        //test substring 
        System.out.println("Substring of string from index 1 to 6: "
                + myStringBuilder1.substring(1, 6));
        System.out.println("Substring of Array Characters from index 2 to 5: "
                + myStringBuilder2.substring(2, 5));

        // test string
        System.out.println("Display string: " + myStringBuilder1.toString());
        System.out.println("Display Array Characters: " + myStringBuilder2.toString());

        // Test Insert at a specific index of a string 
        System.out.print("Insert Array Characters into string  at index 4: ");
        MyStringBuilder newString = myStringBuilder1.insert(4, myStringBuilder2);
        System.out.println(newString);

        // Test Reverse 
        System.out.println("Reverse string : " + myStringBuilder1.reverse());
        System.out.println("Reverse Array Characters : " + myStringBuilder2.reverse());

      
    }
}
