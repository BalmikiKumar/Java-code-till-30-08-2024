package DateTime;

public class palindrome {
    public static void main(String[] args) {
//        int n=1234321,rev=0;
//        int p=n;
//        while(n !=0){
//            rev=n%10 + (rev*10);
//            n=n/10;
//        }
//        System.out.println(rev);
//      if(p==rev){
//          System.out.println("Palindrome");
//      }
//      else {
//          System.out.println("Not palindrome");
//      }
//        String s="abcd";
//       char ch[]= s.toCharArray();
//        for (int i=ch.length-1; i>=0; i--){
//            System.out.print(ch[i]);
//        }

        //peak number
        int arr[]={1,5,3,9,8,3,5,9};int p=0,ar=0;
        int l=arr.length;
        for(int i=1; i<l-2; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                p=arr[i] + ar+1;
                System.out.println("Peak number  : "+arr[i]);
            }
        }
        System.out.println(p);

    }
}
