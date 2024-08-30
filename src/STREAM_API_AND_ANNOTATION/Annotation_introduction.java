package STREAM_API_AND_ANNOTATION;

@FunctionalInterface
interface Demo{
    public void disp();
   // public void disp1();
}

@Deprecated
class p1{

}
class cp extends p1{
    void p(){
        System.out.println("d");
    }
}

class Plane{
    public void planeFlightAtGoodHeight(){
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane{
    @Override
    public void planeFlightAtGoodHeight(){
        System.out.println("Cargo plane flies at lower height");
    }
    public void di(){
        System.out.println("CargoPlane  class");
    }

}

public class Annotation_introduction {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.planeFlightAtGoodHeight();
    }
}
