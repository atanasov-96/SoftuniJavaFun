package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people = Double.parseDouble(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());
        double courses = Math.ceil(people/capacity);
        System.out.printf("%.0f",courses);
    }
}
