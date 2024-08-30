package Number_based_ques;

class checkP{
//    1st approach
    public int isPalindrome(int num){
        int originalNum=num;
        int rev=0;
        while (num !=0){                  //tc=0(n),sc=0(n)
            rev=num % 10 + (rev*10);
            num=num/10;
        }
        if(originalNum==rev) return 1;
        else return -1;
    }

    //2nd approach when number within array
    public void isPalindrome2(){    //tc=0(n), sc=0(1)
        int array[]={1,2,3,2,1};
        int l=array.length-1;
        int flag=0;
        for(int i=0; i<l/2; i++){
            if(array[i] != array[l-i]){
                flag=1;
                System.out.println("Not palindrome array");
                break;
            }
        }
        if(flag==0) System.out.println("Palindromic array");
    }
}
public class PalindromeNumber {
    public static void main(String[] args) {
        int number=12321;
        checkP p=new checkP();
        int result=p.isPalindrome(number);
        if(result==1) System.out.println("Given number is Palindrome");
        else System.out.println("Not Palindrome");


        //2nd approach
        p.isPalindrome2();

    }
}
