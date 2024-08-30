package Searching_Algorithm;

import java.util.Scanner;

public class lSeaarch {
    public static int Binary(int arr[],int size,int search){
        int min=0,mid,max=arr.length;
        while(min<max){
            mid=(min+max)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(arr[mid]<search){
                min=mid+1;
            }
            else {
                max=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int si=arr.length;
        int se=7;

        int Result=Binary(arr,si,se);
        if(Result !=-1) System.out.println("Element found at index : "+Result);
        else System.out.println("Not found");
    }
}
