package List_Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.contains("course start")) {
            String[] splitInput = input.split(":");
            String command = splitInput[0];
            String lesson = splitInput[1];
            String exercise = lesson + "-Exercise";

            switch (command) {

                case "Add":
                    if (!courses.contains(lesson)) {
                        courses.add(lesson);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(splitInput[2]);
                    if (!courses.contains(lesson) && index >= 0 && index <= courses.size() - 1) {
                        if (courses.contains(exercise)){
                            courses.add(courses.indexOf(exercise), lesson);
                        } else {
                            courses.add(index, lesson);
                        }
                    }
                    break;

                case "Remove":
                    if (courses.contains(exercise)) {
                        courses.remove(lesson);
                        courses.remove(exercise);
                    } else {
                        courses.remove(lesson);
                    }
                    break;

                case "Swap":
                    String lessonTwo = splitInput[2];
                    
                    if (courses.contains(lesson) && courses.contains(lessonTwo)) {
                        int indexOne = courses.indexOf(lesson);
                        int indexTwo = courses.indexOf(lessonTwo);
                        String exerciseTwo = lessonTwo + "-Exercise";

                        Collections.swap(courses, indexOne, indexTwo);

                        if (courses.contains(exercise)){
                            courses.remove(exercise);
                            courses.add(indexTwo + 1,exercise);
                        } else if (courses.contains(exerciseTwo)) {
                            courses.remove(exerciseTwo);
                            courses.add(indexOne + 1,exerciseTwo);
                        } else if (courses.contains(exercise) && courses.contains(exerciseTwo)) {
                            Collections.swap(courses,courses.indexOf(exercise),courses.indexOf(exerciseTwo));
                        }
                    }
                    break;

                case "Exercise":
                    if (!courses.contains(lesson)) {
                        courses.add(lesson);
                        courses.add(exercise);
                    } else if (courses.contains(lesson) && !courses.contains(exercise)){
                        int lessonIndex = courses.indexOf(lesson) + 1;
                        courses.add(lessonIndex, exercise);
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        for (int courseIndex = 0; courseIndex < courses.size(); courseIndex++) {
            System.out.printf("%d.%s%n", courseIndex + 1, courses.get(courseIndex));
        }
    }
}
