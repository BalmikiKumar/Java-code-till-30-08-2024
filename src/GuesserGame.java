import java.util.Scanner;

class Guesser
{

    int guessNum;
    public int gussingNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesserr plz Guess the number :");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player1
{
    int guessNum;
    public int guessingNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player1 plz guess the number :");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player2
{
    int guessNum;
    public int guessingNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player2 plz guess the number :");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player3
{
    int guessNum;
    public int guessingNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player3 plz guess the number :");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumberfromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.gussingNum();
    }

    public void collectNumberFromPlayer1() {
        Player1 p1 = new Player1();
        numFromPlayer1 = p1.guessingNum();
//        numFromPlayer2=p.guessingNum();
//        numFromPlayer3=p.guessingNum();
    }
    public void collectNumberFromPlayer2()
    {
        Player2 p2=new Player2();
        numFromPlayer2=p2.guessingNum();
    }
    public void collectNumberFromPlayer3()
    {
        Player3 p3 =new Player3();
        numFromPlayer3=p3.guessingNum();
    }


    public void Compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromPlayer1 == numFromPlayer2 && numFromPlayer1 == numFromPlayer3)
            {
                System.out.println("Aap sab ke sab match jit gaye");
            }
            else if (numFromPlayer1 == numFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 won the match");
            } else if (numFromPlayer1==numFromPlayer3)
            {
                System.out.println("Player 1 and Player 3 won the match");
            }
            else { System.out.println("Player 1 won the match");}

        }
        else if (numFromGuesser==numFromPlayer2)
        {
            if(numFromPlayer2==numFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the match");
            }else{System.out.println("Player 2 won the match");}

        } else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player 3 won the match");
        }
        else
        {
            System.out.println("Each player has input incorrect number");
        }

    }
     static public void Disp()
    {
        System.out.println("Game End!");
    }
}
public class GuesserGame {
    public static void main(String[] args) {

        System.out.println("Jai Bhole Nath");
        System.out.println("Game started !");

        Umpire u=new Umpire();
        u.collectNumberfromGuesser();
        u.collectNumberFromPlayer1();
        u.collectNumberFromPlayer2();
        u.collectNumberFromPlayer3();
        u.Compare();
        Umpire.Disp();
    }
}
