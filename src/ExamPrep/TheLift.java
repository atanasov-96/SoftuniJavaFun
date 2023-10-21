package ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int peopleLeft = numberOfPeople;
        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] < 4 && peopleLeft > 0) {
                if (wagons[i] < 4) {
                    wagons[i]++;
                    peopleLeft--;
                }
            }
        }
        boolean emptySeats = false;
        for (int i = 0; i <= wagons.length - 1; i++) {
            if (wagons[i] < 4) {
                emptySeats = true;
            }
        }
        if (emptySeats) {
            System.out.print("The lift has empty spots!\n");
        }
        if (peopleLeft > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleLeft);
        }
        for (int w: wagons) {
            System.out.print(w + " ");
        }
    }
}