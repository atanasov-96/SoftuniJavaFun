package Final_Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<FoodItem> items = new ArrayList<>();
        Pattern pattern = Pattern.compile("(#|\\|)(?<item>[A-Za-z ]+)\\1(?<expDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>\\d+)\\1");
        Matcher match = pattern.matcher(input);
        while (match.find()) {
            FoodItem item = new FoodItem(match.group("item"), match.group("expDate"), Integer.parseInt(match.group("calories")));
            items.add(item);
        }
        int calories = 0;
        for (FoodItem item : items) {
            calories += item.getCalories();
        }
        int days = calories / 2000;
        System.out.printf("You have food to last you for: %d days!\n", days);
        for (FoodItem item : items) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d\n",item.getItemName(),item.getBestBeforeDate(),item.getCalories());
        }

    }
}

class FoodItem {
    private String itemName;
    private String bestBeforeDate;
    private int calories;

    public FoodItem(String itemName, String bestBeforeDate, int calories) {
        this.itemName = itemName;
        this.bestBeforeDate = bestBeforeDate;
        this.calories = calories;
    }

    public String getItemName() {
        return itemName;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public int getCalories() {
        return calories;
    }
}
