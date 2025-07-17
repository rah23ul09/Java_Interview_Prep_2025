package ForLoop;

import java.util.Scanner;

public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;
        int temp = Math.abs(number);        // for accepting negative number

        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                count ++;
                temp /= 10;
            }
        }
        System.out.println("Count of number " + number + " is " + count);
    }
}
