package Strings.Basics;

public class CharacterConversion {
    public static void main(String[] args) {
        String str = "RahUl sInGH";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) result.append(Character.toUpperCase(ch));
            else result.append(ch);
        }

        System.out.println("Converted string : " + result.toString());
    }
}
