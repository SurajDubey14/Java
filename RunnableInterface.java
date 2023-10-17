package MultiThreading;

class MyRunnableClass1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
        System.out.println("Thread of first Runnable class");
    }
}

class MyRunnableClass2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
        System.out.println("Thread of Second Runnable class");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnableClass1 bullet1= new MyRunnableClass1();
        Thread gun1 = new Thread(bullet1);

        MyRunnableClass2 bullet2= new MyRunnableClass2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
