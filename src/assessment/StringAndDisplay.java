package assessment;

import java.util.Scanner;

public class StringAndDisplay {

        public static int countVowels(String str) {
            int count = 0;

            // Convert the input string to lowercase for case-insensitive comparison
            String lowerCaseStr = str.toLowerCase();

            // Loop through each character in the string and check if it's a vowel
            for (int i = 0; i < lowerCaseStr.length(); i++) {
                char ch = lowerCaseStr.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            return count;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int vowelCount = countVowels(inputString);
        System.out.println("Total number of vowels: " + vowelCount);
        scanner.close();
    }
    }
