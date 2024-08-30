public class fibonacchi_series {
  static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        //sub problem- recursive work
        int prev=fib(n-1);
        int prevprev=fib(n-2);

        // self work
        return prev + prevprev;
       // return fib(n-1) + fib(n-2);   // UPER KA 3 LINE KE BADLE ME 1 LINE(SUB PROBLEM , SELF WORK)
    }

    public static void main(String[] args) {
        System.out.println("Diye huye n value ka fibonacchi number");
        System.out.println("Fibonacci number of given position n = " + fib(8));

//        System.out.println("Total fibonacchi series");
//        for(int i=0; i < 10; i++){
//            System.out.println(fib(i));
        }
    }

