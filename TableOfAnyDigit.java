package LoopProblems;
// Table of a any given number
import java.util.*;
public class TableOfAnyDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*" +i+"="+(a*i));
        }
    }
}
