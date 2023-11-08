//Finding the maximum and minimum number in an array

package Array;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int m =a[0];
        int n =a[0];
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        for(int i=1;i<a.length;i++){
            if(m<a[i]){
                m=a[i];
            }
            if(n>a[i]){
                n=a[i];
            }
        }
        System.out.println(m);
        System.out.println(n);
    }
}
