package CiągiLiczbowe;

import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
        System.out.println("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fibonacciNumberResault(number);
    }

    private static void fibonacciNumberResault(long number) {
        int fibonacciNumber = 0;
        int g = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciNumber + " ");
            fibonacciNumber = fibonacciNumber + g;
            g = fibonacciNumber - g;
        }

        System.out.println();
    }
}
