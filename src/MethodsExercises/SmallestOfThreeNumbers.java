package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(a, b, c);
    }

    public static void printSmallestNumber(int a, int b, int c) {
        /*if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }*/
        System.out.println(Math.min(Math.min(a, b), c));
    }
}
