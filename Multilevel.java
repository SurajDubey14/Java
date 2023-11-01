package OOPS.Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        dog d= new dog();
        d.eat();
        d.legs=5;
        System.out.println(d.legs);
    }
}
class human{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
class mammal extends human{
    int legs;
}
class dog extends mammal{
    String breed;
}