//order of insertation is preserved
//it store homogenious and hetrogenious types of data
//duplicate data allow
//output order me aata hai
//its implements two interfaces 1 List and 2 Deque interface
//it follow doubly LinkedList dataStructure
//we can store data thru index based also
//isme shifting nahi hota hai balki new node ban jata hai extra data ko add karne par

import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);

        System.out.println(ll); // [100, 200, 300, 300]

        LinkedList ll1=new LinkedList();
        ll1.add("pw");
        ll1.add(10);
        ll1.add(10.25);
        ll1.add('b');

        System.out.println(ll1);  //  [pw, 10, 10.25, b]

        LinkedList ll2=new LinkedList();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.addFirst("Balmiki");
        ll2.addLast("Kumar");
        System.out.println(ll2);    //  [Balmiki, 10, 20, 30, Kumar]
        ll2.add(2,"2ndIndex");
        System.out.println(ll2);    //  [Balmiki, 10, 2ndIndex, 20, 30, Kumar]
    //  NOTE: peek() and poll() done first index ka data return karta hai lekin peek() cllection me koi effect nahi karta hai
        //  jabki poll() collection ke  first index ka value return karke use delete kar deta hai.
        System.out.println(ll2.peek());  // Balmiki
        System.out.println(ll2);     // [Balmiki, 10, 2ndIndex, 20, 30, Kumar]
        System.out.println(ll2.poll());  // Balmiki
        System.out.println(ll2);     // [10, 2ndIndex, 20, 30, Kumar]


        //MORE ON LinkedList

        LinkedList ll3=new LinkedList();
        ll3.add(400);
        ll3.add(500);
        ll3.add(500);
        ll3.add(600);
        System.out.println(ll3);     //  [400, 500, 500, 600]

        System.out.println(ll3.get(0));  //  400    based upon index
        System.out.println(ll3.getFirst());  //  400
        System.out.println(ll3.getLast());  // 600

        ll3.push(900);  // push() 1st index par data add karta hai
        System.out.println(ll3);  //  [900, 400, 500, 500, 600]
        System.out.println(ll3.poll());  //  900   poll() 1st index ka data return kar use delete kar deta hai
        System.out.println(ll3);  //  [400, 500, 500, 600]





    }
}
