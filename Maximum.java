package Method;
import java.util.*;
public class Maximum {

    public static  int max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int result=max(a,b);
        System.out.println(result);
    }
}
