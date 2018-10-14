package AlgorithmExercises;

import java.util.Scanner;

public class RestFromAmount {
    public static void main(String[] args) {
        System.out.print("Enter int value: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
        whatBillsWillIGet(number);
    }

    private static void whatBillsWillIGet(double amount) {

        int[] numbers = {500, 200, 100, 50, 20, 10};
        //int amount = (int) (number * 100);
        int counter = 0;
        for(int i=0;i<numbers.length;i++){
            int count = (int)(amount/numbers[i]);
            amount -= count * numbers[i];
            if(count > 0){
                System.out.println(count + "x " + numbers[i]);
            }

        }

    }
}
