package ListsLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {

            double currElement = numbers.get(i);
            double rightElement = numbers.get(i + 1);

            if (currElement == rightElement) {

                double sumElement = currElement + rightElement;

                numbers.remove(i + 1);
                numbers.set(i, sumElement);
                i = -1;

            }
        }
        for (double num : numbers) {
            System.out.printf(new DecimalFormat("0.#").format(num) + " ");
        }
    }
}
