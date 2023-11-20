package Exam_Prep;

import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        int studentCount = Integer.parseInt(scanner.nextLine());

        int answersPerHour = firstEmployee + secondEmployee + thirdEmployee;

        int hours = 0;
        while (studentCount > 0) {
            studentCount -= answersPerHour;
            hours++;
            if (hours % 4 == 0) {
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.", hours);

    }
}
