package Final_Exam_Prep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder(scanner.nextLine());
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            if (command.equals("Done")) {
                break;
            }
            StringBuilder newRawPass = new StringBuilder();
            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            newRawPass.append(password.charAt(i));
                        }
                    }
                    password = newRawPass;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(input[1]);
                    int length = Integer.parseInt(input[2]);
                    password.delete(index, index + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = input[1];
                    String substitute = input[2];
                    int indexOfSubstring = password.indexOf(substring);
                    if (indexOfSubstring != -1){
                        while (indexOfSubstring != -1) {
                            password.replace(indexOfSubstring, indexOfSubstring + substring.length(), substitute);
                            indexOfSubstring = password.indexOf(substring, indexOfSubstring + substitute.length());
                        }
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
        System.out.printf("Your password is: %s",password);
    }
}
