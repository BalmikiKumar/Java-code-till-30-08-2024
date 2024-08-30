package Sorting_Alogrithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Time complexity 0(n^2)
//in this sort we keep the lowest value at the first
//public class Selection_Sort {
//    public static void printArray(int []arr){
//        System.out.print("Sorted array is :");
//        for(int i=0;i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={7,8,3,1,2};
//
//        for(int i=0; i<arr.length-1;i++){
//            int smallest=i;
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[smallest] > arr[j]){
//                    smallest=j;
//                }
//            }
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        printArray(arr);
//
//    }
//}

//2nd approach from pw
public class Selection_Sort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){

            //minIndex is taking the index of minimum element at every iteration
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                //swap between arr[min_idx] and arr[i[
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={1,5,7,9,2,7,7,29,5,2,65,};

        //function calling
        SelectionSort(arr);
        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}