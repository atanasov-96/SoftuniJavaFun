package Text_Processing_Exercises;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int over = 0;

        for (int position = firstNum.length() - 1; position >= 0; position--) {
            int digit = Character.getNumericValue(firstNum.charAt(position));
            int product = digit * secondNum + over;

            over = product / 10;
            result.insert(0, product % 10);
        }

        while (over > 0) {
            result.insert(0, over % 10);
            over /= 10;
        }

        // Remove leading zeros
        int index = 0;
        while (index < result.length() - 1 && result.charAt(index) == '0') {
            index++;
        }

        System.out.println(result.substring(index));
    }
}
