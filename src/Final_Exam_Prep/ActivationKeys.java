package Final_Exam_Prep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder rawKey = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(">>>");
            if (input[0].equals("Generate")) {
                break;
            }

            String command = input[0];

            int startIndex, endIndex;

            switch (command) {

                case "Contains":
                    String substring = input[1];
                    int subIndex = rawKey.indexOf(substring);
                    if (subIndex != -1) {
                        System.out.printf("%s contains %s%n", rawKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String flip = input[1];
                    startIndex = Integer.parseInt(input[2]);
                    endIndex = Integer.parseInt(input[3]);

                    rawKey = flipper(flip, rawKey, startIndex, endIndex);

                    System.out.println(rawKey);
                    break;

                case "Slice":
                    startIndex = Integer.parseInt(input[1]);
                    endIndex = Integer.parseInt(input[2]);
                    if (startIndex >= 0 && endIndex < rawKey.length()) {
                        rawKey.delete(startIndex, endIndex);
                    } else {
                        rawKey.delete(startIndex, rawKey.length());
                    }
                    System.out.println(rawKey);
                    break;
            }
        }
        System.out.printf("Your activation key is: %s%n", rawKey);
    }

    public static StringBuilder flipper(String flip, StringBuilder key, int startIndex, int endIndex) {
        String flippedString = "";

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (endIndex > key.length()) {
            endIndex = key.length();
        }

        switch (flip) {
            case "Upper":
                flippedString = key.substring(startIndex, endIndex).toUpperCase();
                break;

            case "Lower":
                flippedString = key.substring(startIndex, endIndex).toLowerCase();
                break;
        }

        key.replace(startIndex, endIndex, flippedString);
        return key;
    }

}
