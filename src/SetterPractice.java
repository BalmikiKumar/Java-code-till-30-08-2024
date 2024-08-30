class SetterPractice {
    private  int age;
    private String name;
    public void setName(String name)
    {
        this.name=name;
         System.out.println(name);
    }
    public String getName(){
        return name;
    }

}

class Demo{
    public static void main(String[] args) {
        System.out.println("\nStarted.......");

        SetterPractice st=new SetterPractice();
        st.setName("Ram");
        st.getName();

      //  st.setAge(26);




    }

}