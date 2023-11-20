package Methods_Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        System.out.println(vowelCount(str));
    }

    public static int vowelCount(String str) {
        int count = 0;

        /*for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if (isVowel) {
                count++;
            }

        }*/
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
