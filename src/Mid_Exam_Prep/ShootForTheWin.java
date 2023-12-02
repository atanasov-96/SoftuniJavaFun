package Mid_Exam_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int shotTargets = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (0 <= index && index <= targets.length - 1 && targets[index] != -1) {
                int shotIndex = targets[index];
                targets[index] = -1;

                for (int i = 0; i < targets.length; i++) {

                    if (targets[i] != -1) {
                        if (i != index) {
                            if (targets[i] > shotIndex) {
                                targets[i] -= shotIndex;
                            } else {
                                targets[i] += shotIndex;
                            }
                        }
                    }
                }
                shotTargets++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);
        for (int num : targets) {
            System.out.print(num + " ");
        }
    }
}
