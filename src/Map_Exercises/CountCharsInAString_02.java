package Map_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();


        char[] charArray = string.toCharArray();

        for (char ch : charArray) {
            if (ch != ' ') {
                if (!charMap.containsKey(ch)) {
                    charMap.put(ch, 1);
                } else {
                    charMap.put(ch, charMap.get(ch) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> kvp : charMap.entrySet()) {
            System.out.printf("%c -> %d%n", kvp.getKey(), kvp.getValue());
        }
    }
}

