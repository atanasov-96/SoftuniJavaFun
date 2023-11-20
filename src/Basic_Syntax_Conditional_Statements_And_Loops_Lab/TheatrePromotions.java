package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class TheatrePromotions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());

        tickets(day, age);

    }

    public static void tickets(String day, int age) {
        int price = 0;

        if (day.equals("weekday")) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (day.equals("weekend")) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        } else if (day.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}

