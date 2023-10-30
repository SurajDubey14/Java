package OOPS.Inheritance;

public class Single {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
// Derived class
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}