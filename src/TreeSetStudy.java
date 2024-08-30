//TreeSet :- follow Binary search tree, its time complexity is O(logn)
//order not preserved
//searching operation fast because based on binary search tree
//duplicate value not consider
//null value not allow
//data in sorted array achieved thru and its follow LVR(left , value , right) rule
//low data shift in left node and huge data store in right node


import java.util.*;
public class TreeSetStudy{
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        ts.add(100); // duplicate allow but not cosider
        System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]

        System.out.println(ts.higher(50));  //  75
        System.out.println(ts.lower(50));  //  25

        System.out.println(ts.ceiling(40));  //  50
        System.out.println(ts.floor(40));  //  25

        System.out.println(ts.ceiling(50));  //  50
        System.out.println(ts.floor(50));   //  50


    }
}
