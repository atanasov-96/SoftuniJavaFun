package Mid_Exam_Prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int turnCount = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end") || elements.isEmpty()) {
                break;
            }
            String[] splitInput = input.split(" ");
            int index1 = Integer.parseInt(splitInput[0]);
            int index2 = Integer.parseInt(splitInput[1]);

            boolean isValidIndex = index1 >= 0 && index2 >= 0 && index1 < elements.size() && index2 < elements.size() && index1 != index2;

            String matchingElement;
            turnCount++;
            if (isValidIndex) {
                if (elements.get(index1).equals(elements.get(index2))) {
                    matchingElement = elements.get(index1);
                    if (index1 < index2) {
                        elements.remove(index2);
                        elements.remove(index1);
                    } else {
                        elements.remove(index1);
                        elements.remove(index2);
                    }
                    System.out.printf("Congrats! You have found matching elements - %s!", matchingElement);
                    System.out.println();
                } else {
                    System.out.println("Try again!");
                }
            } else {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2, "-" + String.valueOf(turnCount) + "a");
                elements.add(elements.size() / 2, "-" + String.valueOf(turnCount) + "a");
            }
        }
        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!\n", turnCount);
            return;
        } else {
            System.out.println("Sorry you lose :( ");
            for (String e : elements) {
                System.out.print(e + " ");
            }
        }

    }
}
