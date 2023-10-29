package OOPS.Interface;

public class MultipleInheritance {
    public static void main(String[] args) {
        son beta= new son();
        beta.care();
        beta.property();
    }
}
interface Father{
    void property();
}

interface mother{
    void care();
}

class son implements mother,Father{
    public void property(){
        System.out.println("Father gives property to sun");
    }
    public void care(){
        System.out.println("Mother give all her care to sun");
    }

}