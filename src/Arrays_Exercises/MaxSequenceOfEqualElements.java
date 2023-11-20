package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String longestStreak = "";
        for (int currIndex = 0; currIndex <= numbers.length - 1; currIndex++) {

            String currStreak = String.valueOf(numbers[currIndex]);
            for (int nextIndex = currIndex + 1; nextIndex <= numbers.length - 1; nextIndex++){

                if (numbers[currIndex] != numbers[nextIndex]){
                    break;
                } else {
                    currStreak += " " + numbers[nextIndex];
                }
            }
            if (currStreak.length() > longestStreak.length()){
                longestStreak = currStreak;
            }
        }
        System.out.println(longestStreak);
    }
}
