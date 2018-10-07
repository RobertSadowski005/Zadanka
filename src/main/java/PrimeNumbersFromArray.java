import java.util.Scanner;

public class PrimeNumbersFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        printPrimes(number);
    }

    private static void printPrimes(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }
}
