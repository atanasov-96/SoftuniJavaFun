package MethodsLab;

import java.util.Scanner;

public class CalculateAreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        rectangleArea(width,height);
    }

    public static void rectangleArea(int width, int height){
        System.out.println(width*height);
    }
}
