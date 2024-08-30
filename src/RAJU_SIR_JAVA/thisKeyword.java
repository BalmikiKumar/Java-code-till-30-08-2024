package RAJU_SIR_JAVA;
class Vehicle{
    int max_speed =210;
    Vehicle(int max_speed)
    {
        this(10,20);
        this.max_speed=max_speed;
    }
    Vehicle (int a,int b)
    {
        System.out.println("Double Constructor");
    }

    public void showMaxSpeed()
    {
        System.out.println("Max speed is : "+max_speed);

    }
    //for checking the address of this keyword
    void thisAddress()
    {
        System.out.println("Address of this : "+this);
    }

}

public class thisKeyword {
    public static void main(String[] args) {
        Vehicle a=new Vehicle(250);
        a.showMaxSpeed();

        //for checking the address of object reference variable(a)
        //Address of reference variable and this keyword is same
        System.out.println("Address of a : "+a);
        a.thisAddress();
   //     Vehicle aa=new Vehicle(10,20);

    }
}
