public class silnia {
    public static void main(String[] args) {
        System.out.println(factorial(9));

        }


    private static int factorial(int number) {
        int wynik = 1;
        for (int i = 1; i < number ; i++) {

            wynik *= i;
        }
        return wynik;
    }

}
