package ArraysMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOFStrings = Integer.parseInt(scanner.nextLine());
        long[] encryptedArray = new long[numOFStrings];

        for (int n = 0; n < numOFStrings; n++) {
            String str = scanner.nextLine();

            long encryptedSum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

                if (isVowel) {
                    encryptedSum += ch * str.length();
                } else if (Character.isLetter(ch)) {
                    encryptedSum += ch / str.length();
                }
            }

            encryptedArray[n] = encryptedSum;

        }
        Arrays.sort(encryptedArray);
        for (int e = 0; e < encryptedArray.length; e++) {
            System.out.println(encryptedArray[e]);
        }
    }
}

