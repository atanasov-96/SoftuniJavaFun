package Maps_Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .map(w -> w.toLowerCase())
                .toArray(String[]::new);

        Map<String, Integer> oddCount = new LinkedHashMap<>();

        for (String e : elements) {
            if (!oddCount.containsKey(e)) {
                oddCount.put(e, 1);
            } else {
                oddCount.put(e, oddCount.get(e) + 1);
            }
        }
        List<String> oddKeys = new ArrayList<>();

        for (Map.Entry<String, Integer> kvp : oddCount.entrySet()) {
            if (kvp.getValue() % 2 != 0) {
                oddKeys.add(kvp.getKey());
            }
        }

        System.out.printf(String.join(", ", oddKeys));

    }
}
