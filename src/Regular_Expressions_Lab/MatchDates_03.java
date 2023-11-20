package Regular_Expressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String datesSring = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([-.\\/])(?<month>Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)(\\2)(?<year>\\d{4})\\b");
        Matcher dates = pattern.matcher(datesSring);

        while (dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day ,month, year);
        }

    }
}
