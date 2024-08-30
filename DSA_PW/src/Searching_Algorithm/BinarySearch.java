package Searching_Algorithm;

import java.util.Scanner;

public class BinarySearch {
    public static int Binary(int arr[],int search){
        int min,mid,max;
        min=0;
        max=arr.length-1;
        while(min<=max){
            mid=(min+max)/2;

            if(search==arr[mid]){
                 return mid;
            }
            if(arr[mid] < search){
                min=mid+1;
            }
            else {
                max=mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        //Take element from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
      int arraySize=  sc.nextInt();
      int arr[]=new int[arraySize]; //array initialize
        System.out.println("Enter Elements in array in sorted order");
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter searching element");
        int searchElement=sc.nextInt();



       // int arr[]={1,2,3,4,5,6,7,8,9,10,11};
       // int searchElement=1;

       int Result=  Binary(arr,searchElement);
       if(Result !=-1) System.out.println("Element found at index : "+Result);
       else System.out.println("Element not found");
    }
}
