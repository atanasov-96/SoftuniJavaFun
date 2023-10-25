package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOFCities = Integer.parseInt(scanner.nextLine());

        double totalEarned = 0.0;
        for (int i = 1; i <= numberOFCities; i++) {

            String city = scanner.nextLine();
            double moneyEarned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i % 5 != 0) {
                expenses *= 1.50;
            }
            if (i % 5 == 0) {
                moneyEarned *= 0.90;
            }
            double currProfit = 0.0;
            currProfit = moneyEarned - expenses;
            totalEarned += currProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n", city, currProfit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.\n", totalEarned);
    }
}
