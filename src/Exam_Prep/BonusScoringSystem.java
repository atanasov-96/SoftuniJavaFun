package Exam_Prep;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount= Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double bestStudent = 0;
        double maxBonus = 0;

        for (int i = 1; i <= studentsCount ; i++) {

            double attendance = Double.parseDouble(scanner.nextLine());

            double totalBonus = attendance / lecturesCount * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                bestStudent = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.\n", Math.ceil(bestStudent));
    }
}
