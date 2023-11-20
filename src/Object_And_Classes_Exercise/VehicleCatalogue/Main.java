package Object_And_Classes_Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> catalogue = new ArrayList<>();
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("End")) {
                break;
            }
            String type = input[0];
            String model = input[1];
            String color = input[2];
            int horsepower = Integer.parseInt(input[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            catalogue.add(vehicle);
        }

        while (true) {
            String model = scanner.nextLine();
            if (model.equals("Close the Catalogue")) {
                break;
            }
            for (Vehicle v : catalogue) {
                if (v.getModel().equals(model)) {
                    System.out.println("Type: " + v.getType());
                    System.out.println("Model: " + v.getModel());
                    System.out.println("Color: " + v.getColor());
                    System.out.println("Horsepower: " + v.getHorsepower());
                    break;
                }
            }
        }
        double sumCarPower = 0.0;
        int carCount = 0;
        double sumTruckPower = 0.0;
        int truckCount = 0;
        for (Vehicle type : catalogue) {
            if (type.getType().equals("Car")) {
                sumCarPower += type.getHorsepower();
                carCount++;
            }
            if (type.getType().equals("Truck")) {
                sumTruckPower += type.getHorsepower();
                truckCount++;
            }
        }

        double averageCarPower = (carCount > 0) ? sumCarPower / carCount : 0.00;
        double averageTruckPower = (truckCount > 0) ? sumTruckPower / truckCount : 0.00;
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarPower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckPower);

    }
}
