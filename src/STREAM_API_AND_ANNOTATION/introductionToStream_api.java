package STREAM_API_AND_ANNOTATION;
//Stream ka use karne se Real list ke data par koi effect nahi padta hai
//note:- ek baar stream data par kam karne ke baad uspar dubara kam nahi kar sakte hai

import java.util.*;
import java.util.stream.*;


public class introductionToStream_api {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,75,40,50);

        Stream<Integer> streamData=list.stream();

         //   for print all data using lambda expression (for iterate purpose we use forEach loop)
        streamData.forEach(n-> System.out.println(n));

//        long ct=streamData.count();
//        System.out.println(ct);

//        Stream<Integer> sortedStream=streamData.sorted();  //for sorting purpose
//        sortedStream.forEach(n-> System.out.println(n));  //for iterate purpose


//        Stream<Integer> StreamData2x=streamData.map(n->n*2);  // use map for arithmetic operation
//        StreamData2x.forEach(n-> System.out.println(n));


//       Stream<Integer> filterData= streamData.filter(n->n%2==0); //use filter for filtering data
//       filterData.forEach(m-> System.out.println(m));


//NOTE RETURN TYPE SAME RAHNE PAR METHOD CHAINING KA CONCEPT USE KAR SAKTE HAI

//        Stream<Integer> finalStream=streamData.sorted().filter(n->n%2==0).map(n->n*2);
//        finalStream.forEach(n-> System.out.println(n));





    }

}
