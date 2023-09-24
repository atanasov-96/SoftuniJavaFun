package BasicSyntax;

import java.util.Scanner;

public class PadawanEquiptment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double lightSaberCount = lightSabers * Math.ceil(studentCount * 1.1);
        double beltsCount = studentCount - studentCount / 6;

        double totalPrice = lightSaberCount + robes * studentCount + belts * beltsCount;

        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - money);
        }

    }
}
