package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int original = number;
        scanner.close();

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;             // remove the modulus
            reversed = reversed * 10 + digit;   // adding modulus value into reversed
            number /= 10;                       // removing last digit from number
        }
        System.out.println("Reverse of entered number is " + reversed);

        if (original == reversed) System.out.println("Number is palindrome");
        else System.out.println("Number is not palindrome");
    }
}
