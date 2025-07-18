package Strings.Basics;

public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String digits = "1234099";
        boolean isDigits = true;

        for(int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            if (ch < '0' || ch > '9'){
                isDigits = false;
                break;
            }
        }
        System.out.println(isDigits ? "String contains only digits" : "String contains non-digit characters");
    }
}
