public class CarListNode extends Car {

    private Car data;
    private CarListNode next;
    private CarListNode prev;

    public CarListNode(){
        next = null;
        prev = null;
    }
    public CarListNode(Car initData) throws IllegalArgumentException {

        if (initData == null)
            throw new IllegalArgumentException("The initial data is empty!");

        else {

            data = initData;
            next = null;
            prev = null;
        }

    }
}
