import java.util.Random;

public class de {
    public static void main(String[] args) {
       Test t=new Test();
        System.out.println(t.x+" "+t.y);

        forOtp o=new forOtp();
        o.otpGenerator();
       }
    }


    class Test{
    protected int x,y;
    }


    class forOtp {
        void otpGenerator(){
            int otp=0;
            Random random=new Random();
            otp=random.nextInt(1000,9999);
            System.out.println("OTP : "+otp);
        }
    }