//TERNARY IF ELSE YA NESTED IF KA KAM KARTA HAI BUT TERNARY IF ELSE KA SHORTCUT METHID HAI KAM DONO SAME KARTA HAI,DONO KA SYNTAX DIFFERENT HAI

public class TERNARY_CONDITION
{
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        int c=15;
//        int res=(a>b)? a :(b>c? b:c);
//        {
//            System.out.println(res);
//        }

        int res=(a>b)?a:((b>c)?b:c);

        System.out.println(res);

    }
}
