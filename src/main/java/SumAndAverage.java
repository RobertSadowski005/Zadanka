import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println(sumAndAverageFromInput());
    }

    private static int sumAndAverageFromInput() {
        int suma = 0;
        while (1 !=0) {
            System.out.println("Enter an integer:");
            Scanner keyboard = new Scanner(System.in);
            int number = keyboard.nextInt();
            if (number == 0) {
                return suma;
            } else {
                suma += number;
            }
        }
    }
}
