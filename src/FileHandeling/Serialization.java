package FileHandeling;

import java.io.*;

//import java.io.*;
class Cricketer implements Serializable {
    private String name;
    private int age;
   // transient int age; //use transient keyword for not participate in Serializatioin
    private int runs;

    public Cricketer(String name, int age, int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    public void Dsp(){
        System.out.println("Name : "+name +"\nAge : "+age +"\nRuns : "+runs);
    }


}

public class Serialization {
    public static void main(String[] args) throws Exception{

//        Cricketer cricketer=new Cricketer("Balmiki",20,9959);
//
//        //Serialization work
//        FileOutputStream fos=new FileOutputStream("pw.txt");
//        BufferedOutputStream bos=new BufferedOutputStream(fos);
//
//        ObjectOutputStream oos=new ObjectOutputStream(bos);
//        oos.writeObject(cricketer);
//        oos.flush();
//        oos.close();
//
//        System.out.println("object is stored int pw.txt file that present is in the PW Folder");



        //DeSerialization work
        FileInputStream fis=new FileInputStream("pw.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer cr=(Cricketer)ois.readObject();

        cr.Dsp();
        ois.close();

    }
}
