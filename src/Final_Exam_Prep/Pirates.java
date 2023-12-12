package Final_Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> townPopulation = new LinkedHashMap<>();
        Map<String, Integer> townWealth = new LinkedHashMap<>();

        while (true) {
            String[] targetedCities = scanner.nextLine().split("\\|\\|");
            String city = targetedCities[0];
            if (city.equals("Sail")) {
                break;
            }
            int cityPopulation = Integer.parseInt(targetedCities[1]);
            int cityWealth = Integer.parseInt(targetedCities[2]);

            if (!townPopulation.containsKey(city)) {
                townPopulation.put(city, cityPopulation);
                townWealth.put(city, cityWealth);
            } else {
                townPopulation.put(city, townPopulation.get(city) + cityPopulation);
                townWealth.put(city, townWealth.get(city) + cityWealth);
            }
        }

        while (true) {
            String[] input = scanner.nextLine().split("=>");
            String command = input[0];

            if (command.equals("End")) {
                break;
            }
            String town = input[1];
            int gold;
            switch (command) {
                case "Plunder":
                    int population = Integer.parseInt(input[2]);
                    gold = Integer.parseInt(input[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, population);

                    townPopulation.put(town, townPopulation.get(town) - population);
                    townWealth.put(town, townWealth.get(town) - gold);

                    if (townPopulation.get(town) <= 0 || townWealth.get(town) <= 0) {
                        townPopulation.remove(town);
                        townWealth.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;

                case "Prosper":
                    gold = Integer.parseInt(input[2]);
                    if (gold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");

                    } else {
                        townWealth.put(town, townWealth.get(town) + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, townWealth.get(town));
                    }
                    break;
            }
        }
        if (townPopulation.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",townPopulation.size());
            for (Map.Entry<String,Integer> entry : townPopulation.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), townWealth.get(entry.getKey()));
            }
        }
    }
}
