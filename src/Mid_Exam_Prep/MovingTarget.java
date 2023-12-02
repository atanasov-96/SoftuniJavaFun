package Mid_Exam_Prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            if (command.equals("End")) {
                break;
            }
            int index = Integer.parseInt(input[1]);
            int number = Integer.parseInt(input[2]);

            if (command.equals("Shoot")) {
                if (0 <= index && index <= targets.size() - 1) {
                    targets.set(index, targets.get(index) - number);
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                }
            } else if (command.equals("Add")) {
                if (0 <= index && index <= targets.size() - 1) {
                    targets.add(index, number);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.equals("Strike")) {
                List<Integer> copyTargets = targets;
                if (0 <= index - number && index + number <= targets.size() - 1) {
                    for (int i = index + number; i >= index - number; i--) {
                        targets.remove(i);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
        }

        for (int i = 0; i < targets.size(); i++) {
            System.out.print(targets.get(i));
            if (i < targets.size() - 1) {
                System.out.print("|");
            }
        }


    }
}
