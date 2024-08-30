//Key must be unique but may be or not
//Type of key can be anything like as String,int,float etc
//output order not maintain in HashMap but LinkedHashMap output order maintain
//int HashMap data is store in the onject form that is called Entry
//null key and values is also store


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;


public class HashMap_and_LinkedHashMap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(01,"Balmiki");
        hm.put(02,"kumar");
        hm.put("college","cimage");
        hm.put("city","jehanabad");
        hm.put("null","null");
        System.out.println(hm);  //{null=null, college=cimage, 1=Balmiki, 2=kumar, city=jehanabad}{college=cimage, 1=Balmiki, 2=kumar, city=jehanabad}

        HashMap hm1=new HashMap();
        hm1.put(1,"ram");
        hm1.put(2,"sita");
        hm1.put(3,"Laxman");
        System.out.println(hm1);               //  {1=ram, 2=sita, 3=Laxman}
        System.out.println(hm1.entrySet());    //   [1=ram, 2=sita, 3=Laxman]
        System.out.println(hm1.get(2));  // sita get()values ko print karta hai inedex based
        System.out.println(hm1.size());  // 3  FOR how many numbers of KEYS ONLY
        System.out.println(hm1.keySet()); // [1, 2, 3]  whose keys present in this collection
        System.out.println(hm1.values());  // [ram, sita, Laxman]  FOR VALUES ONLY
        for(int i=0; i< hm1.size();i++)
        {
            System.out.println(hm1.get(i));  // for all keys

        }

        HashMap hm2=new HashMap();
        hm2.putAll(hm1);
        System.out.println(hm2);  // {1=ram, 2=sita, 3=Laxman}

        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(01,"Balmiki");
        lhm.put(02,"kumar");
        lhm.put("college","cimage");
        lhm.put("city","jehanabad");
        lhm.put("null","null");
        System.out.println(lhm); // {1=Balmiki, 2=kumar, college=cimage, city=jehanabad, null=null} OUTPUT ORDER MAINTAIN

    }
}
