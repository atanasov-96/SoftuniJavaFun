package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;
        int currentLiters = 0;

        for (int i = 0; i < lines; i++) {
            int litersToPour = Integer.parseInt(scanner.nextLine());
            if (currentLiters + litersToPour > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                currentLiters += litersToPour;
            }
        }
        System.out.println(currentLiters);
    }
}
