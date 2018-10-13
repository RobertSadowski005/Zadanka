package CiągiLiczbowe;

import java.util.Scanner;

public class CoDwa {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        streamTwo(number);


    }

    private static void streamTwo(int number) {
        int counter = 1;
        int i = 1;
        int j = 0;
        while (counter <= number ){
            System.out.println(i+j);
            counter ++;
            j +=2;
        }
    }


}
