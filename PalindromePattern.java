package Pattern;

public class PalindromePattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print(" ");
            }
//            first half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
//            second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
