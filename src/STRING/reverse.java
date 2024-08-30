package STRING;

public class reverse {
    public static void main(String[] args) {

        ////split
//        String str1="Balmiki kumar";
//        String str2="";
//        String sarry[]=str1.split(" ");
//        for (int i= sarry.length-1; i>=0;i--)
//        {
//            str2=str2+sarry[i]+" ";
//        }
//        str2=str2.toUpperCase();
//        System.out.println("Before spliting :"+str1);  // Balmiki kumar
//        System.out.println("After spliting :"+str2);   // KUMAR BALMIKI

// // gap delete
//        String str1="ram shyam ";
//        String str2=str1.replace("shyam","sita");
//        System.out.println(str2); // ram sita

//  // reverse
//        String str1="balmiki kumar";
//        String str2="";
//        for(int i=str1.length()-1; i>=0 ;i--)
//        {
//            str2=str2+str1.charAt(i);
//        }
//        System.out.println(str2);  //ramuk ikimlab


//         //REVERSE BUT INDEX NOT CHANGE LONG PROCESS
//        String str1="balmiki kumar";
//        String str2= "";
//        for (int i=str1.length()-1; i>=0; i--)
//        {
//            str2=str2+str1.charAt(i);
//        }
////        System.out.println(str2);
//        String str3="";
//        String str4[]=str2.split(" ");
//        for (int i= str4.length-1; i>=0 ; i--)
//        {
//            str3=str3+str4[i]+ " ";
//        }
//        System.out.println(str3);   // ikimlab ramuk

        //REVERSE BUT INDEX NOT CHANGE SHORT PROCESS USING ENCHANCE FOR LOOP
        String str="balmiki kumar";
        String str2="";
        String array[]=str.split(" ");
        for ( String elemeng:array)
        {
            for(int i=elemeng.length()-1; i>=0; i--)
            {
                str2=str2+elemeng.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);  // ikimlab ramuk

        String a=new String("bal");
        for(int b=0;b<a.length();b++)
        {

            System.out.println(a.charAt(b));
        }

    }
}
