//CREATE NEW NODE ACCORDING TO USER AND PRINT ALL NODE DATA

import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class createNewNode {
    public static Node createNode(){
        char ch;
        Node head,p,q;
        head=new Node();
        System.out.println("Enter First data : ");
        Scanner scanner=new Scanner(System.in);
        head.data=scanner.nextInt();
        head.next=null;
        p=head;

        System.out.println("Enter more data(y/n) :");
        ch=scanner.next().charAt(0);

        while(ch=='y' || ch=='Y'){
            q=new Node();
            System.out.println("Enter data : ");
            q.data=scanner.nextInt();
            q.next=null;
            p.next=q;
            p=q;

            System.out.println("Enter more data(y/n) :");
            ch=scanner.next().charAt(0);
        }
        return head;
    }
    //for printing
    public static void Traverse(Node h){
        System.out.print("Data are : ==> ");
        while(h !=null){
            System.out.print(h.data +" , ");
            h=h.next;
        }
    }

    public static void main(String[] args) {
        Node h;
        h=createNode();
        Traverse(h);
    }

}
