package STACKS_1;
//Create self Stack self_build_in_method like pop,push,peek,size,display.....



//Array implementation of Stack
public class ARI_self_build_in_method {
    public static class Stack{

        private int arr[]=new int[5];
        private int idx=0;

         void push(int x){
            // preventing stackoverflow error
            if(isFull()==true){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        //peek()
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        //pop()
        int pop(){
             if(idx==0){
                 System.out.println("Stack is empty");
                 return -1;
             }
             int top=arr[idx-1];
             idx--;
             return top;

        }
        //create display()
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        //create size()
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0)return true;
            else return false;
        }
        boolean isFull(){
            if(arr.length==idx) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {

        Stack st=new Stack();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.push(1);
        st.display();
        st.push(2);
        st.display();
st.push(6);
st.push(5);
        System.out.println(st.size());
        st.display();
        st.pop();
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());



    }
}
