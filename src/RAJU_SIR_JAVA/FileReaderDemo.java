package RAJU_SIR_JAVA;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String args[])
    {
        try (FileReader f = new FileReader("D:\\Files\\file.txt "))
        {
            char[] a = new char[50];
            f.read(a);

            for (char c : a){

                System.out.print(c);
            }

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
