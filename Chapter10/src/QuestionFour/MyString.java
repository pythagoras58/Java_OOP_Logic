
package QuestionFour;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class MyString {

    // Datafields
    private char[] chars;
    private String mystring;

    //constructor
    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        // get the chars in the default constructor since the notation allows a single method for contructor
        for (int a = 0; a < chars.length; a++) {
            this.chars[a] = chars[a];
        }
    }

    public MyString(String mystring) {
        this.mystring = "";
        for (int i = 0; i < mystring.length(); i++) {
            this.mystring += mystring.charAt(i) + "";
        }
    }

    // this is depreciated :: replaced by toCharArray 
    public char[] toChar() {
        this.chars = new char[chars.length];
        return this.chars;
    }

    // get a character based on its index:: position in a string
    public char charAt(int index) {
        return chars[index];
    }

    // get the length of a string
    public int length() {
        return chars.length;
    }

    // get a portion of a string with begin and end given
    public MyString substring(int begin, int end) {
        // first get the length of the string
        char[] newCharacter = new char[end - begin];
        //check the begining and ending
        for (int a = begin, b = 0; a < end; a++, b++) {
            newCharacter[b] = chars[a];
        }

        return new MyString(newCharacter);

    }

    // 
    public char substring(int begin) {
        
        String beg = "";
        for (int i = begin, j = 0; i < mystring.length(); i++, j++) {
            beg += mystring.charAt(i) + "";
        }
        
        return new MyString(beg);
    }

    public MyString toLowerCase() {
        char[] newCharacter = new char[chars.length];
        for (int a = 0; a < chars.length; a++) {
            if (chars[a] >= 'A' && chars[a] <= 'Z') {
                newCharacter[a] = (char) (chars[a] + 32);
            } else {
                newCharacter[a] = chars[a];
            }
        }
        return new MyString(newCharacter);
    }

    public MyString toUpperCase() {
        char[] newCharacter = new char[chars.length];
        for (int a = 0; a < chars.length; a++) {
            if (chars[a] >= 'a' && chars[a] <= 'z') {
                newCharacter[a] = (char) (chars[a] - 32);
            } else {
                newCharacter[a] = chars[a];
            }
        }
        return new MyString(newCharacter);
    }

    public static MyString valueOf(int i) {
        // Count the number of values in i
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }

        // Create a char array of the length of i
        char[] ch = new char[length];

        // Copy the values in i to the array
        for (int j = 0, k = (int) Math.pow(10, length - 1);
                j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString(ch);
    }

    public static MyString valueOf(boolean b) {
        return (b ? new MyString("true") : new MyString("false"));
    }
}
