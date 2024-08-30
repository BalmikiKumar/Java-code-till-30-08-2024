package Sorting_Alogrithm;
//time complexity 0(n^2)
//in this we check first element to second element that is smallest or not , again check second element to third element that is smallest or not and so on.....
//public class Insertion_Sort {
//    public static void printArray(int arr[]){
//        System.out.print("sorted array is : ");
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={4,2,5,8,6,4,7,3};
//
//        for(int i=1; i<arr.length; i++){
//            int current=arr[i];
//            int j=i-1;
//            while (j>=0 && current <arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            //placement
//            arr[j+1]=current;
//        }
//        printArray(arr);
//    }
//}


//2nd approach

import java.util.Arrays;

public class Insertion_Sort {
    public static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j > 0 &&  arr[j] < arr[j-1]){
                //swap the elements between arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,7,3,89,26,88,489,5,69,1};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }

}