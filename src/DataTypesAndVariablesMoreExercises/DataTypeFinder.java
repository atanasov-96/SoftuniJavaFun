package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        while (!type.equals("END")) {
            Scanner input = new Scanner(type);
            if (input.hasNextBoolean()) {
                System.out.printf("\n%s is boolean type", type);
            } else if (input.hasNextInt()) {
                System.out.printf("\n%s is integer type", type);
            } else if (type.length() == 1) {
                System.out.printf("\n%s is character type", type);
            } else if (input.hasNextDouble()) {
                System.out.printf("\n%s is floating point type", type);
            } else if (input.hasNextLine()) {
                System.out.printf("\n%s is string type", type);
            }
            type = scanner.nextLine();
        }
    }
}