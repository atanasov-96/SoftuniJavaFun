package List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemovedElements = 0;
        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int removedElement;

            if (numbers.size() == 1) {
                sumRemovedElements += numbers.get(0);
                numbers.remove(0);
            } else {
                if (index < 0) {
                    removedElement = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(0, numbers.get(numbers.size() - 1));
                    numbers.remove(numbers.size() - 1);
                } else if (index >= numbers.size()) {
                    removedElement = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(numbers.get(0));
                } else {
                    removedElement = numbers.get(index);
                    numbers.remove(index);
                }
                sumRemovedElements += removedElement;
                for (int num = 0; num < numbers.size(); num++) {
                    if (numbers.get(num) <= removedElement) {
                        numbers.set(num, numbers.get(num) + removedElement);
                    } else {
                        numbers.set(num, numbers.get(num) - removedElement);
                    }
                }
            }
        }
        System.out.println(sumRemovedElements);
    }
}
