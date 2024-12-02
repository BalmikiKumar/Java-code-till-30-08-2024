public class countStair {
    public static int countWays(int n){
           int prev1=1, prev2=1, current;
           for(int i=2;i<=n; i++){
               current=prev1+prev2;
               prev2=prev1;
               prev1=current;
        }
           return prev1;
    }

    public static void main(String[] args) {
        System.out.println("For n=1, no. of ways : "+countWays(1));
        System.out.println("For n=2, no. of ways : "+countWays(2));
        System.out.println("For n=3, no. of ways : "+countWays(3));
        System.out.println("For n=4, no. of ways : "+countWays(4));
        System.out.println("For n=5, no. of ways : "+countWays(5));
        System.out.println("For n=6, no. of ways : "+countWays(6));

    }

}
