public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(20));
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
