package Encapsulation;

class Book
{
    private int PgNo;
    public void setPageNo(int x)
    {
        if(x>0)
        {
            PgNo=x;
        }
        else
        {
            System.out.println("Negative value is not allow for page no. in Book");
        }

    }
//    public int getPageNo()
//    {
//        return PgNo;
//    }
    public void Display()
    {
        System.out.println("Page no of book = "+PgNo);
    }
}


public class SetterGette {
    public static void main(String[] args) {
        System.out.println("hello world");
        Book b=new Book();
        b.setPageNo(100);
//        b.getPageNo();
        b.Display();

    }
}
