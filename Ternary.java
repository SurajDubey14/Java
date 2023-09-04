package Operator;

import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int min;
        min=(a>b)?a:b;
        System.out.println(min);
        //False pe b expression
        //True pe a expression
    }
}
