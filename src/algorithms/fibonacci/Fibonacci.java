package algorithms.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Finobacci: " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

class FibonacciBase {
        public static void main(String[] args) {
            int n = 10;
            int f = 0, s = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(f + " ");
                int m = f+ s;
                f = s;
                s = m;
            }
        }
    }
