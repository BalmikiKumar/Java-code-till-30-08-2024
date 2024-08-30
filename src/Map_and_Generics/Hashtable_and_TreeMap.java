package Map_and_Generics;
import java.util.*;

public class Hashtable_and_TreeMap {
    public static void main(String[] args) {
        Hashtable hs=new Hashtable();
        hs.put(1,"Rohan");
        hs.put(2,"Rahul");
        hs.put("ram","shyam");
        hs.putIfAbsent(3,"Rahul");
        System.out.println(hs);

        TreeMap tm=new TreeMap();
        tm.put(1,"ram");
        tm.put(2,"shyam");
   //     tm.putAll(hs);
        System.out.println(tm);

        TreeMap tmm=new TreeMap();
        tmm.put(1,"tmm");
        tmm.put(2,"tmm1");
        System.out.println(tmm);
        System.out.println("**********************************");
        tmm.putAll(tm);
        System.out.println(tmm);

    }
}

