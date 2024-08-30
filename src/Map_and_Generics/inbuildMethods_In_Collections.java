package Map_and_Generics;

//import java.util.ArrayList;
import java.util.*;
//import java.util.Collections;

public class inbuildMethods_In_Collections {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add(50);
        ar.add(150);
        ar.add(25);
        ar.add(75);
        ar.add(125);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);

        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("Balmiki");
        ar1.add("Ram");
        ar1.add("Ankush");
        ar1.add("Ankit");
         System.out.println(ar1);
        Collections.sort(ar1);
        System.out.println(ar1);

        ArrayList ar2=new ArrayList();
        ar2.add(25);
        ar2.add(50);
        ar2.add(75);
        ar2.add(150);

       int index= Collections.binarySearch(ar2,75);
        System.out.println("index vlaue of 75 is : "+index);

        Collections.rotate(ar2,2);
        System.out.println(ar2);
        Collections.shuffle(ar2);
        System.out.println(ar2);

        ar2.add(75);
        System.out.println(Collections.frequency(ar2,75));


    }
}
