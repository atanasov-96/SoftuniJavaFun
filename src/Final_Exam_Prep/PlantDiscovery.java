package Final_Exam_Prep;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> plantsAndRarity = new LinkedHashMap<>();
        HashMap<String, List<Integer>> plantAndRatings = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] initialPlants = scanner.nextLine().split("<->");
            String plant = initialPlants[0];
            int rarity = Integer.parseInt(initialPlants[1]);
            plantsAndRarity.put(plant, rarity);
        }
        while (true) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            if (command.equals("Exhibition")) {
                break;
            }
            String[] plantAndAttribute = input[1].split(" - ");
            String plant = plantAndAttribute[0];

            switch (command) {
                case "Rate":
                    int plantRating = Integer.parseInt(plantAndAttribute[1]);
                    if (!plantsAndRarity.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantAndRatings.computeIfAbsent(plant, key -> new ArrayList<>()).add(plantRating);
                    }
                    break;
                case "Update":
                    if (!plantsAndRarity.containsKey(plant)){
                        System.out.println("error");
                    } else {
                        int newRarity = Integer.parseInt(plantAndAttribute[1]);
                        plantsAndRarity.put(plant,newRarity);
                        plantAndRatings.putIfAbsent(plant, new ArrayList<>());
                    }
                    break;
                case "Reset":
                    if (!plantsAndRarity.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantAndRatings.get(plant).clear();
                }
                    break;
            }
        }
        System.out.printf("Plants for the exhibition: \n");
        for (Map.Entry<String, Integer> kvp : plantsAndRarity.entrySet()) {
            int sumRating = 0;
            List<Integer> getRating = plantAndRatings.get(kvp.getKey());
            for (int digit : getRating) {
                sumRating += digit;
            }
            double averageRating = getRating.size() > 0 ? (double) sumRating / getRating.size() : 0;

            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",kvp.getKey(),kvp.getValue(), averageRating);

        }
    }
}
