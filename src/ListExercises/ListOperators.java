package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            if (command.equals("End")) {
                break;
            }
            if (command.equals("Add")) {
                int num = Integer.parseInt(input[1]);
                numbers.add(num);
            }
            if (command.equals("Remove")) {
                int index = Integer.parseInt(input[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.print("\nInvalid index");
                }
            }
            if (command.equals("Insert")) {
                int num = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                if (index >= 0 && index <= numbers.size()) {
                    numbers.add(index, num);
                } else {
                    System.out.print("\nInvalid index");
                }
            }
            if (command.equals("Shift")) {
                String side = input[1];
                int times = Integer.parseInt(input[2]);
                for (int i = 0; i < times; i++) {
                    if (side.equals("left")) {
                        int firstElement = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(numbers.size(), firstElement);
                    }
                    if (side.equals("right")) {
                        int lastElement = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastElement);
                    }

                }
            }
        }
        System.out.println();
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }
}
