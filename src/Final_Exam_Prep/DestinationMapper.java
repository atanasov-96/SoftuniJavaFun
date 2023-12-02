package Final_Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> destinations = new ArrayList<>();
        Pattern pattern = Pattern.compile("(=|\\/)(?<location>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        int travelpoints = 0;
        while (matcher.find()) {
            if (!destinations.contains(matcher.group("location"))) {
                destinations.add(matcher.group("location"));
                travelpoints += matcher.group("location").length();
            }
        }
        System.out.printf("Destinations: %s\n", String.join(", ", destinations));
        System.out.printf("Travel Points: %d\n", travelpoints);
    }
}
