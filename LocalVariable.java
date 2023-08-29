package Variable;

public class LocalVariable {
    public void add(){
        int a=10;
        int b=20;
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        LocalVariable l= new LocalVariable();
        l.add();
    }
}
