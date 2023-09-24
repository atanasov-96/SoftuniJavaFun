package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        System.out.printf("%.3f", pounds * 1.36);
    }
}
