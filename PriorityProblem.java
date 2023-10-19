package MutiThreadingPracticeSet;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
        System.out.println("hello thread 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
        System.out.println("hello thread 2");
    }
}
public class PriorityProblem {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2= new MyThread2();
        t1.setPriority(5);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
