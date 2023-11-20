package Regular_Expressions_Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        List<String> messages = new ArrayList<>();

        for (int line = 1; line <= lines; line++) {
            String code = scanner.nextLine();
            Pattern key = Pattern.compile("[starSTAR]");
            Matcher keyMatcher = key.matcher(code);

            StringBuilder temp = new StringBuilder();
            int count = 0;

            while (keyMatcher.find()){
                count++;
            }
            for (int i = 0; i < code.length(); i++) {
                char ch = (char) (code.charAt(i) - count);
                temp.append(ch);
            }
            messages.add(temp.toString());
        }

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (String message : messages) {
            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<armySize>\\d+)");
            Matcher match = pattern.matcher(message);
            while (match.find()) {
                String planetName = match.group("planetName");
                int population = Integer.parseInt(match.group("population"));
                int armySize = Integer.parseInt(match.group("armySize"));
                if (population > 0 && armySize > 0){
                    if (match.group("attackType").equals("A")) {
                        attackedPlanets.add(planetName);
                    } else {
                        destroyedPlanets.add(planetName);
                    }
                }
            }
        }
        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
        if (!attackedPlanets.isEmpty()){
            Collections.sort(attackedPlanets);
            for (String attackedPlanet : attackedPlanets) {
                System.out.println("-> " +attackedPlanet);
            }
        }
        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        if (!destroyedPlanets.isEmpty()) {
            Collections.sort(destroyedPlanets);
            for (String destroyedPlanet : destroyedPlanets) {
                System.out.println("-> " + destroyedPlanet);
            }
        }
    }
}
