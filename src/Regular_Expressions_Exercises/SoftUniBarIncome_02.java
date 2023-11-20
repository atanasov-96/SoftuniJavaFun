package Regular_Expressions_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0.0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of shift")) {
                break;
            }

            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<item>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>\\d*|\\d+\\.\\d+)\\$");
            Matcher match = pattern.matcher(input);

            while (match.find()) {
                String customer = match.group("name");
                String item = match.group("item");
                int count = Integer.parseInt(match.group("count"));
                double price = Double.parseDouble(match.group("price")) * count;
                totalIncome += price;
                System.out.printf("%s: %s - %.2f\n", customer, item, price);
            }
        }
        System.out.printf("Total income: %.2f\n", totalIncome);
    }
}
