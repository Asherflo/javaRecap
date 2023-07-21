package academy;

public class TestSampleThread {
    public static void main(String[] args) {
        Thread t;
        Thread t1 ;
        while(true){
            t = new Thread(new SampleThread(),"Thread 1");
            t1 = new Thread(new SampleThread(),"Thread 2");

            t.start();
            t1.start();


        }
    }
}
