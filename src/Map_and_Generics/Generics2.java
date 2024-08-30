package Map_and_Generics;

import java.util.ArrayList;

class Student1{
    private String name="ere";
    private int id;
}

class Employee1{
    private String name;
    private int id;
}
public class Generics2 {
    public static void main(String[] args) {
        Student1 st1=new Student1();
        Student1 st2=new Student1();

        Employee1 em=new Employee1();

        ArrayList<Student1> arrayList=new ArrayList<Student1>();
        arrayList.add(st1);
        arrayList.add(st2);
        System.out.println(arrayList.get(0));
     //   arrayList.add(em);  //here we not add object type (em) only Student1 type of data can be added.

    }


}
