package String;

import org.jetbrains.annotations.NotNull;

public class Length {

    public static void print(@NotNull String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String Full= "Rahul";
        String last= "Pandat";
        System.out.println(Full.length());
        System.out.println(Full+" "+last);
        System.out.println(last.charAt(1));
        print(last);
    }
}