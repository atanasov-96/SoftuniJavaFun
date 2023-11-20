package Map_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinersTask_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> mineCart = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();
            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!mineCart.containsKey(resource)) {
                mineCart.put(resource, quantity);
            } else {
                mineCart.put(resource, mineCart.get(resource) + quantity);
            }
        }
        for (Map.Entry<String, Integer> kvp : mineCart.entrySet()) {
            System.out.printf("%s -> %d%n", kvp.getKey(), kvp.getValue());
        }
    }
}
