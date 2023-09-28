package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loses = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetsBroken = loses /2 ;
        int miceBroken = loses / 3;
        int keyboardBroken = loses / 6;
        int displaysBroken = keyboardBroken / 2;
        double totalPrice = headsetPrice * headsetsBroken + mousePrice * miceBroken + keyboardPrice * keyboardBroken + displayPrice * displaysBroken;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
