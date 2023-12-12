package FinalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsAndDefinitions = scanner.nextLine().split(" \\| ");
        LinkedHashMap<String, List<String>> notebook = new LinkedHashMap<>();

        for (String wad : wordsAndDefinitions) {
            String[] wadArray = wad.split(": ");
            String word = wadArray[0];
            String definition = wadArray[1];

            if (!notebook.containsKey(word)) {
                List<String> definitions = new ArrayList<>();
                definitions.add(definition);
                notebook.put(word, definitions);
            } else {
                List<String> updatedDefinitions = new ArrayList<>(notebook.get(word));
                updatedDefinitions.add(definition);
                notebook.put(word, updatedDefinitions);
            }
        }
        String[] testWords = scanner.nextLine().split(" \\| ");

        String command = scanner.nextLine();

        if (command.equals("Hand Over")) {
            for (String knownWords : notebook.keySet()) {
                System.out.print(knownWords + " ");
            }

        } else if (command.equals("Test")) {
            for (String w : testWords) {
                if (notebook.containsKey(w)) {
                    System.out.println(w + ":");
                    for (String definition : notebook.get(w)) {
                        System.out.println(" -" + definition);
                    }
                }
            }
        }
    }
}
