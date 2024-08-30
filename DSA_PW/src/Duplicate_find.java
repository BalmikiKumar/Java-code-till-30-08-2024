//find duplicate number in an array

import java.util.Scanner;

public class Duplicate_find {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,5,6,6,9,8,10};

        int l=arr.length;
        for(int i=0;i<l; i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]==arr[j])
                    System.out.println("Duplicate element is at the index :"+i);
                //break; //for find 1st duplicate element
            }
        }

    }
}
