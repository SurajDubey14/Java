package OOPS.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats ");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}