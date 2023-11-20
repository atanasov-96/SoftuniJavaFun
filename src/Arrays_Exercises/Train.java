package Arrays_Exercises;

import java.util.Scanner;
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] trainPassengers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            trainPassengers[i] = passengers;
            sum += passengers;
        }
        for (int i = 0; i < trainPassengers.length ; i++) {
            System.out.print(trainPassengers[i] + " ");
        }
        System.out.println("\n"+sum);
    }
}
