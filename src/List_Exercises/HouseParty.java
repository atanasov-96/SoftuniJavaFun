package List_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        System.out.println();
        for (int i = 1; i <= guests; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            String decision = input[2];

            if (decision.equals("going!")) {
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                } else {
                    guestList.add(name);
                }
            }
            if (decision.equals("not")) {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }
        }
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
