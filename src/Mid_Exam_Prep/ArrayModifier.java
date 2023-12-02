package Mid_Exam_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] splitInput = input.split(" ");
            if (input.contains("swap")) {
                int index1 = Integer.parseInt(splitInput[1]);
                int index2 = Integer.parseInt(splitInput[2]);

                int temp1 = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = temp1;
            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(splitInput[1]);
                int index2 = Integer.parseInt(splitInput[2]);

                numbers[index1] = numbers[index1] * numbers[index2];
            } else if (input.contains("decrease")) {
                for (int n = 0; n < numbers.length; n++) {
                    numbers[n] -= 1;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }

    }
}
