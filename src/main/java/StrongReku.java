import java.util.Scanner;

public class StrongReku {
    public static void main(String[] args) {
        System.out.println("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(rekuStrongFromNumber(number));
    }

    private static int rekuStrongFromNumber(int number) {
        if (number==0) {
            return 1;
        } else {
            return number * rekuStrongFromNumber(number -1);
        }
    }
}
