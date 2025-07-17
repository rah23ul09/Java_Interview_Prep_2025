package ForLoop;

public class FibonacciNumber {
    public static void main(String[] args) {
        int fib = 8;
        int a = 0;
        int b = 1;

        for (int i = 0; i <= fib; i ++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
