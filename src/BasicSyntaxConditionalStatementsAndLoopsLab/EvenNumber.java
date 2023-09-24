package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (true) {
            if (num % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }
            System.out.println("Please write an even number.");
            num = scan.nextInt();
        }
    }
}

