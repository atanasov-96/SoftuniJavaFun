package ArraysLab;

import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] items = input.split("\\s+");
        String[] itemsArray = new String[items.length];
        for (int i = 0; i < itemsArray.length; i++) {
            itemsArray[i] = items[i];
        }
        for (int i = 0; i < itemsArray.length / 2; i++) {
            String temp = itemsArray[i];
            itemsArray[i] = itemsArray[itemsArray.length - i - 1];
            itemsArray[itemsArray.length - i - 1] = temp;
        }
        for (int item = 0; item < itemsArray.length; item++) {
            System.out.print(itemsArray[item] + " ");
        }
    }
}
