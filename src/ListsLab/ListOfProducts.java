package ListsLab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= amount; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int j = 0; j < products.size(); j++) {
            System.out.printf("%d.%s\n", j + 1, products.get(j));
        }
    }
}
