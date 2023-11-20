package Exam_Prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Invertory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Craft!")) {
                break;
            }
            String[] split = input.split(" - ");
            String command = split[0];
            String item = split[1];

            if (command.equals("Collect")) {
                if (!inventory.contains(item)) {
                    inventory.add(item);
                }
            } else if (command.equals("Drop")) {
                if (inventory.contains(item)) {
                    inventory.remove(item);
                }
            } else if (command.equals("Combine Items")) {
                String[] splitItem =  item.split(":");
                String oldItem = splitItem[0];
                String newItem = splitItem[1];
                if (inventory.contains(oldItem)) {
                    int oldIndex = inventory.indexOf(oldItem);
                    inventory.add(oldIndex + 1 , newItem);
                }
            } else if (command.equals("Renew")) {
                if (inventory.contains(item)) {
                    inventory.remove(item);
                    inventory.add(item);
                }
            }
        }
        System.out.println(String.join(", ", inventory));

    }
}
