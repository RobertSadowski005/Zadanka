package CiągiLiczbowe;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        streamTwo(number);


    }

    private static void streamTwo(int number) {
        for (int i = 1, k =- 1, j = 1; i <= number; k +=j, i++ ) {
            j *= 2;
            System.out.print(k + " ");
        }
    }
}
