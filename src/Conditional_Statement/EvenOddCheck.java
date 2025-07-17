package Conditional_Statement;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");
    }
}
