package STREAM_API_AND_ANNOTATION;

import java.util.*;
import java.util.function.Consumer;

public class forEach_method {
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(100);
        l.add(1000);
        l.add(1);
        System.out.println(l);

        List<Integer> l1=Arrays.asList(10,100,1000,1);
        System.out.println(l1);
        for(Integer o:l1)
        {
            System.out.println(o);
        }
        System.out.println("**********************");
l1.forEach(n-> System.out.println(n)); //First method of using forEach method

        //2nd method of using forEach method

        Consumer<Integer> cons=new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        l1.forEach(cons);

    }
}
