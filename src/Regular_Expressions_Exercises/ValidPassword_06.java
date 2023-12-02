package Regular_Expressions_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();

            Pattern pattern = Pattern.compile("(_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+)");
            Matcher matcher = pattern.matcher(password);
            if (!matcher.find()){
                System.out.println("Invalid pass!");
            } else {
                int digitCounter = 0;
                for (int j = 0; j < password.length(); j++) {
                    if (Character.isDigit(password.charAt(j))){
                        digitCounter++;
                    }
                }
                if (digitCounter == 0) {
                    System.out.println("Group: default");
                } else {
                    StringBuilder group = new StringBuilder();
                    for (int s = 0; s < password.length(); s++) {
                        if (Character.isDigit(password.charAt(s))){
                            group.append(password.charAt(s));
                        }
                    }
                    System.out.println("Group: " + group);
                }
            }
        }
    }
}
