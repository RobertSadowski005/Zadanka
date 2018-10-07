import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(strongFromNumber(number));

        }


    private static int strongFromNumber(int number) {
        int returnedValue = 1;
        for (int i = 1; i < number ; i++) {

            returnedValue *= i;
        }
        return returnedValue;
    }

}
