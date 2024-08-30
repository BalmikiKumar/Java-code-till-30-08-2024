//tc=time complexity, sc=space complexity

public class Reverse_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 9, 81,21};


//        //1st way, tc=bigo of n
//        int i=0;int n=arr.length;
//        for(i=n-1; i>=0;i--){
//           System.out.print(arr[i]+" ");
//        }


        //2nd way by swapping    tc=0(n), sc=(1)
        int n=arr.length;
        for(int i=0;i<n/2; i++){
            //swapping logic
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        System.out.println("Reversal array is.");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
