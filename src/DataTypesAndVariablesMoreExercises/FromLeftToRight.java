package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            String[] numbers = scanner.nextLine().split("\\s+");

            long leftNum = Long.parseLong(numbers[0]);
            long rightNum = Long.parseLong(numbers[1]);


            int sum = 0;
            if (leftNum > rightNum) {

                while (leftNum != 0) {
                    sum += Math.abs(leftNum % 10);
                    leftNum = Math.abs(leftNum / 10);
                }

            } else {

                while (rightNum != 0) {
                    sum += Math.abs(rightNum % 10);
                    rightNum = Math.abs(rightNum / 10);
                }

            }
            System.out.println(sum);
        }
    }
}
