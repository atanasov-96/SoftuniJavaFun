package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int leftIndex = 0; leftIndex <= numbers.length - 1; leftIndex++) {

            boolean isBigger = true;

            for (int rightIndex = leftIndex + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                if (numbers[leftIndex] <= numbers[rightIndex]) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.printf(numbers[leftIndex] + " ");
            }
        }
    }
}
