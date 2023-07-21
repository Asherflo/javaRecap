package academy;

public class ContinueExample {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        do{
            if(x==y/2){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        } while(x<=y);
    }
}
