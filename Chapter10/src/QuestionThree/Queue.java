
package QuestionThree;

/**
 *
 * @author Danso Solomon Danquah :: Zhihui
 */
public class Queue {

    // Data field definition
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;
 
    //constructor that create queue with 8 as capacity
    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    // Enqueue method that adds v to the Queue
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    // remove and return the elements from the Queue
    public int dequeue() {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        size--;
        return v;
    }
    
    // check the queue and return true if empty
    public boolean empty(){
        return size==0;
    }
    
    // return the size of the Queue
    public int getSize(){
        return size;
    }
}
