package Mid_Exam_Prep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Love!")) {
                break;
            }
            if (input.contains("Jump")) {
                String[] splitInput = input.split(" ");
                int length = Integer.parseInt(splitInput[1]);

                int currHouse = 0 + houses.get(length);

                if (houses.get(currHouse) <= 0){
                    System.out.printf("Place %d already had Valentine's day.", currHouse);
                } else {
                    houses.set(currHouse, houses.get(currHouse) - 2);
                    if (houses.get(currHouse) <= 0) {
                        System.out.printf("Place %d has Valentine's day.\n", currHouse);
                    }
                }
                if (currHouse > houses.size()) {
                    currHouse = 0;
                }

            }
        }

    }
}