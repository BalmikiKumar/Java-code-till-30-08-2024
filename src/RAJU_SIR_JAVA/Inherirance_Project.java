//PROGRAM FOR CHECK BOOKS DETAILS

package RAJU_SIR_JAVA;

import java.util.Scanner;

class Books{
    int pageNum;
    int price;
    String authorName,BookName;
    Books()
    {
        pageNum=665;
        price=2999;
        authorName="Raju Upadhyay";
        BookName="JAVA Based on Version 21.01";
        
    }
    
    public void displayInfo()
    {

        System.out.println("");
        System.out.println("         ♣***** Details of Books ♣");
        System.out.println("Bookname : "+BookName);
        System.out.println("Author name of this Book : "+authorName);
        System.out.println("Price of this book : "+price +"₹ ONLY");
        System.out.println("No. of pages : "+pageNum);
        System.out.println("");

    }

    protected void onlyDisplayInfoOfPaperBooks() {
        int priceOfPaperBook=price+40;
        System.out.println("              ☺****** Details of Paper Books ******☺");
        System.out.println("Bookname : "+BookName);
        System.out.println("Author name of this Book : "+authorName);
        System.out.println("Price of Paper book : "+priceOfPaperBook +" ₹ ONLY" +", Shipping Charge = 40");
        System.out.println("No. of pages : "+pageNum);
    }
}

class PaperBooks extends Books{
    int shippingCharges=40;
    int priceOfPaperBooks=price+shippingCharges;
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" ");
        System.out.println("        ♠***** Details of Paper books ******♠");
        System.out.println("Bookname : "+BookName);
        System.out.println("Author name of this Book : "+authorName);
        System.out.println("Price of Paper book : "+priceOfPaperBooks +" रामONLY" +" , Shipping Charge = 40");
        System.out.println("No. of pages : "+pageNum);

    }

    public void PP_Books()
    {

        displayInfo();

    }

    //ONLY FOR PAPER_BOOKS CLASS INFORMATION
    public void onlyDisplayInfoOfPaperBooks()
    {
        System.out.println("        ♣****** Details of Paper Books ******♣");
        System.out.println("Bookname : "+BookName);
        System.out.println("Author name of this Book : "+authorName);
        System.out.println("Price of Paper book : "+priceOfPaperBooks +" रामONLY" +", Shipping Charge = 40");
        System.out.println("No. of pages : "+pageNum);
    }

}

class E_Book extends Books{
    byte discount=40;
    int priceOfE_Book=price - discount;

    @Override
    public void displayInfo()
    {
        super.onlyDisplayInfoOfPaperBooks();  //for paper books
        super.displayInfo();  // override properties of paper books
        System.out.println("           ♦****** Details of E_books *****♦");
        System.out.println("Bookname : "+BookName);
        System.out.println("Author name of this Book : "+authorName);
        System.out.println("Price of Paper book : "+priceOfE_Book +"₹ONLY" +" because extra discount for E_Book = 40");
        System.out.println("No. of pages : "+pageNum);

    }




}



public class Inherirance_Project {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("      ♥♥♥♥♥________MENU________♥♥♥♥♥");
        System.out.println("");

//SWITCH CASE


        //ONLY FOR BOOKS CLASS INFORMATION
        Books bb = new Books();

        //ONLY FOR PAPER_BOOKS CLASS INFORMATION
        PaperBooks paperBooks = new PaperBooks();

        //ONLY FOR E_BOOKS CLASS INFORMATION
        E_Book e_book = new E_Book();

        //FOR ALL BOOKS INFORMATION


//        PaperBooks paperBooks=new PaperBooks();
//        paperBooks.PP_Books();


        int d;
        do {
            System.out.println("Press 1 for Books information");
            System.out.println("Press 2 for Paper books information");

            System.out.println("Press 3 for ALL Paper books information");
            System.out.println("Press 4 for check again books information");
            System.out.println("Press 5 for  exit");
            Scanner sc = new Scanner(System.in);

            d = sc.nextInt();
            switch (d) {

                case 1:
                    bb.displayInfo();
                    // e_book.displayInfo();
                    break;
                case 2:
                    paperBooks.onlyDisplayInfoOfPaperBooks();

                    break;

                case 3:
                    e_book.displayInfo();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("         ☺☺☺___THANK YOU VISIT AGAIN ON THIS APPLICATION ___☺☺☺");
                    break;
                default:
                    System.out.println("Please enter correct digit \uD83D\uDC46\uD83D\uDE4F\uD83D\uDC4F\uD83D\uDC4F");
                    break;

            }

        } while (d == 4);
        System.out.println("Program terminated ༺༒\u06DDBálmíkí࿐");


    }


}
