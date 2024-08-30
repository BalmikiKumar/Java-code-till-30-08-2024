package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class printAllSequences {
    public static void printSequences(int []arr,int index, ArrayList<Integer> tempArr){
        //base case
        if(index == arr.length){
            //print the subsequence , but do not print empty entries
            if(tempArr.size() > 0){
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call

        //include
        printSequences(arr,index+1, tempArr);
        //add the value in temp array
        tempArr.add(arr[index]);

        //do not include
        printSequences(arr,index+1,tempArr);

        //remove the last value
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {

        int [] arr = {1,2};
        System.out.println("For the array ; "+ Arrays.toString(arr));
        printSequences(arr,0,new ArrayList<Integer>());



//        // print 2d array element without using looop
//        int ar[][]= {
//                {0, 1},
//                {2, 3},
//                {4, 5}
//        };
//        System.out.println(Arrays.deepToString(ar));
    }
}
