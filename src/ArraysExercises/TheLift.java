package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInLine = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int wagon = 0; wagon <= wagons.length - 1; wagon++) {
            while (wagons[wagon] < 4 && peopleInLine > 0) {
                wagons[wagon]++;
                peopleInLine--;
            }
        }
        boolean emptySpots = false;
        for (int i = 0; i <= wagons.length - 1; i++) {
            if (wagons[i] < 4) {
                emptySpots = true;
            }
        }
        if (emptySpots) {
            System.out.printf("The lift has empty spots!\n");
        }
        if (peopleInLine > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleInLine);
        }
        System.out.println(Arrays.toString(wagons)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
