import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(searchingForCommonDivisor(number));
    }

    private static int searchingForCommonDivisor(int number) {
        int returnedValue = 0;
        for (int i =1; i <= number; i++) {
            if (number%i==0) {
                returnedValue +=i;
            }
        }
        return returnedValue;
    }
}
