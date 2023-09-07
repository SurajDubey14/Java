package Condition;

import java.util.*;
public class Integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }else if(n<0){
            System.out.println("the number is negative");
        }else{
            System.out.println("the number is  not  negative nor positive");
        }
    }
}
