package AlgorithmsForDrawing;

import java.util.Scanner;

public class DrawX {
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
//                System.out.print("");
                if (i == j || i + j + 1 == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
