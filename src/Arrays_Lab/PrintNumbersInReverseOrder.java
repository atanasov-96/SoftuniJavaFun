package Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];
        for (int n = 0; n < size; n++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[n] = number;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
