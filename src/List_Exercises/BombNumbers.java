package List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String[] bombStats = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(bombStats[0]);
        int power = Integer.parseInt(bombStats[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);
            int leftIndex = Math.max(0, index - power);
            int rightIndex = Math.min(numbers.size() - 1, index + power);

            for (int i = rightIndex; i >= leftIndex; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
