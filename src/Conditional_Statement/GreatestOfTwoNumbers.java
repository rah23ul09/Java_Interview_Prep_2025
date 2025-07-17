package Conditional_Statement;

import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number 2 : ");
        double number2 = scanner.nextDouble();

        if (number1 > number2) System.out.println("Number " + number1 + " is greater" );
        else System.out.println("Number " + number2 + " is greater");
    }
}
