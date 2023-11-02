package OOPS.Inheritance;

public class HierarchialAnimal {
    public static void main(String[] args) {
        bird b= new bird();
        b.eat();
        b.fly();
    }
}
class animal{
    void  eat(){
        System.out.println("eat");
    }
}
class Mammals extends animal{
    void walk(){
        System.out.println("walk");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("swim");
    }
}
class bird extends animal{
    void fly(){
        System.out.println(" fly");
    }
}