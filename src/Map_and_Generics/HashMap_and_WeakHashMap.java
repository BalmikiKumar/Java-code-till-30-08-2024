package Map_and_Generics;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee{
    String name;
    int empId;
    public Employee(String name,int empId)
    {
        this.name=name;
        this.empId=empId;
    }
    // for fetching the value of e object
    public String toString()
    {
        return empId+name;
    }

    @Override
    public void finalize()
    {
        System.out.println("Clean up work by garbage collector before deallocating memory from heap");
    }
}
public class HashMap_and_WeakHashMap {
    public static void main(String[] args) {
        Employee e=new Employee("Balmiki",57);
        //   System.out.println(e); // without override toString() method it will return reference address of e

        WeakHashMap hm=new WeakHashMap(); //WeakHashMap isn't dominant of garbage  collector
        //HashMap hm=new HashMap(); HashMap is dominant of garbage collector(When we use HashMap in this case garbage  collector can't call)
        hm.put(e,"Radha");
        System.out.println(hm);

        e=null;    //eligible for garbage collector

        System.gc(); //invoking garbage  collector
        //System.gc() , internally finalize() method ko call karta hai isiliye finalize method ko override kiya jata hai
        System.out.println(hm);
        //    System.out.println(e);

    }
}
