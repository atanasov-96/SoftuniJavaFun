package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\s+");

        String[] itemsArray = new String[items.length];

        for (int rev = 0, i = itemsArray.length - 1; i >= 0; rev++, i--) {
            itemsArray[rev] = items[i];
        }
        System.out.println(String.join(" ", itemsArray));
    }
}
