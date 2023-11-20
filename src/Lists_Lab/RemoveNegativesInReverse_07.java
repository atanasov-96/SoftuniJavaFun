package Lists_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesInReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
