package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int multiplier = scan.nextInt();

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d", num, multiplier, num * multiplier);
        }
        for (int i = multiplier; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }
    }
}

