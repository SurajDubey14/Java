// TAKING AN ARRAY AS A INPUT FROM THE USER AS INPUT

package Array;
import java.util.*;
public class Create {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int arr[]=new int[5];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }

