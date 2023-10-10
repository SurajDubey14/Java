//ARGUMENT PASSED BUT NOT RETURN VALUE

package Method;

public class UserDefined3 {
    public static void EvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        int a=24;
        EvenOdd(a);
    }
}
