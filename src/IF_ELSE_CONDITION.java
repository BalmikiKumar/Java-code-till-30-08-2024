//IF AND ELSE IF AND NESTED IF CONDITION

import java.util.Scanner;

public class IF_ELSE_CONDITION
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age <=50 || age ==5 )
        {
            if (age ==5)
            {
                System.out.println("now you are child");
            }
            else if (age <=10)
            {
                System.out.println("you are hosiyar but you can not vote");
            } else if (age <=17)
            {
                System.out.println("voting karne me aapko abhi 1 year der hai");
            } else if (age >=17 && age <50)
            {
                System.out.println("you can vote");
            }

        }
        else if (age >50 && age <60)
        {
            System.out.println("you can not vote only this year");
        }
        else
        {
            System.out.println("you can not vote because your thinking process is loss");
        }
    }
}
