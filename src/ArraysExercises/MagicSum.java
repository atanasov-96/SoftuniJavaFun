package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int index = 0; index < numbers.length; index++) {

            int currNumber = numbers[index];
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumer = numbers[i];
                if (currNumber + nextNumer == magicSum) {
                    System.out.println(currNumber + " " + nextNumer);
                }
            }
        }
    }
}
