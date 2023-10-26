package OOPS.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        cal c= new cal();
        c.sum(2,5);
        c.sum((float)2.5,(float)2.6);
    }
}



class cal{

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(float a,float b){
        System.out.println(a+b);
    }
}