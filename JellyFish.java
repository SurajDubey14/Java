package Condition;
// Jellyfish Question -  if iterate a loop to 1-100 if thw number is divided by 4 then print jelly if divided by 7 print fish if both then print jellyfish
public class JellyFish {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%4==0 && i%7==0){
                System.out.print(i+"-");
                System.out.println("Jellyfish");
            }else if(i%4==0){
                System.out.print(i+"-");
                System.out.println("Jelly");
            }else if(i%7==0){
                System.out.print(i+"-");
                System.out.println("Fish");
            }
        }
    }
}
