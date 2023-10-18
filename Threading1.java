package MultiThreading;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<400){
            System.out.println("Hello Brother");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<400){
            System.out.println("Hello Pandatji");
            i++;
        }
    }
}
public class Threading1 {
    public static void main(String[] args) {
        MyThread1 th1= new MyThread1();
        MyThread2 th2= new MyThread2();
        th1.start();
        th2.start();

    }
}
