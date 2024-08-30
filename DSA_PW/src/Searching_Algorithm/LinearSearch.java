package Searching_Algorithm;

public class LinearSearch {
    public static int Linear(int arr[], int searchElement){
        for(int i=1;i<arr.length;i++){
            if(searchElement == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /*  //SECOND LOGIC FOR LINEAR SEARCH
    public static void linear(int arr[], int size,int search){
        int i;
        for(i=0; i<size;i++){
            if(arr[i]==search){
                System.out.println("Element found at index : "+i);
                break;
            }
        } if(i==size) System.out.println("Not found");
    }
    */

    public static void main(String[] args) {
        int arr[]={1,8,13,3,83,7,6,5,44};
        int s_Element=5;

       int Result= Linear(arr,s_Element);
       if(Result !=-1) System.out.println("Element found at index : "+Result);
       else System.out.println("Element not found");
    }
}
