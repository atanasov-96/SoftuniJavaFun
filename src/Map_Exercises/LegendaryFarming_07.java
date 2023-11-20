package Map_Exercises;


import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();

        inventory.put("shards",0);
        inventory.put("fragments",0);
        inventory.put("motes",0);

        boolean itemObtained = false;

        while (!itemObtained) {
            int quantity = scanner.nextInt();
            String material = scanner.next().toLowerCase();

            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                inventory.put(material, inventory.get(material) + quantity);

                if (inventory.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    inventory.put("shards", inventory.get("shards") - 250);
                    itemObtained = true;
                } else if (inventory.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    inventory.put("fragments", inventory.get("fragments") - 250);
                    itemObtained = true;
                } else if (inventory.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    inventory.put("motes", inventory.get("motes") - 250);
                    itemObtained = true;
                }
            } else {
                junk.putIfAbsent(material, 0);
                junk.put(material, junk.get(material) + quantity);
            }
        }
        for (Map.Entry<String, Integer> kvp : inventory.entrySet()) {
            System.out.printf("%s: %d\n", kvp.getKey(), kvp.getValue());
        }
        for (Map.Entry<String, Integer> kvp : junk.entrySet()) {
            System.out.printf("%s: %d\n", kvp.getKey(), kvp.getValue());
        }
    }
}
