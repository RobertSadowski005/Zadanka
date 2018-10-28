package SortExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmbeddedSort {
    public static void main(String[] args) {

        List<Integer> numbers = generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //-1 gdy o1 jest do wstawienia z lewej
                //1 gdy o2 jest do wstawienia z lewej
                //0 - liczby są równe, nic nie zmieniamy
                if (o1 % 2 == o2 % 2) {
                    return o1.compareTo(o2);
                } else if (o1.compareTo(o2) != 0) {
                    return (o1 % 2 < o2 % 2) ? -1 : 1;
                }

                return 0;
            }
        });
    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();

        return numbers;
    }
}
