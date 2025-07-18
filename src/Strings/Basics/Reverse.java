package Strings.Basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to reverse : ");
        String string = scanner.nextLine();
        scanner.close();
        String reverse = "";
        String original = string;

        for (int i = string.length()-1; i >= 0; i--){
            reverse += string.charAt(i);
        }
        System.out.println("Reverse string is : "+reverse);

        // using string builder
        StringBuilder sb = new StringBuilder(string);
        reverse = sb.reverse().toString();

        System.out.println("Reverse string is : "+reverse);

        if (original.equalsIgnoreCase(reverse)) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");
    }
}
