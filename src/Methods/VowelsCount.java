package Methods;

public class VowelsCount {

    static int vowel(String str) {
        int vowel = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)  vowel++;
            }
        }
        return vowel;
    }

    public static void main(String[] args) {
        System.out.println("Number of vowels are : " +vowel("I am rahul"));
    }
}
