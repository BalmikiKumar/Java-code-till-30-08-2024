public class reverseNum {
    public static void main(String[] args) {
        System.out.println("Palimdrome");
        int num=123456;

        System.out.println(num/10);
        System.out.println(num%10);

        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }

}
