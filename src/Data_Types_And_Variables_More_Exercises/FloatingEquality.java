package Data_Types_And_Variables_More_Exercises;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;
        if (Math.abs(number1 - number2) < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


