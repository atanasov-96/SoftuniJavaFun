package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] string = scanner.nextLine().split("\\s+");
            String command = string[0];

            if (command.equals("end")) {
                break;
            }
            int num1 = Integer.parseInt(string[1]);

            if (command.equals("Add")) {
                numbers.add(num1);
            } else if (command.equals("Remove")) {
                numbers.remove(Integer.valueOf(num1));
            } else if (command.equals("RemoveAt")) {
                numbers.remove(num1);
            } else if (command.equals("Insert")) {
                int num2 = Integer.parseInt(string[2]);
                numbers.add(num2, num1);
            }

        }
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }
}
