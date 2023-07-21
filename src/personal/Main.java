package personal;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
////        myThread.start();
//
//        for (int i = 0; i <= 20; i++) {
//            System.out.println(" my main method" +i);
//
//        }

        // to run using runnable interface
//        MyRunnable myRunnable = new MyRunnable();
//        Thread myThread = new Thread(myRunnable);
//        myThread.start();
//        for (int i = 0; i <= 20; i++) {
//            System.out.println(" my main method" + i);
//            System.out.println("my name "+ myThread.getName() + " Priority "+ myThread.getPriority());
//        }
        Table table = new Table();
        MyThread1 myThread1 = new MyThread1(table);
        myThread1.start();

        MyThread2 myThread2 = new MyThread2(table);
        myThread2.start();


         DeyPlay deyPlay = new DeyPlay();


    }
}
