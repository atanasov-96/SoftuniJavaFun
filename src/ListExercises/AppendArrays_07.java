package ListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\|");
        List<String> appendedArray = new ArrayList<>();


        for (int i = 0; i < inputArray.length / 2; i++) {
            String firstElement = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = firstElement;
        }

        for (String array : inputArray) {
            String[] splitArray = array.trim().split("\\s+");
            for (String element : splitArray) {
                if (!element.isEmpty()) {
                    appendedArray.add(element);
                }
            }
        }

        for (String e : appendedArray) {
            System.out.print(e + " ");
        }
    }
}