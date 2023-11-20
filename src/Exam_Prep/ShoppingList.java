package Exam_Prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Go Shopping!")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            if (command.equals("Urgent")) {
                if (!shoppingList.contains(splitInput[1])) {
                    shoppingList.add(0, splitInput[1]);
                }
            } else if (command.equals("Unnecessary")) {
                if (shoppingList.contains(splitInput[1])) {
                    shoppingList.remove(splitInput[1]);
                }
            } else if (command.equals("Correct")) {
                if (shoppingList.contains(splitInput[1])) {
                    shoppingList.set(shoppingList.indexOf(splitInput[1]), splitInput[2]);
                }
            } else if (command.equals("Rearrange")) {
                if (shoppingList.contains(splitInput[1])) {
                    shoppingList.remove(splitInput[1]);
                    shoppingList.add(splitInput[1]);
                }
            }
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
