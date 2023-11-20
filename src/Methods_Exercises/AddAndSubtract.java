package Methods_Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractThird(sumFirstAndSecond(first,second),third));
    }

    public static int sumFirstAndSecond(int a, int b) {
        return a + b;
    }

    public static int subtractThird(int sum, int c) {
        return sum - c;
    }
}
