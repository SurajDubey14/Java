//Given a route containing 4 direction

package String;

import java.util.*;

public class ShortestPath {
    public static float distance(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }else if(str.charAt(i)=='E') {
                x++;
            }else if(str.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        float a=distance(path);
        System.out.println(a);
    }
}
