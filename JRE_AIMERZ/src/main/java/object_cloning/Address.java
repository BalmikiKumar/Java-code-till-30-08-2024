package object_cloning;

public class Address {
    String city;

    public Address(String city) {
        super();
        this.city = city;
    }

    //deep copy
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
