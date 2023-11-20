package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class BeerKeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double maxVolume = 0;

        for (int keg = 1; keg <= numberOfKegs; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * Math.pow(radius,2) * height;

            if (currentVolume > maxVolume) {
                biggestKeg = kegModel;
                maxVolume = currentVolume;
            }
        }
        System.out.println(biggestKeg);
    }
}