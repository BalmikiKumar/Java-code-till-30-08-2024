package Backtracking;

public class tilesProblem {
    public static int getWays(int x){
        int result=0;
        //base case
        if(x <=3){
            return x;
        }
        else {
           result = (x-1) + (x-2);
        }
        return  result;
    }
    public static void main(String[] args) {
          int num=8;
          //function calling
          int result=getWays(num);
        System.out.println(result);
    }
}
