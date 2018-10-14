package AlgorithmsForDrawing;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.print("Enter int value: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        drawingTriange(number);
    }

    private static void drawingTriange(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println();
            for (int j = 0; j < number; j++) {

                if (i == 0 || j == number - 1 || i == number - 1 || j == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
