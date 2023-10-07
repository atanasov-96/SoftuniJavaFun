package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        calculator(command, a, b);
    }

    public static void calculator(String command, int a, int b) {
        if (command.equals("add")) {
            System.out.println(a + b);
        } else if (command.equals("multiply")) {
            System.out.println(a * b);
        } else if (command.equals("subtract")) {
            System.out.println(a - b);
        } else if (command.equals("divide")) {
            System.out.println(a / b);
        }
    }
}
