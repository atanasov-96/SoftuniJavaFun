package Final_Exam_Prep;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder locations = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(":");
            String command = input[0];
            if (command.equals("Travel")) {
                break;
            }
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(input[1]);
                    String str = input[2];
                    if (locations.length() >= index && index >= 0) {
                        locations.insert(index, str);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);
                    if (startIndex >= 0 && endIndex < locations.length()) {
                        locations.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldLocation = input[1];
                    String newLocation = input[2];
                    int indexOfOldLocation = locations.indexOf(oldLocation);
                    while (indexOfOldLocation != -1) {
                        locations.replace(indexOfOldLocation, indexOfOldLocation + oldLocation.length(), newLocation);
                        indexOfOldLocation = locations.indexOf(oldLocation, indexOfOldLocation + newLocation.length());
                    }
                    break;
            }
            System.out.println(locations);
        }
        System.out.printf("Ready for world tour! Planned stops: %s\n", locations);
    }
}
