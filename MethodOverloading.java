//BY CHANGING THE NUMBER OF ARGUMENT

package Method;

import java.util.*;
public class MethodOverloading {
    public static void SumOfNumber(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void SumOfNumber(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        SumOfNumber(a,b);
        SumOfNumber(a,b,c);
    }
}
