package CiągiLiczbowe;

import java.util.Scanner;

public class CoDwa {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        streamTwo(number);


    }

    private static void streamTwo(int number) {
        int multi = 1;
        System.out.println("2 ");
        for (int i =1, result =4; i <number; i++ , result += 2 * multi){
            if (i % 3 == 0) multi *= -1;
            System.out.print(result + " ");
        }
    }


}
