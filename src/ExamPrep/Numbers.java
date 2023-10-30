package ExamPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double average = sum / numbers.size();

        Collections.sort(numbers);
        Collections.reverse(numbers);

        int i = 0;
        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) > average) {
                System.out.print(numbers.get(n) + " ");
                i++;
            }
            if (i == 5) {
                return;
            }
        }
        if (i == 0) {
            System.out.println("No");
        }
    }
}
