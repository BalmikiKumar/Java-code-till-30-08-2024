package Project;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

class at{
    float Balance;
    int pin;

    //how much times you transaction
    int tBalance;
    int tDeposit;
    int tWithdrawal;


    public void checkPin(){
        System.out.println("\nGenerate/Set your ATM pin : ");
        Scanner scanner=new Scanner(System.in);

        try{
            pin=scanner.nextInt();
            if(pin >=1000 && pin <=9999){
                System.out.println("Your ATM pin is set successfully ");

                int Pin=pin;
                System.out.println("Enter your pin :");
                try{
                Scanner sc=new Scanner(System.in);
                int pin=sc.nextInt();

                    System.out.println("Card is in the processing plz wait...");
                    Thread.sleep(1000);
                    if(Pin==pin) {
                        menu();
                    }else {
                        System.out.println("Pin is not correct");
                    }
                }
                catch (InputMismatchException | InterruptedException e){
                    System.out.println("Plz don't enter character or symbol");
                }


            }
            else {
                System.out.println("Enter only 4 digit ATM pin");
            }
        }catch (InputMismatchException e){
            System.out.println("Plz don't enter character, Set only 4 digit ATM pin");
        }


    }

    public void menu(){
        System.out.println("Enter your choice.....");
        System.out.println("1 for CHECK BALANCE");
        System.out.println("2 for DEPOSIT MONEY");
        System.out.println("3 for WITHDRAWL MONEY");
        System.out.println("4 for how much you do transaction");
        System.out.println("5 for EXIT");
        System.out.println("                         **********************************");

        Scanner sc=new Scanner(System.in);
        int num=0;
       try{
           num=sc.nextInt();
       }
       catch (InputMismatchException e){
           System.out.print("Plz don't enter character, ");
       }



        if (num==1){
            System.out.println("YOUR AVAILABE BALANCE IS : "+Balance + " rupees");
            tBalance++;

            greetin_continue();
        }
        else if (num==2) {
            System.out.println("Enter your money for deposit purpose...");
            Scanner dB=new Scanner(System.in);
            float dBalance=dB.nextFloat();
            Balance=Balance+dBalance;
            System.out.println(dBalance +" Rupees has been credited successfully");
            tDeposit++;

            greetin_continue();

        } else if (num==3) {
            System.out.println("Enter money for withdrawal purpose...");
            Scanner wB=new Scanner(System.in);
            float wBalance=wB.nextFloat();
            if(Balance<wBalance){
                System.out.println("Insufficient balance your balance is only "+Balance + "/-");
                tWithdrawal++;
                greetin_continue();
            }
            else {
                Balance = Balance - wBalance;
                System.out.println(wBalance + " Rupees has been withdrawal successfully");
                tWithdrawal++;

                greetin_continue();
            }
        } else if (num==4) {
          howMuchTimeTransaction();

        } else if (num==5) {
            System.out.println("Exited");

        }
        else {
            System.out.println("Invalid choice");
        }
    }

    public void greetin_continue(){
        System.out.println("Can you keep up for more transaction(Y/N)");
        Scanner mT=new Scanner(System.in);
        char mt=mT.next().charAt(0);
        if(mt=='Y' || mt=='y'){
            menu();


        }
        else{
            System.out.println("       ***** THANK YOU FOR VISITING OUR BANK  *****");

        }

    }

    public void howMuchTimeTransaction(){
        Date date=new Date();
        System.out.println("\n           Transactions Details :\n");
        System.out.println(tBalance +" Times check you balance at "+date);
        System.out.println(tDeposit +" Times Deposit you balance at "+date);
        System.out.println(tWithdrawal +" Times Withdrawal you balance at "+date +"\n");

        menu();
    }
}
public class atmm {
    public static void main(String[] args) {
        at a=new at();
        a.checkPin();

    }
}

