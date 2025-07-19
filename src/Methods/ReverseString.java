package Methods;

public class ReverseString {
    public static void main(String[] args) {
        String str = reverseString("Rahul");
        System.out.println(str);
    }

    public static String reverseString(String reverse) {
        return new StringBuilder(reverse).reverse().toString();
    }
}
