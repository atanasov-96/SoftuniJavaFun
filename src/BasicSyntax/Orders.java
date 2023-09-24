package BasicSyntax;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= orders; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double singlePrice = ((days * capsuleCount) * capsulePrice);

            System.out.printf("The price for the coffee is: $%.2f%n", singlePrice);
            totalPrice += singlePrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
