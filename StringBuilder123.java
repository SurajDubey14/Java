package String;

public class StringBuilder123 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //O(26)
        //O(n power 2)
        System.out.println(sb);
    }
}
