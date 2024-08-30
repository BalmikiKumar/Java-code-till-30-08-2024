/*
duplicate value not allow
dafault reserved location 16
75% location full hone par sabhi budgets double ho jata hai
load factor 0.75%
HashSet can also store a collection

in linkedhashset
order of insertion preserved
linkedhashset ke parent set hashset hai
linkedhashset is subclass of hashset
*/

import java.util.*;

public class HashSet_and_LinkedHashSet {
    public static void main(String []args)
    {
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(30);    // duplicate value not add,consider
        System.out.println(hs);   //  [20, 10, 30]

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(30);
        System.out.println(lhs);
    }
}
