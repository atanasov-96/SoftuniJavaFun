package Final_Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> carsAndMiles = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carsAndFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] initialCars = scanner.nextLine().split("\\|");
            String initialCar = initialCars[0];
            int mileage = Integer.parseInt(initialCars[1]);
            int fuel = Integer.parseInt(initialCars[2]);
            carsAndMiles.put(initialCar, mileage);
            carsAndFuel.put(initialCar, fuel);
        }
        while (true) {
            String[] input = scanner.nextLine().split(" : ");
            String command = input[0];
            if (command.equals("Stop")) {
                break;
            }
            switch (command) {
                case "Drive":
                    String carDriven = input[1];
                    int distanceTraveled = Integer.parseInt(input[2]);
                    int fuelConsumed = Integer.parseInt(input[3]);

                    if (carsAndFuel.get(carDriven) < fuelConsumed) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsAndMiles.put(carDriven, carsAndMiles.get(carDriven) + distanceTraveled);
                        carsAndFuel.put(carDriven, carsAndFuel.get(carDriven) - fuelConsumed);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carDriven, distanceTraveled, fuelConsumed);

                        if (carsAndMiles.get(carDriven) >= 100_000) {
                            System.out.printf("Time to sell the %s!%n", carDriven);
                            carsAndMiles.remove(carDriven);
                            carsAndFuel.remove(carDriven);
                        }
                    }
                    break;

                case "Refuel":
                    String carRefueled = input[1];
                    int fuelAmount = Integer.parseInt(input[2]);

                    int currentFuel = carsAndFuel.get(carRefueled);
                    int refuel = fuelAmount + currentFuel;
                    int amountRefueled = fuelAmount;

                    if (refuel > 75) {
                        amountRefueled = 75 - currentFuel;
                        refuel = 75;
                    }
                    carsAndFuel.put(carRefueled, refuel);
                    System.out.printf("%s refueled with %d liters%n", carRefueled, amountRefueled);
                    break;

                case "Revert":
                    String revertedCar = input[1];
                    int milesToRevert = Integer.parseInt(input[2]);

                    int currentMiles = carsAndMiles.get(revertedCar);
                    int revertedMiles = currentMiles - milesToRevert;

                    if (revertedMiles < 10_000) {
                        carsAndMiles.put(revertedCar, 10_000);
                    } else {
                        carsAndMiles.put(revertedCar, revertedMiles);
                        System.out.printf("%s mileage decreased by %d kilometers%n", revertedCar, milesToRevert);
                    }
                    break;
            }
        }
        for (Map.Entry<String,Integer> kvp : carsAndMiles.entrySet()) {
            String car = kvp.getKey();
            int miles = kvp.getValue();
            int fuelTank = carsAndFuel.get(kvp.getKey());

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",car,miles,fuelTank);
        }
    }
}
