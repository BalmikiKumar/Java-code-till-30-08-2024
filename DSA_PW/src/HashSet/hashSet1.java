package HashSet;

import java.util.Date;
import java.util.HashSet;

public class hashSet1 {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("James");
        st.add("Jon");
        st.add("James"); //not add because hashset is store only unique value

        System.out.println(st);
        System.out.println(st.contains("Jon"));
        System.out.println(st.size());
        System.out.println(st.remove("Jon"));
        st.add("Ram");

        for(String s:st){
            System.out.println(s);
        }

    }
}
