package Conditional_Statement;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double number = sc.nextDouble();

        if (number > 0) System.out.println("Number is positive");
        else if (number < 0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
        sc.close();
    }
}
