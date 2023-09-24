package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int extracted = 0;
        int consumed = 0;
        if (startingYield >= 100) {
            while (startingYield >= 100) {
                days++;
                extracted += startingYield;
                startingYield -= 10;
                consumed += 26;
                if (startingYield < 100) {
                    consumed += 26;
                }
            }
        }
        int totalYield = extracted - consumed;
        System.out.println(days);
        System.out.println(totalYield);
    }
}
