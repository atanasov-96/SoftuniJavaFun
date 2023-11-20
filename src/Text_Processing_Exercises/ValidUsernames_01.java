package Text_Processing_Exercises;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            boolean isValid = true;

            for (int i = 0; i < username.length(); i++) {
                char ch = username.charAt(i);

                if (!Character.isDigit(ch) && !Character.isLetter(ch) && ch != '-' && ch != '_') {
                    isValid = false;
                    break;
                }
            }
            if (isValid && username.length() >= 3 && username.length() <= 16) {
                System.out.println(username);
            }
        }
    }
}
