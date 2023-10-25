package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Man_O_War {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        double maxHealth = Double.parseDouble(scanner.nextLine());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Retire")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            if (command.equals("Fire")) {
                int index = Integer.parseInt(splitInput[1]);
                int damage = Integer.parseInt(splitInput[2]);
                if (0 <= index && index <= warShip.size() - 1) {
                    int damageDone = warShip.get(index) - damage;
                    warShip.set(index, damageDone);
                    if (warShip.get(index) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        warShip.clear();
                        return;
                    }
                }
            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(splitInput[1]);
                int endIndex = Integer.parseInt(splitInput[2]);
                int damage = Integer.parseInt(splitInput[3]);
                if (0 <= startIndex && startIndex <= endIndex && endIndex <= pirateShip.size() - 1) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int damageDone = pirateShip.get(i) - damage;
                        pirateShip.set(i, damageDone);
                        if (pirateShip.get(i) <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            pirateShip.clear();
                            return;
                        }
                    }
                }
            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(splitInput[1]);
                int health = Integer.parseInt(splitInput[2]);
                if (0 <= index && index <= pirateShip.size() - 1) {
                    pirateShip.set(index, pirateShip.get(index) + health);
                    if (pirateShip.get(index) > maxHealth) {
                        pirateShip.set(index, (int) maxHealth);
                    }
                }
            } else if (command.equals("Status")) {
                int sectionsNeedingRepair = 0;
                for (int i : pirateShip) {
                    double percentage = (i / maxHealth) * 100;
                    if (percentage < 20) {
                        sectionsNeedingRepair++;
                    }
                }
                System.out.printf("%d sections need repair.\n", sectionsNeedingRepair);
            }
        }

        int pirateSum = 0;
        int warSum = 0;
        for (int e : pirateShip) {
            pirateSum += e;
        }
        for (int e : warShip) {
            warSum += e;
        }
        System.out.println("Pirate ship status: " + pirateSum);
        System.out.println("Warship status: " + warSum);

    }
}
