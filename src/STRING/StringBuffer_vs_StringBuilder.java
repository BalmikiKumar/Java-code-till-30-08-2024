package STRING;

class Buffer
{
    public static void main(String[] args) {

//        StringBuilder cap=new StringBuilder();
//        System.out.println(cap.capacity());
//        cap.append("abcdefghijklmnop");
//        System.out.println(cap.capacity());
//        cap.append("s");
//        System.out.println(cap.capacity());


//        StringBuffer bal=new StringBuffer("balmiki");
//        System.out.println(bal.capacity());
//        System.out.println(bal.charAt(2));
//        bal.setCharAt(1,'A');
//        System.out.println(bal);
//        StringBuilder sb=new StringBuilder("pwjava");
//        System.out.println(sb.reverse());
//        System.out.println(sb.capacity());



        StringBuilder trim=new StringBuilder("java");
        System.out.println(trim);                      //trim=java
        System.out.println(trim.capacity());     //default value 16+4(java)=20
        trim.trimToSize();  // trimtoSize() method capacity ko reference obj me jitna value hota hai uske barabar kar deta hai
        System.out.println(trim.capacity());   //(java=4) =4



    }
}