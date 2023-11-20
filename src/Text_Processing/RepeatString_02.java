package Text_Processing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> str = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        for (String word : str) {
            for (int i = 0; i < word.length(); i++) {
                result.add(word);
            }
        }
        System.out.println(String.join("",result));
    }
}



