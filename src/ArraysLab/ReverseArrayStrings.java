package ArraysLab;

import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\s+");

        for (int i = 0; i < items.length / 2; i++) {
            String temp = items[i];
            items[i] = items[items.length - i - 1];
            items[items.length - i - 1] = temp;
        }
        System.out.println(String.join(" ", items));
    }
}
