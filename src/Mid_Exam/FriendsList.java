package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int blacklistedCount = 0;
        int lostCount = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Report")) {
                break;
            }
            String[] splitInput = input.split(" ");

            String command = splitInput[0];

            if (command.equals("Blacklist")) {
                String name = splitInput[1];
                if (friendsList.contains(name)) {
                    System.out.printf("%s was blacklisted.\n", name);
                    friendsList.set(friendsList.indexOf(name), "Blacklisted");
                    blacklistedCount++;
                } else {
                    System.out.printf("%s was not found.\n", name);
                }
            } else if (command.equals("Error")) {
                int index = Integer.parseInt(splitInput[1]);
                if (index >= 0 && index <= friendsList.size() - 1 && !friendsList.get(index).equals("Blacklisted") && !friendsList.get(index).equals("Lost")) {
                    System.out.printf("%s was lost due to an error.\n", friendsList.get(index));
                    friendsList.set(index, "Lost");
                    lostCount++;
                }
            } else if (command.equals("Change")) {
                int index = Integer.parseInt(splitInput[1]);
                String newName = splitInput[2];
                if (index >= 0 && index <= friendsList.size() - 1) {
                    System.out.printf("%s changed his username to %s.\n", friendsList.get(index), newName );
                    friendsList.set(index,newName);
                }
            }
        }
        System.out.printf("Blacklisted names: %d\n", blacklistedCount);
        System.out.printf("Lost names: %d\n", lostCount);
        System.out.println(String.join(" ", friendsList));

    }
}
