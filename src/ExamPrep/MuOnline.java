package ExamPrep;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < dungeonRooms.size(); i++) {
            String[] input = dungeonRooms.get(i).split(" ");
            String command = input[0];
            int number = Integer.parseInt(input[1]);

            if (command.equals("potion")) {
                if (health < 100) {
                    if (health + number > 100) {
                        System.out.printf("You healed for %d hp.\n", 100 - health);
                        health = 100;
                    } else {
                        health += number;
                        System.out.printf("You healed for %d hp.\n", number);
                    }
                    System.out.printf("Current health: %d hp.\n", health);
                }
            } else if (command.equals("chest")) {
                System.out.printf("You found %d bitcoins.\n", number);
                bitcoins += number;
            } else {
                health -= number;
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.\n", command);
                    System.out.printf("Best room: %d\n", i + 1);
                    return;
                } else {
                    System.out.printf("You slayed %s.\n", command);
                }
            }
        }
        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + bitcoins);
        System.out.println("Health: " + health);
    }
}
