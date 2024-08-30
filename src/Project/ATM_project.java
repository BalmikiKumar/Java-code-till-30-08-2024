package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

class atm{
    int pin;
    float Balance;

    public void pin_verified() {


        System.out.println("Enter your pin :");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        try {
            System.out.println("Card is in the processing plz wait...");
            Thread.sleep(2000);
            if (enteredPin == pin) {
                menu();
            } else {
                System.out.println("Please enter a valid pin");

            }


        } catch (Exception e) {
            pin_verified();
            System.out.println("Error " + e);
        }



    }

    public void menu(){
        System.out.println("Enter your choice.....");
        System.out.println("1 for CHECK BALANCE");
        System.out.println("2 for DEPOSIT MONEY");
        System.out.println("3 for WITHDRAWL MONEY");
        System.out.println("4 for EXIT");
        System.out.println("                         **********************************");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num==1){
            System.out.println("YOUR AVAILABE BALANCE IS : "+Balance + " rupees");

            greetin_continue();
        }
        else if(num==2){
            System.out.println("Enter your money for deposit purpose...");
            Scanner dB=new Scanner(System.in);
            float dBalance=dB.nextFloat();
            Balance=Balance+dBalance;
            System.out.println(dBalance +" Rupees has been credited successfully");

            greetin_continue();
        }
        else if (num==3) {
            System.out.println("Enter money for withdrawal purpose...");
            Scanner wB=new Scanner(System.in);
            float wBalance=wB.nextFloat();
            if(Balance<wBalance){
                System.out.println("Insufficient balance your balance is only "+Balance + "/-");
                greetin_continue();
            }
            else{
                Balance=Balance-wBalance;
                System.out.println(wBalance +" Rupees has been withdrawl successfully");

                greetin_continue();
            }

        }
        else if(num==4){
         //return;



        }
        else{
            System.out.println("Please enter a valid choice");
        }


    }

    public void greetin_continue(){
        System.out.println("Can you keep up for more transaction(Y/N)");
        Scanner mT=new Scanner(System.in);
        char mt=mT.next().charAt(0);
        if(mt=='Y' || mt=='y'){
            menu();
            System.out.println("       ***** THANK YOU FOR VISITING OUR BANK  *****");

        }
        else{
            System.out.println("       ***** THANK YOU FOR VISITING OUR BANK  *****");

        }

    }



    public void GeneratePin(){
        System.out.print("Generate/Set your ATM pin : ");
        Scanner scanner=new Scanner(System.in);
        try{
            pin=scanner.nextInt();
            if(pin >=1000 && pin <=9999){
                System.out.println("\nYour ATM pin is set successfully ");
                pin_verified();
            }else {
                System.out.println("Plz enter only 4 digit number\n");
                GeneratePin();
            }

        }catch (InputMismatchException e){
            System.out.println("Incorrect input (only enter 4 digits number)\n");
            GeneratePin();
        }finally {
            scanner.close();
        }

}
}

public class ATM_project {
    public static void main(String[] args) {
        System.out.println("jai shree ram");

        atm at = new atm();
        at.GeneratePin();
        at.pin_verified();
    }
}

