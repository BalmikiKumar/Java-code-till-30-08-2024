package Queue;



//Linked list implementation using Queue
public class LLImplementation {
    public static class Node{ //User defined data type
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LLqueue{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty"); return 0;
            }
            return head.data;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x= head.data;
            head=head.next;
            size--;
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            while (temp !=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
    }
    public static void main(String []args){
            LLqueue q1=new LLqueue();
            q1.display();
        System.out.println(q1.isEmpty());
            q1.add(1);
        System.out.println(q1.isEmpty());
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);
       q1.display() ;
        System.out.println(q1.peek());
        System.out.println(q1.remove());
      q1.display() ;
        System.out.println(q1.size);


    }

    }
}
