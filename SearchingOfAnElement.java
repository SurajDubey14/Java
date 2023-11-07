// SEARCHING OF AN ELEMENT IN A ARRAY

package Array;

import java.util.*;

public class SearchingOfAnElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a[]=new int[5];
        System.out.println("Enter a number to verify the entered element is present is not");
        int b=sc.nextInt();
        System.out.println("Enter the element of an array");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.println("Element is found at index "+i);
            }
        }
    }
}
