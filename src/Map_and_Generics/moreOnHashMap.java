import java.util.HashMap;
import java.util.*;
import  java.util.Map.*;
class Studentt
{
    private String name;
    private int age;
    private String city;

    public Studentt(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity()
    {
        return city;
    }

    //when we not override toSting() method then println() not call
    // internally toSting() and they print only reference object not value
    public String toString()
    {
        return (name +" " +age +" " +city);
    }
}

public class moreOnHashMap {
    public static void main(String[] args) {

        Studentt st1=new Studentt("Balmiki",20,"Jehanabad");
        Studentt st2=new Studentt("Gunjan",3,"Khodanganj");
        Studentt st3=new Studentt("Aayush",5,"RamNagar");
        System.out.println(st1);

        HashMap h=new HashMap();
        h.put(1,st1);
        h.put(2,st2);
        h.put(3,st3);

        System.out.println(h); //direct all data (entrySet)

//for all data (entrySet) by iterator
        Set s=h.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){

            //print all data
           // System.out.println(itr.next());

            //print all entry data after store in another variable
            Map.Entry data=(Map.Entry) itr.next();
            System.out.println(data.getKey() +" "+data.getValue());
         }



//for all key by iterator
        Set k=h.keySet();
        Iterator i=k.iterator();
        while(i.hasNext())
        {
           // System.out.println(i.next());
            Integer integer=(Integer) i.next();
            System.out.println(integer);
        }
        System.out.println(h.keySet());  //direct all keys


        System.out.println("****************************************");
        System.out.println(h.values()); //direct all values
 //for all values by iterator
        Collection valu=h.values();
        Iterator it=valu.iterator()  ;
        while(it.hasNext())
        {
           // System.out.println(it.next());
            String st=(String) it.next();
            System.out.println(st);
        }





    }
}
