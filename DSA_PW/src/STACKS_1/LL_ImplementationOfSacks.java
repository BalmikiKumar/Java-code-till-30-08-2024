package STACKS_1;
// its never be full
public class LL_ImplementationOfSacks {
    public static class Node{ //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{  //user defined data structure
        private Node head=null;
       private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){ //getter
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }


    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
         st.push(1);
         st.display();
        st.push(2);
        st.display();
        st.push(13);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(101);
        st.display();



    }
}
