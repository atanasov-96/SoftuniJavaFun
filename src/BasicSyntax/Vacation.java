package BasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;

        if (type.equals("Students")) {
            switch (day) {
                case "Friday":
                    price = size * 8.45;
                    break;
                case "Saturday":
                    price = size * 9.8;
                    break;
                case "Sunday":
                    price = size * 10.46;
                    break;
            }
            if (size >= 30) {
                price *= 0.85;
            }
            System.out.printf("Total price: %.2f", price);

        } else if (type.equals("Business")) {
            if (size >= 100) {
                size -= 10;
            }
            switch (day) {
                case "Friday":
                    price = size * 10.9;
                    break;
                case "Saturday":
                    price = size * 15.6;
                    break;
                case "Sunday":
                    price = size * 16;
                    break;
            }

            System.out.printf("Total price: %.2f", price);

        } else if (type.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = size * 15;
                    break;
                case "Saturday":
                    price = size * 20;
                    break;
                case "Sunday":
                    price = size * 22.5;
                    break;
            }
            if (size >= 10 && size <= 20) {
                price *= 0.95;
            }
            System.out.printf("Total price: %.2f", price);

        }
    }
}
