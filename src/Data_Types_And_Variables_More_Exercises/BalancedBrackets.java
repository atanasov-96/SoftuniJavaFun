package Data_Types_And_Variables_More_Exercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());


        int leftBracket = 0;
        int rightBracket = 0;

        for (int l = 1; l <= lines; l++) {
            String line = scanner.nextLine();
            if (line.equals("(")) {
                leftBracket++;
            }
            if (line.equals(")")) {
                rightBracket++;
                if (leftBracket - rightBracket != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (leftBracket == rightBracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

