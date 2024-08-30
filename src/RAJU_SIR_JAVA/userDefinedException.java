package RAJU_SIR_JAVA;
class IllegalAgeException extends Exception{
    public IllegalAgeException(String sms ){
        System.out.println(sms);


    }
}
public class userDefinedException {
    public static void main(String[] args)   {
        try {
            vote(120);
        }
        catch (Exception e){
            System.out.println(e);

        }
        System.out.println("finaly");

    }
    public static void vote(int age) throws IllegalAgeException {

            if(age < 18){
                throw new IllegalAgeException("you can't vote");
            }
            else{
                System.out.println("you can vote");
            }



    }
}