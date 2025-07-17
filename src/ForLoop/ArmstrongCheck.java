package ForLoop;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int original = number;

        int countDigit = 0;
        int temp = number;
        // this loop will provide count of digit in number
        while (temp != 0) {
            countDigit ++;
            temp /= 10;
        }

        int sum =0;
        temp = number;
        // this loop will provide sum of the power of numbers digit
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, countDigit);
            temp /= 10;
        }

        if (original == sum) System.out.println("Number is armstrong");
        else System.out.println("Number is not armstrong");
    }
}
