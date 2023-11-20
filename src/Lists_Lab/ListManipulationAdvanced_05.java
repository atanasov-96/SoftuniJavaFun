package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println();
        while (true) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("end")) {
                break;
            }
            if (command.equals("Contains")) {
                int num1 = Integer.parseInt(input[1]);
                if (numbers.contains(num1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }
            if (command.equals("Print")) {
                String subCommand = input[1];
                if (subCommand.equals("even")) {
                    for (int e : numbers) {
                        if (e % 2 == 0) {
                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                } else if (subCommand.equals("odd")) {
                    for (int e : numbers) {
                        if (e % 2 == 1) {
                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                }
            }

            if (command.equals("Get")) {
                int sum = 0;
                for (int e : numbers) {
                    sum += e;
                }
                System.out.println(sum);
            }

            if (command.equals("Filter")) {
                String operator = input[1];
                int number = Integer.parseInt(input[2]);
                switch (operator) {
                    case ">":
                        for (int e : numbers) {
                            if (e > number) {
                                System.out.print(e + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<":
                        for (int e : numbers) {
                            if (e < number) {
                                System.out.print(e + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        for (int e : numbers) {
                            if (e >= number) {
                                System.out.print(e + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        for (int e : numbers) {
                            if (e <= number) {
                                System.out.print(e + " ");
                            }
                        }
                        System.out.println();
                        break;
                }
            }
        }
    }
}
