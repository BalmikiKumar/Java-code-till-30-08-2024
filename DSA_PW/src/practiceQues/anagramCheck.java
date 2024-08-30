package practiceQues;

import java.util.Arrays;

public class anagramCheck {
    public static void main(String[] args) {
        String str1="peek";
        String str2="keep";

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("its anagram");
        }else System.out.println("its not an anagram");

        System.out.println("____________________________");

        int [] arr={1,5,7,-1};
        int n=arr.length;
        int target=6;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                   // break;
                }
                //break;

            }break;
        }

    }
}
