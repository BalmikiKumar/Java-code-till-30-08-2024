package Project;

import java.util.Scanner;

abstract class  Shape{
    float area;
    abstract public  void input();
    abstract public void compute();
    public void Disp()
    {
        System.out.println("Area = "+area);
    }
}
class Rectangle extends Shape{
    float length;
    float breadth;
    public void input()
    {
        System.out.println("For rectangle.............................");
        System.out.println("Enter length of rectangle:");
        Scanner scan=new Scanner(System.in);
        length = scan.nextFloat();
        System.out.println("Enter breadth of rectangle :");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area=length*breadth;
    }
}

class Square extends Shape{
    float length;

    public void input()
    {
        System.out.println("For Square............................");
        System.out.println("Enter side of square :");
        Scanner scan=new Scanner(System.in);
        length = scan.nextFloat();

    }
    public void compute()
    {
        area=length*length;
    }
}

class Circle extends Shape{
    float radius;

    public void input()
    {
        System.out.println("For Circle............................");
        System.out.println("Enter radius of circle :");
        Scanner scan=new Scanner(System.in);
        radius = scan.nextFloat();

    }
    public void compute()
    {
        area=3.14f * radius * radius;
    }
}
class Geometry{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.Disp();
    }
}


public class Rec_C_S_app {
    public static void main(String[] args) {
        System.out.println("Har Har Mahadev");
        Rectangle rec=new Rectangle();
        Square sq=new Square();
        Circle c=new Circle();

        Geometry g=new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);

    }
}
