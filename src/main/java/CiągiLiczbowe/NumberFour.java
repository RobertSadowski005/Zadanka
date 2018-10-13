package CiągiLiczbowe;

import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
        System.out.print("Enter int value: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fibonacciNumberResault(number);
    }

    private static void fibonacciNumberResault(long number) {
        int fibonacciNumber = 0;
        int oneBeforeFibonacciNumber = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciNumber + " ");
            fibonacciNumber = fibonacciNumber + oneBeforeFibonacciNumber;
            oneBeforeFibonacciNumber = fibonacciNumber - oneBeforeFibonacciNumber;
        }

        System.out.println();
    }
}
