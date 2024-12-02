package collegctionFramework;


import java.util.*;
import java.util.Set;

class ObjectCompareHashSet{
    public static void main(String[] args) {
        System.out.println("In case of user defined data type we compare two object and avoid duplicate entry on hashset using @Override hashcode and equals method");

        Set<Animal> set=new HashSet<>();
        Animal a1=new Animal("Dog",12);
        Animal a2=new Animal("Cat",13);
        Animal a3=new Animal("Dog",12);
        Animal a4=new Animal("Lion",8);

        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);

        System.out.println(set);

    }
}

class Animal{
    public String name;
    public int age;

    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name);
    }

    //after overriding hashCode and equals method we enter only unique entry
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}