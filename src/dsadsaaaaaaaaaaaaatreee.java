//Treemap is orderd pair it is follow the order of integer or string also

import java.util.Scanner;
import java.util.TreeMap;

public class dsadsaaaaaaaaaaaaatreee {
    public static void main(String[] args) {

//        FOR INTEGER ORDER PAIR
//        FOR INTEGER(NUMBER) ORDER PAIR (DICTIONARY ME INTEGER KE ASCENDING ORDER KE ACCORDING PRING HOGA)

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();

        TreeMap<Integer,String> map = new TreeMap<>();
        System.out.println("Enter key value pairs :");
        for(int i=0; i<n; i++){
            int key=sc.nextInt();
            String value=sc.next();
            map.put(key,value);
        }
        System.out.println(map);



//        FOR STRING ORDER PAIR (STRING ME DICTIONARY ME ASCENDING ORDER KE ACCORDING PRING HOGA)

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number :");
//        int n=sc.nextInt();
//
//        TreeMap<String,Integer> map = new TreeMap<>();
//        System.out.println("Enter key-value pairs :");
//        for(int i=0; i<n; i++){
//            int value=sc.nextInt();
//            String key=sc.next();
//            map.put(key,value);
//        }
//        System.out.println(map);

    }
}
