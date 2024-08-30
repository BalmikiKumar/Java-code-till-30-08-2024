

import java.util.Scanner;

public class Takeninput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.next();
        System.out.println("Name is: " + name);

        System.out.println("Enter your lucky number :");
        int num_ = sc.nextInt();

        System.out.println("Llucky Number is:"+num_);

    }
}


