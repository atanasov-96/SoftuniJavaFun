package Exam_Prep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPriceWithoutTaxes = 0;
        boolean isSpecial = false;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("special") || input.equals("regular")) {
                if (input.equals("special")) {
                    isSpecial = true;
                }
                break;
            } else {
                double price = Double.parseDouble(input);
                if (price <= 0) {
                    System.out.println("Invalid price!");
                } else {
                    totalPriceWithoutTaxes += price;
                }
            }
        }
        if (totalPriceWithoutTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }
        double taxes = totalPriceWithoutTaxes * 0.2;
        double totalPriceWithTaxes = totalPriceWithoutTaxes * 1.2;

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", totalPriceWithoutTaxes);
        System.out.printf("Taxes: %.2f$\n", taxes);
        System.out.println("-----------");

        if (isSpecial) {
            System.out.printf("Total price: %.2f$\n", totalPriceWithTaxes * 0.9);
        } else {
            System.out.printf("Total price: %.2f$\n", totalPriceWithTaxes);
        }
    }
}
