package Exam_Prep;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double plunder = Double.parseDouble(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());

        double gained = 0.0;

        for (int day = 1; day <= days ; day++) {


            gained += plunder;

            if (day % 3 == 0) {
                gained += plunder * 0.50;
            }
            if (day % 5 == 0) {
               gained *= 0.70;
            }
        }
        if (gained >= targetPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gained);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (gained / targetPlunder) * 100 );
        }


    }
}
