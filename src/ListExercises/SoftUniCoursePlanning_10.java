package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coursesList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.contains("course start")) {
            String[] splitInput = input.split(":");
            String command = splitInput[0];
            switch (command) {

                case "Add":

                    if (!coursesList.contains(splitInput[1])) {
                        coursesList.add(splitInput[1]);
                    }
                    break;

                case "Insert":
                    String insertCourse = splitInput[1];
                    int index = Integer.parseInt(splitInput[2]);
                    if (!coursesList.contains(insertCourse) && index >= 0 && index <= coursesList.size() - 1) {
                        coursesList.add(index, insertCourse);
                    }
                    break;

                case "Remove":
                    String removeCourse = splitInput[1];
                    if (coursesList.contains(removeCourse)) {
                        int exerciseIndex = coursesList.indexOf(removeCourse) + 1;
                        if (coursesList.contains(exerciseIndex)) {
                            coursesList.remove(exerciseIndex);
                            coursesList.remove(removeCourse);
                        }else {
                            coursesList.remove(removeCourse);
                        }
                    }
                    break;
                case "Swap":
                    break;
                case "Exercise":
                    break;
            }

            input = scanner.nextLine();
        }
        for (String c : coursesList) {

        }
    }
}
