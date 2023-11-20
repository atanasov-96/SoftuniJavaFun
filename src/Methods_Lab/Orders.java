package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        price(product, amount);
    }

    public static void price(String product, double amount) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", amount * 1.5);
                break;
            case "water":
                System.out.printf("%.2f", amount * 1);
                break;
            case "coke":
                System.out.printf("%.2f", amount * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f", amount * 2);
                break;
        }
    }
}
