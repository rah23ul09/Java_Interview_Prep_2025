package Conditional_Statement;

import java.util.Scanner;

public class VowelOrConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to check : ");
        char ch = scanner.next().charAt(0);

        // check it is a letter
        if(Character.isLetter(ch)) {
            char lowerChar = Character.toLowerCase(ch);

            if (lowerChar == 'a' || lowerChar == 'e' ||
                    lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u')
                System.out.println(ch + " is a vowel.");
            else System.out.println(ch + " is a consonant");
        }
        else System.out.println(ch + " is not a letter");
        scanner.close();
    }
}
