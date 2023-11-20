package List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("end")) {
                break;
            }
            int element = Integer.parseInt(input[1]);

            if (command.equals("Delete")) {
                numbers.removeIf(n -> n == element);
            }
            if (command.equals("Insert")) {
                int index = Integer.parseInt(input[2]);
                numbers.add(index, element);
            }
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
