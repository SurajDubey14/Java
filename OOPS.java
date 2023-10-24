package OOPS.Super;

public class OOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.Color);
    }
}
class Animal{
    String Color="Brown";
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.Color="Black";
        System.out.println("Horse Constructor is called");
    }
}