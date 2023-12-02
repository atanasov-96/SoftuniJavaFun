package Final_Exam_Prep;

import java.util.Scanner;

public class The_Imitation_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split("\\|");

            if (input[0].equals("Decode")) {
                break;
            }
            String command = input[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(input[1]);
                    numberOfLetters %= encryptedMessage.length();  // Ensure not to exceed the length
                    String movedSubstring = encryptedMessage.substring(0, numberOfLetters);
                    encryptedMessage.delete(0, numberOfLetters);
                    encryptedMessage.append(movedSubstring);
                    break;

                case "Insert":
                    int index = Integer.parseInt(input[1]);
                    if (index >= 0 && index <= encryptedMessage.length()) {
                        String ch = input[2];
                        encryptedMessage.insert(index, ch);
                    }
                    break;

                case "ChangeAll":
                    String symbol1 = input[1];
                    String symbol2 = input[2];
                    encryptedMessage = new StringBuilder(encryptedMessage.toString().replace(symbol1, symbol2));
                    break;
            }
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
