
// factorial using recursion
public class factorial {
    static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*(factorial(n-1));  //self work
    }
    public static void main(String[] args){
        System.out.println(factorial(6));
    }
}
