package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngyKot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();

        long leftSum = 0;
        long rightSum = 0;

        if (entryPoint >= 1 && entryPoint < items.size() - 1) {
            if (typeOfItems.equals("cheap")) {

                for (int i = 0; i < entryPoint; i++) {
                    if (items.get(i) < items.get(entryPoint)) {
                        leftSum += items.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < items.size(); i++) {
                    if (items.get(i) < items.get(entryPoint)) {
                        rightSum += items.get(i);
                    }
                }
            } else if (typeOfItems.equals("expensive")) {
                for (int i = 0; i < entryPoint; i++) {
                    if (items.get(i) >= items.get(entryPoint)) {
                        leftSum += items.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < items.size(); i++) {
                    if (items.get(i) >= items.get(entryPoint)) {
                        rightSum += items.get(i);
                    }
                }
            }
        }
        if (rightSum > leftSum) {
            System.out.printf("Right - %d", rightSum);
        } else {
            System.out.printf("Left - %d", leftSum);
        }
    }
}