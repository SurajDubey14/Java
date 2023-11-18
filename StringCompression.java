package String;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder("");
        for(int i =0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){ //O(N)
                count++;
                i++;
            }

            
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
}
