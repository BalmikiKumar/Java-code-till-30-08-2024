package RAJU_SIR_JAVA;

import java.io.File;
import java.io.FileInputStream; //Closeable or AutoCloseable interfaces implemented in FileInputStream
import java.io.IOException;

public class FileInputStrreamDemo
{
    public static void main(String[] args)   //throws Exception
    {
   try(  FileInputStream f=new FileInputStream("D:\\Files\\File.txt") ){
       int i; char c;
       while((i=f.read())!=-1){

           c=(char)i;
           System.out.print(c);

      }

   }
   catch (Exception e)
   {
       System.out.println("s");
   }





    }
}

