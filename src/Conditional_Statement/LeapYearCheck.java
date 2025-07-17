package Conditional_Statement;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to check : ");
        int year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Year " + year + " is leap year");
        else System.out.println("Year " + year + " is not a leap year");
    }
}
