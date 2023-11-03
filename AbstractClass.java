package OOPS.Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//        chicken c = new chicken();
//        c.eat();
//        c.walk();
//        System.out.println(h.color);
//        Animal constructor--->horse ka constructor--->
        Mustang myhorse= new Mustang();
        //Animal--> horse-->Mustang

    }
}
abstract class Animal {
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract  void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void Changecolor(){
        color="darkbrown";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class chicken extends Animal{
    void Changecolor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}