import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(isPrimeNumber(number));
    }

    private static boolean isPrimeNumber(int number) {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }

            if (counter >= 1) {
                return false;
            }

        }
        return true;

    }
}
