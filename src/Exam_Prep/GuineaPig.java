package Exam_Prep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodAmount = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayAmount = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverAmount = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;
        for (int i = 1; i <= 30; i++) {

            foodAmount -= 300;
            if (i % 2 == 0){
                hayAmount -= foodAmount * 0.05;
            }
            if (i % 3 == 0){
                coverAmount -= weight / 3;
            }
            if (foodAmount <= 0 || hayAmount <= 0 || coverAmount <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodAmount / 1000, hayAmount / 1000, coverAmount / 1000);
    }
}
