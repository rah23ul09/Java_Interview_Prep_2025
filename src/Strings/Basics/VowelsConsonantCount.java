package Strings.Basics;

public class VowelsConsonantCount {
    public static void main(String[] args) {
        String message = "Hello, Rahul";
        int vowel = 0, consonant = 0;
        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'a' && ch <=  'z') {
                if ("aeiou".indexOf(ch) != -1) vowel++;
                else consonant++;
            }
        }

        System.out.println("Number of vowels in string are : " +vowel);
        System.out.println("Number of consonants in string are : " +consonant);
    }
}
