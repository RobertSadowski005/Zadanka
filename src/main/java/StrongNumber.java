public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(strongFromNumber(9));

        }


    private static int strongFromNumber(int number) {
        int wynik = 1;
        for (int i = 1; i < number ; i++) {

            wynik *= i;
        }
        return wynik;
    }

}
