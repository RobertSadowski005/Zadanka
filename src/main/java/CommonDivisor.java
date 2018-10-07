public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(searchingForCommonDivisor(9));
    }

    private static int searchingForCommonDivisor(int number) {
        int wynik = 0;
        for (int i =1; i <= number; i++) {
            if (number%i==0) {
                wynik +=i;
            }
        }
        return wynik;
    }
}
