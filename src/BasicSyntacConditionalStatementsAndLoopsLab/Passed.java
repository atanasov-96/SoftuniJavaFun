package BasicSyntacConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class Passed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade = Float.parseFloat(sc.nextLine());
        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}

