package algorithms.factorial;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

class FactorialRecursive {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial: " + factorial1(n));
    }
    public static long factorial1(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial1(n - 1);
    }
}
