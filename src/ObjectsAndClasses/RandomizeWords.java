package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        for (int i = 0; i < words.size(); i++) {
            int num = rnd.nextInt(words.size());
            String temp = words.get(i);
            words.set(i,words.get(num));
            words.set(num, temp);
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
