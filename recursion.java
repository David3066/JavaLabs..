public class Recursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int fibonacciNumber = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }
}