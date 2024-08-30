//class ka name ArrayDeque kabhi bhi na rakahen
//Duplicate allow
//Homogenious + Hetrogenious both data allow
//indexBased data not allow(insertion or deletion)
//its follow double ended queue so it add or remove data firstIndex or lastIndex not add data indexBased
// null is not allow
import java.util.*;
public class array_Deque {

    public static void main(String[] args) {

       ArrayDeque ad =new ArrayDeque();
       ad.add(100);
       ad.add(200);
       ad.add(200);
       ad.add("pw");
       ad.add(10.15);
       ad.add('h');
        ad.addFirst(500);
        ad.addLast(100);

       System.out.println(ad);     //  [500, 100, 200, 200, pw, 10.15, h, 100]

        ArrayDeque ad1=new ArrayDeque();
        ad1.add(400);
        ad1.add(300);
        ad1.offer(600);      // add(), offer() dono data ko add hi karta hai but sometime offer() data ko add nahi bhi karta hai
        ad1.offerFirst(80);// addFirst(),offerFirst() dono data ko firstIndex me hi add karta hai but sometime offer()
                                // data ko add nahi bhi karta hai
        ad1.offerLast(90);  // addLast(),offerLast() dono data ko lastIndex me hi add karta hai but sometime offer()
                                 // data ko add nahi bhi karta hai
        System.out.println(ad1);                  //  [80, 400, 300, 600, 90]

        ArrayDeque ad2=new ArrayDeque();
        ad2.add(10);
        ad2.add(20);
        ad2.add(30);
        ad2.addAll(ad1);
        System.out.println(ad2);  //  [10, 20, 30, 80, 400, 300, 600, 90]

    }



}
