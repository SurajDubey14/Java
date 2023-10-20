package MutiThreadingPracticeSet;
// Write a program to print good morning and welcome continuously on the screen in java using thread
// Adding sleep of 200ms
class GoodMorning implements Runnable{
    public void run(){
        int n=2;
        for(int i=0;i<=n;i++){
            try{
                Thread.sleep(200);
                System.out.println("GoodMorning");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class welcome implements Runnable{
    public void run(){
        int a=4;
        for(int i=0;i<=a;i++){
            System.out.println("Welcome");
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        GoodMorning gm= new GoodMorning();
        Thread th1= new Thread(gm);

        welcome wel= new welcome();
        Thread th2= new Thread(wel);
        th1.start();
        th2.start();

    }
}
