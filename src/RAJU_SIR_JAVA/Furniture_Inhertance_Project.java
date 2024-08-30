//PROGRAM OF CHAIR AND BOOKSHELF
package RAJU_SIR_JAVA;

import java.util.Scanner;

class Furniture{
    String use;
    String madeWith;
    byte leg;
    int price;
    String design;
    String InteriorDecor;

    public Furniture()
    {
        use="Help in study or  rest";
        madeWith="Both are made with Wood or Plastic";
        leg =4;
        price =5000;
        design="Available in valrious form";
        InteriorDecor="Both contribute to room decor , chosen to match the style of the space";

    }

   public void displayInfo1()
    {
        System.out.println("         \uD83D\uDC47\uD83D\uDC47\uD83D_Details_\uDC47\uD83D\uDC47\uD83D\uDC47");
        System.out.println("Uses of Chair and Book_Shelf : "+use);
        System.out.println("Made with :- "+madeWith);
        System.out.println("Legs of Chair and BookShelf : "+leg);
        System.out.println("Design : "+design);
        System.out.println(InteriorDecor);


    }


}
class Chair extends Furniture{
    double height= 2.8;
    double width=2.1;
    int tpriceOfChair =price-2000;


    public void extraChairInfo()
    {
        System.out.println("Height of chair = "+height);
        System.out.println("Width of chair = "+width);
        System.out.println("Price of chair = "+tpriceOfChair);
        System.out.println("      _______ \uD83D\uDC46\uD83D\uDC46\uD83D\uDC46above details of Chair  \uD83D\uDC46\uD83D\uDC46\uD83D\uDC46_______");
    }

}
class bookshelf extends Furniture{

    double height= 6.8;
    double width=3.8;
    int tpriceOfBookshelf=price+50;

    public  void extraBookshelfInfo()
    {
        System.out.println("Height of chair = "+height);
        System.out.println("Width of chair = "+width);
        System.out.println("Price of chair = "+tpriceOfBookshelf);
        System.out.println("      _______ \uD83D\uDC46\uD83D\uDC46\uD83D\uDC46above details of Bookshelf  \uD83D\uDC46\uD83D\uDC46\uD83D\uDC46_______");
    }

}


public class Furniture_Inhertance_Project {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("     _____☺☺☺_____CHOICE FIELD_____☺☺☺_____");
        System.out.println("");

        Furniture furniture=new Furniture();


        Chair chair=new Chair();

        bookshelf book_shelf=new bookshelf();


        System.out.println();

        Scanner scan=new Scanner(System.in);
        int r;
        do{

            System.out.println("Press 1 for Chair Details :");
            System.out.println("Press 2 for Bookshelf Details :");
            System.out.println("Press 3 for EXIT");
            System.out.println("Press 4 for choice again option ---");
            r=scan.nextInt();

            switch (r)
            {
                case 1:
                    chair.displayInfo1();
                    chair.extraChairInfo();
                    break;
                case 2:
                    book_shelf.displayInfo1();
                    book_shelf.extraBookshelfInfo();
                    break;
                case 3:
                    break;

                default:
                    System.out.println("Please enter correct option \uD83E\uDD13\uD83D\uDE0E\uD83E\uDD13");
                    break;

            }
        }while (r==4);
        System.out.println("Program safely terminated_༺༒\u06DDBálmíkí࿐_");


    }

}