package Conditional_Statement;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number2 : ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter number3 : ");
        double number3 = scanner.nextDouble();

        if ((number1 > number2) && (number1 > number3))
            System.out.println("Number " + number1 + " is greater");
        else if (number2 > number3) System.out.println("Number " + number2 + " is greater");
        else System.out.println("Number " + number3 + " is greater");
    }
}
