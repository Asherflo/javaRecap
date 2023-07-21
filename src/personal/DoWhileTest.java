package personal;

public class DoWhileTest {
    public static void main(String[] args) {
        int count =13;
        do {
            System.out.println(" not divisible by 2");
        }
        while(count%2==0);
        count++;
        System.out.println(" divisible by 2");
    }
}
