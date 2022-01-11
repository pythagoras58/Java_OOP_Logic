
package ExerciseOne;

/**
 *
 * @author Danso Solomon Danquah (Zhìhuì)
 */
public class Location {
    //Data fields
    public int row, column;
    public double maxValue;

    public Location(double[][]a) {
        maxValue = a[0][0];
        row = column = 0; // assign 0 to row and column
        
        //find the maxvalue of the array
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                //check for the maxvalue in i and j
                if(a[i][j]> maxValue){
                    row = i; // assign i to the row variable
                    column = j; // assign j to the column
                    maxValue = a[i][j]; // the array of i and j should be the maxValue
                }
            }
        }
    }
    
   
}
