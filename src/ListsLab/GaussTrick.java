package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        if (numbers.size() % 2 != 0){
            int middleIndex = numbers.size() / 2 + 1;
            numbers.add(middleIndex, 0);
        }
        for (int i = 0; i < numbers.size() - 1; i++) {

            int firstNum = numbers.get(i);
            int lastNum = numbers.get(numbers.size() - 1);
            int sum = firstNum + lastNum;

            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);

        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
