package FileHandeling;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WriteDataInMiniStatement {

    //This method is used for read data from a file and copy data into other file
    public static void copyData(File a,File b) throws IOException {
        FileReader fr=new FileReader(a);
        FileWriter fw=new FileWriter(b);
        int i;
        while((i=fr.read())!=-1){
            fw.write(i);
        }
       // System.out.println(fw);
        fw.close();
    }
    public static void main(String[] args) throws Exception{

        FileReader fio=new FileReader("MiniStatement.txt");

        int i;char c;
        while((i=fio.read())!=-1){
            c=(char)i;
            System.out.println(c +"----> "+i);
        }

        File f=new File("Lecture4");
        if(f.isDirectory()){
            String arr[]= f.list();
            for(String s:arr){
                System.out.println(s);
            }
        }else {
            System.out.println("no available directory");
        }
        fio.close();


        //Provide locaton and call method
        File a=new File("MiniStatement.txt");
        File b=new File("file1.txt");
        copyData(a,b);


        int arr[][]={
                {1,2,3,11},{4,5},{7,8,9}
        };

         for(int i1=0;i1<arr.length;i1++){
             for(int j=0;j<arr[i1].length;j++){
                 System.out.print(arr[i1][j]+" ");
             }
             System.out.println();

        }
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);


int result=add(new int[]{5,6,8});
        System.out.println(result);

        String s= "Balmiki" ;
        String ss= "kumar";
       // String sss=
        System.out.println(s.concat(ss));
        System.out.println(s.concat(ss)+"kl");
//        System.out.println(sss);
//        System.out.println(sss.substring(2,5));
        System.out.println(ss.replace("kumar"," Yadav"));


        for(int i1=0;i1<s.length()-1;i1++){

            System.out.println(s.charAt(i1));
        }

        String g=new String("Sachin");
        String gg=g.toLowerCase();
        System.out.println(g==gg);
        g=g.replace('S','s');
        System.out.println(g);

        String st="peek";
        String stt="keepp";
        char []st1=st.toCharArray();
        System.out.println(st1);
        char st2[]=stt.toCharArray();
        Arrays.sort(st1 );
        Arrays.sort(st2);
        if(Arrays.equals(st1,st2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Panagram");
        }
        StringBuilder sb=new StringBuilder("Son");
        System.out.println(sb.reverse());
        sb.append(" sood");
        System.out.println(sb);
        sb.insert(1,"");


    }
    public static int add(int nums[]){
            int res=0;
            for(int ree:nums){
                res+=ree;
            }
            return res;
    }
}
