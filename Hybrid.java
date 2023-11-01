package OOPS.Inheritance;

public class Hybrid {
    public static void main(String[] args) {
        old ol= new old();
        ol.WhiteHair();
        ol.HardWork();
    }
}

class Human{
    void walk(){
        System.out.println("walk");
    }
}
class man{
    void HardWork(){
        System.out.println("HardWork");
    }
}
class female extends Human{
    void makeup(){
        System.out.println("makeup");
    }
}

class old extends man{
    void WhiteHair(){
        System.out.println("white Hair");
    }
}