package Map_and_Generics;

import java.util.ArrayList;

//Generics provide typesafety
public class Gen1 {
    public static void main(String[] args) {

        ArrayList <String> al=new ArrayList<String>();
        al.add("Ram");
        al.add("Shyam");
      //  al.add(10); //cant add integer data

//        String n1=(String) al.get(0); //when not use typesafety
//        String n2=(String) al.get(1);



//        String n1=al.get(0);
//        String n2= al.get(1);

        for(String name:al){
            System.out.println(name);
        }
    }
}
