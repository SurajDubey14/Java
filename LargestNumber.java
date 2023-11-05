package Array;
import java.util.*;

public class LargestNumber {
    public static int largestnumber(int number[]){
        int largest= Integer.MIN_VALUE;  //-ve infinity
        int smallest= Integer.MAX_VALUE;   //+ve infinity
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5};
        System.out.println("largest number is "+largestnumber(number));
    }
}
