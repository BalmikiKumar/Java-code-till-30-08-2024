package Map_and_Generics;

import java.util.*;

public class AccessingObjectsInMap {
    public static void main(String[] args) {

         Map map=new HashMap();
         map.put(1,"Balmiki");
        map.put(1,"Balmiki");
        map.put(2,"kumar");
        map.put(3,"Gunjan");
        map.put(4,"Radha");
        map.put(5,"Ram");

        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map);

        System.out.println("************************** For Integer");
        Set set=map.keySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());

             Integer intt=(Integer) itr.next();

                 System.out.println(intt);
        }
        System.out.println("******************************* For String");
        Collection coll=map.values();
        Iterator itr2=coll.iterator();
        while(itr2.hasNext()){
           // System.out.println(itr2.next());
            String str=(String)itr2.next();
            System.out.println(str);
        }
        System.out.println("***************************** For both (key and values)");
        Set data=map.entrySet();
        Iterator itr3=data.iterator();
        while(itr3.hasNext()){
            //System.out.println(itr3.next());

            Map.Entry dataa=(Map.Entry)itr3.next();
            System.out.println(dataa);
        }
    }
}
