package Final_Exam_Prep;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(":\\|:");
            String command = input[0];
            if (command.equals("Reveal")) {
                break;
            }
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(input[1]);
                    concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(input[1]);
                    int startIndex = concealedMessage.indexOf(substring.toString());
                    if (startIndex != -1) {
                        int endIndex = startIndex + substring.length();
                        concealedMessage.delete(startIndex, endIndex);
                        substring.reverse();
                        concealedMessage.append(substring);
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldSubstring = input[1];
                    String replacementSubstring = input[2];
                    int indexOfOldSubstring = concealedMessage.indexOf(oldSubstring);
                    while (indexOfOldSubstring != -1) {
                        concealedMessage.replace(indexOfOldSubstring, indexOfOldSubstring + oldSubstring.length(), replacementSubstring);
                        indexOfOldSubstring = concealedMessage.indexOf(oldSubstring, indexOfOldSubstring + replacementSubstring.length());
                    }
                    System.out.println(concealedMessage);
                    break;
            }
        }
        System.out.printf("You have a new text message: %s%n", concealedMessage);
    }
}
