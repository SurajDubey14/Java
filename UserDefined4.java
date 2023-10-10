//ARGUMENTS ARE PASSED AND RETURN VALUE

package Method;
import java.util.*;

public class UserDefined4{
    public static int SumOfTwoNumber(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c=SumOfTwoNumber(a,b);
        System.out.println(c);
    }
}