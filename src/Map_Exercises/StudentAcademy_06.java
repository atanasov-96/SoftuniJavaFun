package Map_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Double> students = new LinkedHashMap<>();

        for (int i = 0; i < rows; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(student)) {
               students.put(student,grade);
            } else {
                double averageGrade = (students.get(student) + grade) / 2;
                students.put(student, averageGrade);
            }
        }

        for (Map.Entry<String,Double> kvp : students.entrySet()) {
            if (kvp.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f\n", kvp.getKey(), kvp.getValue());
            }
        }
    }
}
