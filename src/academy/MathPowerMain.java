package academy;

import java.util.Scanner;

public class MathPowerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first and second number");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        MathPower mathPower = new MathPower();
        System.out.println(mathPower.power(firstNumber,secondNumber));
    }
}
