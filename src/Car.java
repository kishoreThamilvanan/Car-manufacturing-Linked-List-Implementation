public class Car extends Make{
    private Make make;
    private String owner;


    public Car() {

        owner = "john";
        make = Make.make.CHEVY;
    }
    public Car(Make m, String o) {
        make = m;
        owner = o;
    }

    public String getOwner() {

        return owner;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        String s = "\n** Details of the Car **"+"\nMake : " + make +
                "\nOwner : " + owner;
    }


}
