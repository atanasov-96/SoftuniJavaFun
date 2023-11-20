package Maps_Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        
        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        for (double num : numbersList) {
            if (!numbersMap.containsKey(num)) {
                numbersMap.put(num, 1);
            } else {
                numbersMap.put(num, numbersMap.get(num) + 1);
            }
        }
        
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            DecimalFormat result = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", result.format(entry.getKey()), entry.getValue());
        }
    }
}
