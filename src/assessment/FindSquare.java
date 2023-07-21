package assessment;

import java.util.Scanner;
// find the square of a number and return the result
//have a method that take array and print the array



public class FindSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int number = scanner.nextInt();


        int result = number * number;
        System.out.println(result);



    }

}
