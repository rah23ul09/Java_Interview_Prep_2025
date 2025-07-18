package Strings.Intermediate;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "New words are never word in";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) result += ch;
        }

        System.out.println("After removing duplicate : " + result);
    }
}
