package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfMessages; i++) {
            String message = scanner.nextLine();
            Pattern messagePattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]");
            Matcher messageVerifier = messagePattern.matcher(message);

            if (!messageVerifier.find()) {
                System.out.println("The message is invalid");
            } else {
                StringBuilder verifiedMessage = new StringBuilder();
                String command = messageVerifier.group("command");
                verifiedMessage.append(command + ":");
                String messageArray = messageVerifier.group("message");
                for (int j = 0; j < messageArray.length(); j++) {
                    char ch = messageArray.charAt(j);

                    verifiedMessage.append( String.valueOf(" " + (int) ch));
                }
                System.out.println(verifiedMessage);
            }
        }
    }
}
