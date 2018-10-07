import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonacciNumberResault(number));
    }

    private static long fibonacciNumberResault(long number) {
        if (number <= 1) return number;
        else return fibonacciNumberResault(number - 1) + fibonacciNumberResault(number - 2);
    }

}
