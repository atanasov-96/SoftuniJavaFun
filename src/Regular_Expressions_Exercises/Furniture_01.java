package Regular_Expressions_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> boughtFurniture = new ArrayList<>();
        Double totalSpent = 0.0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Purchase")) {
                break;
            }
            Pattern pattern = Pattern.compile(">>(?<item>[A-Z]+[a-z]*)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)");
            Matcher match = pattern.matcher(input);
            while (match.find()) {
                String item = match.group("item");
                int quantity = Integer.parseInt(match.group("quantity"));
                if (quantity > 0) {
                    totalSpent += Double.parseDouble(match.group("price")) * quantity;
                    boughtFurniture.add(item);
                }
            }
        }
        System.out.println("Bought furniture: ");
        for (String item : boughtFurniture) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalSpent);
    }
}
