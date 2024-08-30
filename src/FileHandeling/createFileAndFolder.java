package FileHandeling;
import java.io.*;

public class createFileAndFolder {
    public static void main(String[] args) throws IOException {

        File directory=new File("FileHandelinggggg"); //File or folder can be also create with help of class FileOutputStream
        if(directory.mkdir()){
            System.out.println("Directory created");
        }
        else{
            System.out.println("some problem for making directory");
        }
        File file=new File(directory,"file1.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created within FileHandelinggggg");
            } else {
                System.out.println("filen't created");
            }
        }catch (Exception e){
            System.out.println("some problem");
        }

        //FOR READING PURPOSE FROM FileHandelinggggg folder within file1.txt file
        //read all character in next line
        try(FileInputStream fi=new FileInputStream("FileHandelinggggg\\file1.txt")){
        int i;char c;

        i=fi.read();
        while(i !=-1){
            System.out.print(i+"---->");
            System.out.print((char)i);
            i=fi.read();
            System.out.println();
        }


//            while ((i = fi.read()) != -1) {
//                System.out.print(i);
//                System.out.print((char) i);
//            }
        }
        catch (Exception e){
            System.out.println("some problem");
        }

        //FOR WRITING PURPOSE IN FileHandelinggggg folder within file1.txt file
        FileWriter fw=new FileWriter("FileHandelinggggg\\file1.txt",true); // use here true for append data in txt file
        BufferedWriter bf=new BufferedWriter(fw);
        try {
            bf.write("My name is Balmik kumar from chhapanna ,  ");

        }
        catch (Throwable f){
            System.out.println(f);
        }
        finally {

            bf.flush();
            // fw.close();
        }
        String st="Cimage";
        bf.write(st);

        System.out.println("\n          ********************");

        //reading data
        try(FileInputStream fis=new FileInputStream("FileHandelinggggg//file1.txt")){
            int i; char c;
            while((i=fis.read()) !=-1){
                c=(char)i;
                System.out.print(c);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }


        File file1=new File("D:\\RAJU_SIR_JAVA");
        System.out.println("\n\nAll file that are present in RAJU_SIR_JAVA Folder \n");
        String fileName [] =file1.list();
        for(String fileNamee:fileName){
            System.out.println(fileNamee);
        }

    }
}
