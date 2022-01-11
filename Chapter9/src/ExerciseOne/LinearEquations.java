
package ExerciseOne;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class LinearEquations {
    //Declare Private Data Fields
    private double a, b, c, d, e, f;
    
    //constructor with the data fields as arg

    public LinearEquations(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    // Getters methods

    //Get A
    public double getA() {
        return a;
    }

    //Get B
    public double getB() {
        return b;
    }

    //Get C
    public double getC() {
        return c;
    }

    //Get D
    public double getD() {
        return d;
    }

    //Get E
    public double getE() {
        return e;
    }

    //Get F
    public double getF() {
        return f;
    }
    
    //method named isSolvable() that returns true if ad - bc is not 0.
    public boolean isSolvable(){
        return ((a*d)-(b*c) != 0);
    }
    
    // get X method
    public double getX(){
        return ((e * d) - (b*f)) / ((a*d) - (b*c));
    }
    
    //get Y method
    public double getY(){
        return ((a * f) - (e*c)) / ((a*d) - (b*c));
    }
}
