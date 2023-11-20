package List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        while (!player1.isEmpty() && !player2.isEmpty()) {

            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.remove(0);
                player1.add(player2.get(0));
                player2.remove(0);
            } else if (player1.get(0) < player2.get(0)) {
                player2.add(player2.get(0));
                player2.remove(0);
                player2.add(player1.get(0));
                player1.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }

        int sum = 0;
        if (!player1.isEmpty()) {
            for (int card : player1) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (int card : player2) {
                sum += card;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
