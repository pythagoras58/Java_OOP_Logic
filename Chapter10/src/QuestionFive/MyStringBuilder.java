
package QuestionFive;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class MyStringBuilder {

    // placeholder
    private String myString;

    // default constructor
    public MyStringBuilder() {
        this.myString = "";
    }

    // overloaded constructor
    public MyStringBuilder(char[] chars) {
        this.myString = String.valueOf(chars);
    }

    // overloaded constructor
    public MyStringBuilder(String s) {
        this.myString = s;
    }

    // append string
    public MyStringBuilder append(MyStringBuilder s) {
        String newString = this.myString;
        newString += s + " ";

        return new MyStringBuilder(newString);
    }

    // append integer
    public MyStringBuilder append(int i) {
        String newString = this.myString;
        newString += i + " ";

        return new MyStringBuilder(newString);
    }

    // length of string
    public int length() {
        return this.myString.length();
    }

    //specific index of a character
    public char charAt(int index) {
        return this.myString.charAt(index);
    }

    // LowerCase converter
    public MyStringBuilder toLowerCase() {
        String newString = "";
        for (int i = 0; i < this.myString.length(); i++) {
            if (this.myString.charAt(i) >= 'A' && this.myString.charAt(i) <= 'Z') {
                newString += (char) (this.myString.charAt(i) + 32) + "";
            }
        }

        return new MyStringBuilder(newString);
    }

    // UpperCase converter
    public MyStringBuilder UpperCase() {
        String newString = "";
        for (int i = 0; i < this.myString.length(); i++) {
            if (this.myString.charAt(i) >= 'a' && this.myString.charAt(i) <= 'z') {
                newString += (char) (this.myString.charAt(i) - 32) + "";
            } else {
                newString += this.myString.charAt(i) + "";
            }
        }

        return new MyStringBuilder(newString);
    }

    // substring with interval
    public MyStringBuilder substring(int begin, int end) {
        String newString = "";
        for (int i = begin; i < end; i++) {
            newString += this.myString.charAt(i) + "";
        }
        return new MyStringBuilder(newString);
    }

    // substring with start point :: overloading
    public MyStringBuilder substring(int begin) {
        String newString = "";
        for (int i = begin; i < this.myString.length(); i++) {
            newString += this.myString.charAt(i) + "";
        }
        return new MyStringBuilder(newString);
    }

    // convert to string
    public String toString() {
        return this.myString;
    }

    // insert
    public MyStringBuilder insert(int offset, MyStringBuilder s) {
        String newString = "";
        for (int a = 0; a < offset; a++) {
            if (a < offset) {
                newString += this.myString.charAt(a) + "";
            }
        }
        newString += s;
        return new MyStringBuilder(newString + substring(offset));
    }

    //reverse the string
    public MyStringBuilder reverse() {
        // create new string
        String newString = "";
        // get the length of the string and read from the last index
        for (int i = this.myString.length() - 1; i >= 0; i--) {
            newString += this.myString.charAt(i) + "";
        }
        return new MyStringBuilder(newString);
    }
}
