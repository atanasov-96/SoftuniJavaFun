package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int targetsPoked = 0;
        int remainingPower = power;

        if (power >= distance && distance > 0) {
            while (remainingPower >= distance) {
                remainingPower -= distance;
                targetsPoked++;
                if (remainingPower == power / 2 && exhaustionFactor > 0) {
                    remainingPower /= exhaustionFactor;
                }
            }
        }
        System.out.println(remainingPower);
        System.out.println(targetsPoked);
    }
}