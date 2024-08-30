package Sorting_Alogrithm;

//Time complexity : 0(n^2), sc=0(1)
//In this sorting first largest element is placed on the last ...so on.....

//public class BubbleSort {
//    public static void printArray(int arr[]){
//        System.out.print("Sorted array is : ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[]={2,7,1,8,3};
//
//
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j] > arr[j+1]){  //for descending oreder : if(arr[j] < arr[j+1])
//                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        printArray(arr);
//
//    }
//}



//2nd approach
import java.util.Arrays;

public class BubbleSort {
    //function definition
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                        //swapped two consecutive element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        //array definition
        int [] arr={10,20,50,780,4,62,66};
        //function callin
        bubbleSort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}

