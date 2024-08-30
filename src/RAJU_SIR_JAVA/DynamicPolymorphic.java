package RAJU_SIR_JAVA;

class Animal{
    int y=9;
    int a;

    void makeSound()
    {
        System.out.println("Animal makes a sound");

    }

    Animal(int a)
    {
        this.a=a;
    }
    void aValue(){
        System.out.println(a);
    }
}
class Dog extends Animal{
    Dog ()
    {
        super(20);

    }
    Dog (int a)
    {
        super(2);
    }
    void makeSound()
    {
        System.out.println("Dog barks");

    }
    void fetch()
    {
        System.out.println("Dog fetch");
    }

}
class Cat extends Animal{

    Cat() {
        super(1);
    }

    void makeSound()
    {
        System.out.println("Cat meows");
    }
    void climb()
    {
        System.out.println("Cat climbs a tree");
    }
}

public class DynamicPolymorphic {
    public static void main(String[] args) {
      Animal animal1=new Dog();
      Animal animal2= new Cat();

     animal1.makeSound();//Dynamic dispatch:invokes Dog's overriden makeSound method
     animal2.makeSound();//Dynamic dispatch:invokes Cat's overriden makeSound method

     //Uncommenting the lines below would result in a comilation error
        // because the reference type does'nt have access to fetch or climb methods.

   //     animal1.fetch();
//     animal2.climb();

            animal1.aValue();

    }
}
