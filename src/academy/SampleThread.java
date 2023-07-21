package academy;

public class SampleThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
    }
}
