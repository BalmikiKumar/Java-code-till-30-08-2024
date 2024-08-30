package Map_and_Generics;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapAndLinkedHashMap {
    public static void main(String[] args) {

        HashMap hm=new HashMap();
        hm.put(1,"Balmiki");
        hm.put(2,"kumar");
        hm.put(3,"Gunjan");
        hm.put(4,"Radha");

        System.out.println(hm);
        System.out.println(hm.get(1));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        System.out.println("*****************************");
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(2,"kumar");
        lhm.put(3,"Gunjan");
        lhm.put(1,"Balmiki");
        lhm.put(4,"Radha");
        System.out.println(lhm);          // for all data within curly braces  :-  {2=kumar, 3=Gunjan, 1=Balmiki, 4=Radha}
        System.out.println(lhm.get(1));   // for value according key.    :- Balmiki
        System.out.println(lhm.values()); //for all values.   :-[kumar, Gunjan, Balmiki, Radha]
        System.out.println(lhm.keySet());  // for all keys   :- [2, 3, 1, 4]
        System.out.println(lhm.entrySet());  // for all data within bracket :-[2=kumar, 3=Gunjan, 1=Balmiki, 4=Radha]

    }
}
