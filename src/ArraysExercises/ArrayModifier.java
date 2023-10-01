package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = "";
        while (!command.equals("end")) {
            String[] input = scanner.nextLine().split("\\s+");
            command = input[0];

            if (command.contains("swap")) {

                int tempFirstElement = numbers[Integer.parseInt(input[1])];

                numbers[Integer.parseInt(input[1])] = numbers[Integer.parseInt(input[2])];
                numbers[Integer.parseInt(input[2])] = tempFirstElement;

            } else if (command.contains("multiply")) {

                numbers[Integer.parseInt(input[1])] *= numbers[Integer.parseInt(input[2])];

            } else if (command.contains("decrease")) {
                for (int num = 0; num <= numbers.length - 1; num++) {
                    numbers[num]--;
                }
            }
        }
        System.out.println(Arrays.toString(numbers)
                        .replace("[", "")
                        .replace("]", ""));
    }
}
