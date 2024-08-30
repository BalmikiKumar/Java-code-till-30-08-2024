import java.util.*;
//data object ke form me store hota hai
//ArrayList nature se dynamic hota hai
//add() se data last me store hota hai
//homogenious + hetrogenious data store allow hai
//data ko index based bhi sotore kar sakte hia
//output order ko mentain karta hia
//order of insertion is preserved
//duplicate value allow hota hai
//ArrayList List interface ko implement karta hai
//ensureCapacity() se location ko reserved bhi kar sakte hai
//addAll() se 1 collection ko dusre collection me add bhi kar sakte hai

class arrayList {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(300);
        System.out.println(al);           //   [100, 200, 300, 300]

        ArrayList al1=new ArrayList();
        al1.add("pw");
        al1.add(1);
        al1.add(1.1);
        al1.add('b');
        System.out.println(al1);           //  [pw, 1, 1.1, b

        ArrayList al2=new ArrayList();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.addAll(al1);
        System.out.println(al2);      // [1, 2, 3, pw, 1, 1.1, b]

        al2.add(2,500);
        System.out.println(al2);      //  [1, 2, 500, 3, pw, 1, 1.1, b]


        // MORE ON ArrayList

        ArrayList al3=new ArrayList();


        al3.add(200);
        al3.add(400);
        al3.add(600);
        System.out.println(al3.contains(400));     // true
        System.out.println(al3.contains(500));     // false

        int index=al3.indexOf(600);
        System.out.println(index);       //  2
        System.out.println(al3.size());  // 3

        al3.ensureCapacity(10);  // 10 location reserved ho haya
        al3.trimToSize();   // 10 location jo reserved tha usme se jitna location use me nahi hai wo trim(remove)ho gaya
        System.out.println(al3.size());  // 3

        al3.clear(); // clear() method al3 ka pura data ko clear kar diya
        System.out.println(al3);    //  []

        List al4=new ArrayList();  // ArrayList()->(child type of object) ke liye  List-> (parent type of reference bana sakte hai)
        al4.add(1501);
        System.out.println(al4);  // 1501


    }

}
