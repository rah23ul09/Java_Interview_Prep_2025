/*
*   1. Using static keyword
*   2. Without using static keyword
* */

package Methods;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial is : " + factorial.factorial1(6));
        System.out.println("Factorial is : " + factorial(5));
    }

    public static int factorial(int fact) {
        int result = 1;
        for (int i =2; i <= fact; i++) {
            result *= i;
        }
        return result;
    }

    public int factorial1(int fact) {
        int result = 1;
        for (int i = 2; i <= fact; i++) {
            result *= i;
        }
        return result;
    }
}
