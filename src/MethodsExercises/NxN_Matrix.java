package MethodsExercises;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        matrix(num);

    }
    public static void matrix(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
