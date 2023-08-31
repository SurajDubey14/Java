package TypeCasting;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        double d=253152.51515;
        long  l = (long)d;
        int i= (int) l;
        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
    }
}