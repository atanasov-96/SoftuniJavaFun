package Mid_Exam_Prep;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        int wonBattles = 0;

        if (energy <= 0) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
            return;
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End of battle")) {
                break;
            }
            if (energy <= 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                return;
            }

            int distance = Integer.parseInt(input);


            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                return;

            } else {
                energy -= distance;
                wonBattles++;
                if (wonBattles % 3 == 0) {
                    energy += wonBattles;
                }
            }
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
    }
}