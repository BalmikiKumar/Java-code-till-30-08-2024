package RAJU_SIR_JAVA;

class Vehicl{
    void message()
    {
        System.out.println("Vehicl method");
    }
}
class Car extends Vehicl{
    void message()
    {
        message();
        super.message();
        System.out.println("Car method");
    }

}
public class superKeAndMethod {
    public static void main(String[] args) {
        Car c=new Car();
        c.message();
    }
}
