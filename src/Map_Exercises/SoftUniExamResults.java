package Map_Exercises;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> subCount = new LinkedHashMap<>();


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exam finished")) {
                break;
            }

            String[] splitInput = input.split("-");

            if (splitInput[1].equals("banned")) {
                userPoints.remove(splitInput[0]);
            } else {

                String user = splitInput[0];
                String language = splitInput[1];
                int points = Integer.parseInt(splitInput[2]);


                if (!userPoints.containsKey(user)) {
                    userPoints.put(user, points);
                } else if (userPoints.get(user) < points) {
                    userPoints.put(user, points);
                }

                if (!subCount.containsKey(language)) {
                    subCount.put(language, 1);
                } else {
                    subCount.put(language, subCount.get(language) + 1);
                }
            }
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : userPoints.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> count : subCount.entrySet()) {
            System.out.printf("%s - %d%n", count.getKey(), count.getValue());
        }

    }
}
