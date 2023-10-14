package MethodsMoreExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();

        if (command.equals("string")){
            result(input);
        } else if (command.equals("int")) {
            System.out.println(result(Integer.parseInt(input)));
        } else if (command.equals("real")) {
            System.out.printf("%.2f", result(Double.parseDouble(input)));
        }
    }
    public static void result(String string){
        System.out.printf("$%s$",string);
    }
    public static int result(int num) {
        return num * 2;
    }
    public static double result(double num){
        return num * 1.5;
    }
}
