package LoopProblems;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=1;
        int b=1;
        System.out.print(a+" "+b);
        int c=0;
        for(int i=3;i<n+1;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
