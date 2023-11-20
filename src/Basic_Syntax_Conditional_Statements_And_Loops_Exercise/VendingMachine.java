package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coins = "";
        String food = "";

        double money = 0;
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1;

        while (!coins.equals("Start")) {
            coins = scanner.nextLine();

            if (coins.equals("0.1") || coins.equals("0.2") || coins.equals("0.5") || coins.equals("1") || coins.equals("2")) {
                money += Double.parseDouble(coins);

            } else if (!coins.equals("Start")) {
                System.out.printf("Cannot accept %.2f%n", Double.parseDouble(coins));
            }
        }
        while (!food.equals("End")) {
            food = scanner.nextLine();

            switch (food) {
                case "Nuts":
                    if (money >= nuts) {
                        System.out.println("Purchased Nuts");
                        money -= nuts;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    continue;
                case "Water":
                    if (money >= water) {
                        System.out.println("Purchased Water");
                        money -= water;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    continue;
                case "Crisps":
                    if (money >= crisps) {
                        System.out.println("Purchased Crisps");
                        money -= crisps;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    continue;
                case "Soda":
                    if (money >= soda) {
                        System.out.println("Purchased Soda");
                        money -= soda;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    continue;
                case "Coke":
                    if (money >= coke) {
                        System.out.println("Purchased Coke");
                        money -= coke;

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    continue;
                default:
                    if (!food.equals("End")) {
                        System.out.println("Invalid product");
                    }
            }
        }

        System.out.printf("Change: %.2f%n",money);
    }

}
