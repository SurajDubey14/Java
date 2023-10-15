package Method;

import java.util.*;
public class MethodOverloading2 {
    public static int SumOfNumber(int a,int b){
        int c=a+b;
        return c;
    }
    public static double SumOfNumber(double a,double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a=SumOfNumber(10,50);
        double b=SumOfNumber(60.2,45.25);
        System.out.println(a);
        System.out.println(b);
    }
}