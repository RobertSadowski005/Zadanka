import java.util.Scanner;

public class readFromInputAndSum {
    public static void main(String[] args) {
        System.out.println(sumOfInpuNumbers());
    }

    private static int sumOfInpuNumbers() {
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
