package RAJU_SIR_JAVA;
import java.io.*;
import java.io.FileInputStream;

import java.io.ByteArrayInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
       // String s="This is a BufferedInputStream demo program";
        String s=new String("hello");
        byte buf[]=s.getBytes();
        System.out.println(buf);

        try(ByteArrayInputStream in =new ByteArrayInputStream(buf); BufferedInputStream f=new BufferedInputStream(in))
            {
                int c;
                while ((c=f.read()) !=-1){
                    System.out.print((char)c);
                  //  System.out.println("Available :"+f.available());
                }
                System.out.println("");
                System.out.println("*********");

            }
        catch (IOException e){
            System.out.println(e);
        }


        FileInputStream ff=new FileInputStream("D:\\Files\\File.txt");
        System.out.println("Available bytes ="+ff.available());
        int i;char c;
        while((i=ff.read()) !=-1){
            c=(char)i;
            System.out.println(i);
            System.out.print("Character are : "+c);
        }

//        //reads 3 bytes
//        System.out.println(ff.read());
//        System.out.println(ff.read());
//        System.out.println(ff.read());
//
//        //Returns the number of available bytes
//        System.out.println("Available bytes ="+ff.available());
//
//        ff.close();


//
//        public String toString();
//        {
//            return;
//        }
//        System.out.println(ff);

    }
}
