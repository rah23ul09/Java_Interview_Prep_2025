package Strings.Intermediate;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbsdncec";
        boolean found = false;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("First non-repeating character is : " +ch);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No non-repeating character found");
    }
}
