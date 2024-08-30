import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Jai shree ram");



        Scanner sc=new Scanner(System.in);
        //from user input size of an array
        System.out.println("Enter size of an array :");
        int n=sc.nextInt();
        //from user input an array element of size n
        System.out.println("Enter "+n +" element of an array :");
        int [] arr=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //target value from user input
        System.out.println("Enter target value :");
        int x=sc.nextInt();

        // implementation of linear search
        int indx=-5;
        for(int i=0; i<n; i++){
            if (arr[i]==x){
                indx=i;
                break;

            }
        }
        if(indx==-5){
            System.out.println("Search element is not found");
        }
        else{
            System.out.println("Search element is found at location : "+indx);
        }




//
//        Scanner sc=new Scanner(System.in);
//
////        Size of an element from the user
//        System.out.println("Enter the number of elements present in an array :");
//
//        int n=sc.nextInt();
//
////        Array elements entered from the user
//        System.out.println("Enter the array elements :");
//        int [] arr=new int[n];
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
////            target element from the user
//            System.out.println("Enter target element :");
//            int x=sc.nextInt();
//
////            implements of linear search
//            int index=-1;
//            for(int i=0; i<n; i++){
//                if(arr[i]==x){
//                    index=i;
//
//                }
//            }
//            if(index==-1){
//                System.out.println("Searched element is not found in an array");
//            }
//            else{
//                System.out.println("Searched element is found at the location :"+index);
//            }


    }
}
