package Project;


import java.util.Random;
import java.util.Scanner;

  class Guesser {
    int numByGuesser;
    int numByPlayer1;
    int numByPlayer3;
    int numByPlayer2;

    String p1Name;
    String  p2Name;
    String p3Name;

// setNumByGuesser() method is used for taking a random number between 0 and 101


    public void setNumByGuesser() {

        System.out.println("");
        Random random=new Random();
        numByGuesser=random.nextInt(101);
        System.out.println("The number chosen by the Guesser is : → "+numByGuesser);
        System.out.println("");

        //invoked this method
        setNumByPlayer1();
    }

// setNumByPlayer1() method is used for taking the name and number of player 1

    public void setNumByPlayer1() {
        System.out.println("Player1 Plz enter your name : ");
        Scanner sc=new Scanner(System.in);
        p1Name=sc.nextLine().toUpperCase();
        // p1Name=p1Name.toUpperCase();
        System.out.println( "Hello "+ p1Name+",\n   plz guess a number");
        try {
            Scanner scanner = new Scanner(System.in);
            numByPlayer1 = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("WARNING ! \n"+ p1Name+" plz choose only digit otherwise you will not consider for this game");
            try {
                Scanner scanner = new Scanner(System.in);
                numByPlayer1 = scanner.nextInt();
            }
            catch (Exception ee){
                System.out.println(p1Name+" you lost only for this game");

            }

        }

        //invoked this method
        setNumByPlayer2();
    }

// setNumByPlayer2() method is used for taking the name and number of player 2

    public void setNumByPlayer2() {
        System.out.println("\nPlayer2 Plz enter your name : ");
        Scanner sc=new Scanner(System.in);
        p2Name=sc.next();
        p2Name=p2Name.toUpperCase();
        System.out.println( "Hello "+ p2Name+",\n   plz guess a number");
        try {
            Scanner scanner = new Scanner(System.in);
            numByPlayer2 = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("WARNING ! \n"+ p2Name+" plz choose only digit otherwise you will not consider for this game");

            try {
                Scanner scanner = new Scanner(System.in);
                numByPlayer2 = scanner.nextInt();
            }
            catch (Exception ee){
                System.out.println(p2Name+" you lost only for this game");

            }
        }

        //invoked this method
        setNumByPlayer3();
    }

    // setNumByPlayer3() method is used for taking the name and number of player 3
    public void setNumByPlayer3() {
        System.out.println("\nPlayer3 Plz enter your name : ");
        Scanner sc=new Scanner(System.in);
        p3Name=sc.next();
        p3Name=p3Name.toUpperCase();
        System.out.println( "Hello "+ p3Name+",\n   plz guess a number");
        try {
            Scanner scanner = new Scanner(System.in);
            numByPlayer3 = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("WARNING ! \n"+ p3Name+" plz choose only digit otherwise you will not consider for this game");

            try {
                Scanner scanner = new Scanner(System.in);
                numByPlayer3 = scanner.nextInt();
            }
            catch (Exception ee){
                System.out.println(p3Name+" you lost only for this game");
            }
        }

        //invoked this method
        Umpire();
    }

    //Umpire() method is used for checking whose player are winner
    public void Umpire() {
        if (numByGuesser == numByPlayer1) {
            if (numByPlayer1 == numByPlayer2 && numByPlayer1 == numByPlayer3) {
                System.out.println("Congratulation ☺ EXCELLENT [ "+p1Name+" , "+p2Name+" , "+p3Name+" ] \n  You all are won this game");
            } else if (numByPlayer1 == numByPlayer2) {
                System.out.println("Congratulation ☺ good [ "+p1Name +" , "+ p2Name +" ] You both are won the game");
            } else if (numByPlayer1 == numByPlayer3) {
                System.out.println("Congratulation ☺ good [ "+p1Name +" , "+ p3Name +" ] You both are won the game");
            } else {
                System.out.println("Congratulation ☺ "+p1Name +", you won the this game");
            }

        } else if (numByGuesser == numByPlayer2) {
            if (numByPlayer2 == numByPlayer3) {
                System.out.println("Congratulation ☺ good [ "+p2Name +" , "+p3Name +" ] you both are won the game");
            } else {
                System.out.println("Congratulation ☺ "+p2Name +", you won the game");
            }

        } else if (numByGuesser == numByPlayer3) {
            System.out.println("Congratulation ☺ "+p3Name+", you won the game");
        } else {
            System.out.println("All players are looser this game");
        }

        //invoked this method
        Disp();

    }

    //Disp() method is use here for again playing the game (if player want).
    public void Disp() {

        System.out.println("\n                      *****************************\n");
        System.out.println("If you want to play this again press :► Y otherwise press any key for terminating this game )");


        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c == 'Y' || c == 'y') {
            //invoked this method
            setNumByGuesser();
        } else {
            System.out.println("\nTHANK YOU FOR PLAYING THIS GAME\n");
            System.out.println("             Game End!");
        }

    }
}


public class guesserGameWithin1Class {

    public static void main(String[] args) {
        Guesser guesser=new Guesser();
        guesser.setNumByGuesser();




    }
}
