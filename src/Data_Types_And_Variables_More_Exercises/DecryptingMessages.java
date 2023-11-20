package Data_Types_And_Variables_More_Exercises;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int chars = Integer.parseInt(scanner.nextLine());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < chars; i++) {
            char ch = scanner.nextLine().charAt(0);
            message.append((char) (ch + key));
        }
        System.out.println(message);

    }
}
