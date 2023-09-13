package LoopProblems;
//printing the first n natural number and finding the sum of it
import java.util.*;
public class FirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n ; i++){
            System.out.println("First natural number till the input are " + i);
            sum=sum+i;
        }
        System.out.println("the sum of first "+ n + "natural number is "+ sum);
    }
}
