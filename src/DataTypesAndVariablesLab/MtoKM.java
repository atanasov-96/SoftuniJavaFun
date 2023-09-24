package DataTypesAndVariablesLab;

import java.util.Scanner;

public class MtoKM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = scanner.nextDouble();
        System.out.printf("%.2f", meters / 1000);
    }
}
