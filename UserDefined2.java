// NO ARGUMENTS ARE PASSED BUT RETURN VALUE

package Method;

public class UserDefined2 {
    public static int SumOfTwoNumber() {
        int a = 50;
        int b = 20;
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int a=SumOfTwoNumber();
        System.out.println(a);
    }
}
