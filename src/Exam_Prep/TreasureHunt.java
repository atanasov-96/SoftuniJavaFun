package Exam_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Yohoho!")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            if (command.equals("Loot")) {
                for (int i = 1; i < splitInput.length; i++) {
                    String item = splitInput[i];
                    if (!loot.contains(item)) {
                        loot.add(0, item);
                    }
                }
            } else if (command.equals("Drop")) {
                int index = Integer.parseInt(splitInput[1]);
                if (0 <= index && index <= loot.size() - 1) {
                    String droppedItem = loot.get(index);
                    loot.remove(index);
                    loot.add(droppedItem);
                }
            } else if (command.equals("Steal")) {
                int count = Integer.parseInt(splitInput[1]);
                List<String> stolenLoot = new ArrayList<>();
                if (loot.size() - count >= 0) {
                    for (int i = loot.size() - count; i < loot.size(); i++) {
                        stolenLoot.add(loot.get(i));
                    }
                } else {
                    for (int i = 0; i < loot.size(); i++) {
                        stolenLoot.add(loot.get(i));
                    }
                }
                if (!stolenLoot.isEmpty()){
                    for (String e : stolenLoot) {
                        if (loot.contains(e)) {
                            loot.remove(e);
                        }
                    }
                }
                System.out.println(String.join(", ", stolenLoot));
            }
        }
        if (!loot.isEmpty()) {
            double treasureWorth = 0.0;
            for (int i = 0; i < loot.size(); i++) {
                treasureWorth += loot.get(i).length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", treasureWorth / loot.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
