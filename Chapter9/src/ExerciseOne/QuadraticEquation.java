
package ExerciseOne;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class QuadraticEquation {
    //create private data fields for a, b and c
    private double a,b,c;
    
    //craete a constructor with a,b and c as args

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // get a mehtod
    public double getA() {
        return a;
    }

    // get b mehtod
    public double getB() {
        return b;
    }

    // get c mehtod
    public double getC() {
        return c;
    }
    
    //discriminant method
    public double getDiscriminant(){
        return (Math.pow(b, 2) - (4*a*c));
    }
    
    //getRoot1 method
    public double getRoot1(){
       if(getDiscriminant()<0){
           return 0;
       }else{
          return  (-b) + (Math.sqrt(getDiscriminant()) / (2*a));
       }
       
    }
    
    //getRoot2 method
    public double getRoot2(){
        if(getDiscriminant()<0){
           return 0;
       }else{
          return  (-b) - (Math.sqrt(getDiscriminant()) / (2*a));
       }
    }
     
}
