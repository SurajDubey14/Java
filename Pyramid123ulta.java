package Pattern;

public class Pyramid123ulta {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
