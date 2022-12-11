package lesson19;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable("T1"));
        Thread t2 = new Thread(new MyRunnable("T2"));
        Thread t3 = new Thread(new MyRunnable("T3"));
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
    }
}
