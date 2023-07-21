package academy;

public class LabeledBreakExample {
    public static void main(String[] args) {
        int j,k;
        outerMost:
        for (j = 0; j < 5; j++) {
            innerMost:
            for (k = 1; k < 3; k++) {
                System.out.println("j = " +j + "and k = " +k);
                if(j==3)
                    break outerMost;
            }

        }
    }
}
