package Map_Exercises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String[] input = scanner.nextLine().split(" : ");
            if (input[0].equals("end")) {
                break;
            }
            String course = input[0];
            String student = input[1];

            List<String> students = new ArrayList<>();
            students.add(student);

            if (!courses.containsKey(course)) {
                courses.put(course,students);
            } else {
                List<String> newStudents = courses.get(course);
                newStudents.add(student);
                courses.put(course,newStudents);
            }

        }
        for (Map.Entry<String,List<String>> kvp : courses.entrySet()) {
            List<String> outStudents = kvp.getValue();
            System.out.printf("%s: %d\n", kvp.getKey(),outStudents.size());
            for (String student : outStudents) {
                System.out.println("-- " + student);
            }
        }

    }
}
