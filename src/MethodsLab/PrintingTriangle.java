package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        printFigure(size);

    }

    public static void printFigure(int size) {

        for (int i = 1; i <= size; i++) {
            printLine(i);
        }

        for (int i = size - 1 ; i >= 1 ; i--) {
            printLine(i);
        }
    }


    public static void printLine(int size) {
        for (int i = 1; i <= size ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
