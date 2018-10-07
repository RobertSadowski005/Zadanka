import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        System.out.println(sumAndAverageFromInput());
    }

    private static int sumAndAverageFromInput() {
        System.out.println("Enter an integer:");
        int returnedValue = 0;
        int number = 0;
        do {
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();
            returnedValue += number;
        }
        while (number != 0);
        return returnedValue;
    }
}

