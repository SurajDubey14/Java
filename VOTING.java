package Condition;
import java.util.*;
public class VOTING {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if (age<18){
            System.out.println("not mature");
        } else if (age<48 || age==18 ) {
            System.out.println("mature");
        }else{
            System.out.println("Adult");
        }
    }
}
