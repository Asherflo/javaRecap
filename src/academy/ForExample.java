package academy;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        int number = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println(" ");
        }
    }

    }
