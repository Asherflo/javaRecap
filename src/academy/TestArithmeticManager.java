package academy;

import java.util.Scanner;

public class TestArithmeticManager {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first and second number");
            double firstNumber = input.nextDouble();
            double secondNumber = input.nextDouble();

            ArithmeticEngine engine = new ArithmeticEngine(firstNumber,secondNumber);
            System.out.printf("%s + %s = %s", firstNumber,secondNumber,engine.addTwoNumber());
            System.out.println();
            System.out.printf("%s + %s = %s", firstNumber,secondNumber,engine.minusTwoNumber());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
