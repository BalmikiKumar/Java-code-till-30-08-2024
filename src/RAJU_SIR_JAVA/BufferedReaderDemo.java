package RAJU_SIR_JAVA;

//USE OF BufferReader for taking input from keyboard and its takes only readLine() method

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br=new BufferedReader( new InputStreamReader(System.in))){
            System.out.println("Enter First number :");
            String s1=br.readLine();
            System.out.println("Enter second number :");
            String s2=br.readLine();

            String s3=s1+s2;
            System.out.println(s3);

            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int result=num1+num2;
            System.out.println("Result = "+result);
        }

        finally {
            System.out.println("some problem");
        }
    }
}
