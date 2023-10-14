package ListExercises;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());

        while (true) {


            String[] input = scanner.nextLine().split("\\s+");

            if (Arrays.asList(input).contains("end")){
                break;
            }
            if (input.length > 1) {
                String command = input[0];

                if (command.equals("Add")) {
                    int wagon = Integer.parseInt(input[1]);
                    wagons.add(wagon);
                }
            } else {
                int newPassengers = Integer.parseInt(input[0]);
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int oldPassengers = wagons.get(i);
                    if (oldPassengers + newPassengers <= maxPassengers) {
                        wagons.set(i, oldPassengers + newPassengers);
                        break;
                    }
                }
            }
        }
        for (int e : wagons) {
            System.out.print(e + " ");
        }
    }
}
