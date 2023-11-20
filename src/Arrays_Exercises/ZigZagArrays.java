package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[rows];
        int[] secondArray = new int[rows];

        for (int row = 0; row < rows; row++) {
            int[] tempArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (row % 2 == 0){
                firstArray[row] = tempArray[0];
                secondArray[row] = tempArray[1];
            } else {
                firstArray[row] = tempArray[1];
                secondArray[row] = tempArray[0];
            }
        }
        /*for (int row = 0; row < rows; row++){
            String input = scanner.nextLine();
            String[] numbers = input.split("\\s+");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            if (row % 2 == 0) {
                firstArray[row] += num1;
                secondArray[row] += num2;
            } else {
                firstArray[row] += num2;
                secondArray[row] += num1;
            }
        }*/

        for (int e:firstArray) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e:secondArray) {
            System.out.print(e + " ");
        }
    }
}
