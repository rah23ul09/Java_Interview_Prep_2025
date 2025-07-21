package Methods;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int prime) {
        if (prime <= 1) return false;
        else {
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(35) ? "Number is prime" : "Number is not prime");
    }
}
