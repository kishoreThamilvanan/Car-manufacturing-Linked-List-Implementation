import java.util.*;

public class CarList extends CarListNode {

    private CarListNode head;
    private CarListNode tail;
    private CarListNode cursor;

    public CarList() {

        head = null;
        tail = null;
        cursor = null;

    }

    public int numCars() {
        int size = 0;
        if(head == null)
            return -1;
        else {

            IntNode nodePtr = head;


            while (nodePtr != null) {
                nodePtr = nodePtr.getLink();
                size++;
            }

        }
        return size;

    }

    public Car getCursorCar(){

        if(cursor == null)
            return null;

        else
            return cursor.getLink();

    }

    public void resetToHead() {

        if(head != null )
            cursor = null;

        else
            cursor = head;
    }

    public void cursorForward() throws Exception{

        if(cursor == tail)
            throw new Exception("This is the last element in the array");

        else  if(head == null && tail == null)
            throw new Exception();

        else
            cursor = cursor.getNext();

    }
    public void cursorBackward() throws Exception{

        if(head == null || cursor == null)
            throw new Exception("The List is empty!");

        else if(cursor == head)
            throw new Exception("This is the first node.");

        else
            cursor = cursor.getPrev();
    }

}
