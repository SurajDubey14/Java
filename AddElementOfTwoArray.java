package Array;

import java.util.*;
public class AddElementOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        for (int j=0;j<b.length;j++){
            b[j]= sc.nextInt();
            sum+=b[j];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }
        System.out.println(sum);
    }
}
