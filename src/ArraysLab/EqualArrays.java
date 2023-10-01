package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        boolean equal = true;
        for (int i = 0; i < firstNumbers.length; i++) {
            if (firstNumbers[i] != secondNumbers[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                equal = false;
                break;
            } else {
                sum += firstNumbers[i];
            }
        }
        if (equal) {
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
