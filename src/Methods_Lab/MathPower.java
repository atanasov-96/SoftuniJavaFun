package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = powerUp(number, power);

        System.out.print(new DecimalFormat("0.####").format(result));
    }

    public static double powerUp(double num, double pow) {

        return Math.pow(num, pow);

    }
}
