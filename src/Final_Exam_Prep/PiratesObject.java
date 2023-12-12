package Final_Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PiratesObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TargetedTowns> targetedTowns = new ArrayList<>();

        while (true) {
            String[] targetedCities = scanner.nextLine().split("\\|\\|");
            String city = targetedCities[0];
            if (city.equals("Sail")) {
                break;
            }
            int cityPopulation = Integer.parseInt(targetedCities[1]);
            int cityWealth = Integer.parseInt(targetedCities[2]);
            TargetedTowns town = new TargetedTowns(city, cityPopulation, cityWealth);

        }
    }
}

class TargetedTowns {
    String town;
    int population;
    int wealth;

    public TargetedTowns(String town, int population, int wealth) {
        this.town = town;
        this.population = population;
        this.wealth = wealth;
    }

    public String getTown() {
        return town;
    }

    public int getPopulation() {
        return population;
    }

    public int getWealth() {
        return wealth;
    }
}
