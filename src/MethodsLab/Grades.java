package MethodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        gradeResult(grade);
    }

    public static void gradeResult(double grade) {
        if (2 <= grade && grade <= 2.99) {
            System.out.printf("Fail");
        } else if (3 <= grade && grade <= 3.49) {
            System.out.println("Poor");
        } else if (3.5 <= grade && grade <= 4.49) {
            System.out.println("Good");
        } else if (4.5 <= grade && grade <= 5.49) {
            System.out.println("Very good");
        } else if (5.5 <= grade && grade <= 6) {
            System.out.println("Excellent");
        }
    }
}
