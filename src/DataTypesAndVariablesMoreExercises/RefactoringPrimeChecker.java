package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= numbers; num++) {
            boolean isPrime = true;
            for (int devisor = 2; devisor < num; devisor++) {
                if (num % devisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }

    }
}
