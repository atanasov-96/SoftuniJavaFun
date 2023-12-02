package List_Exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if (command.equals("3:1")) {
                break;
            }
            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > elements.size() - 1) {
                        endIndex = elements.size() - 1;
                    }
                    int counter = startIndex;

                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = elements.get(counter) + elements.get(counter + 1);
                        elements.set(counter, concat);
                        elements.remove(counter + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(input[1]);
                    int partitions = Integer.parseInt(input[2]);

                    String element = elements.get(index);
                    int partLength = element.length() / partitions;

                    List<String> divided = new ArrayList<>();

                    int start = 0;
                    for (int i = 0; i < partitions - 1; i++) {
                        divided.add(element.substring(start, start + partLength));
                        start += partLength;
                    }

                    divided.add(element.substring(start));

                    elements.remove(index);
                    elements.addAll(index, divided);
                    break;
            }
        }
        System.out.printf(String.join(" ", elements));
    }
}
