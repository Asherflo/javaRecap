package personal;

public class Table {
    // synchronizes in a method
    synchronized void  printable(int n){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

// synchronized in a block
//    void printTable(int n){
//        synchronized(this){
//            for (int i = 1; i < 5; i++) {
//                System.out.println(n*i);
//                try{
//                    Thread.sleep(400);
//                }catch(Exception e){
//                    System.out.println(e);
//                }
//            }
//        }
//
//    }

}
