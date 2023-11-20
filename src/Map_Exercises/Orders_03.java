package Map_Exercises;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> warehouse = new LinkedHashMap<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("buy")) {
                break;
            }

            String product = input[0];
            Double price = Double.parseDouble(input[1]);
            Double quantity = Double.parseDouble(input[2]);

            if (!warehouse.containsKey(product)) {
                List<Double> currentValues = new ArrayList<>();
                currentValues.add(0, price);
                currentValues.add(1, quantity);
                warehouse.put(product, currentValues);
            } else {
                List<Double> previousValues = warehouse.get(product);
                previousValues.set(0, price);
                previousValues.set(1, previousValues.get(1) + quantity);
                warehouse.put(product, previousValues);
            }
        }

        for (Map.Entry<String, List<Double>> kvp : warehouse.entrySet()) {
            List<Double> values = kvp.getValue();
            System.out.printf("%s -> %.2f%n", kvp.getKey(), values.get(0) * values.get(1));
        }
    }
}
