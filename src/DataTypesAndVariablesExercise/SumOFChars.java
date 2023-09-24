package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOFChars {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            char ch = scanner.nextLine().charAt(0);
            result += ch;
        }
        System.out.println("The sum equals: " + result);
    }
}
