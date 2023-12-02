package Final_Exam_Prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> piecesComposers = new LinkedHashMap<>();
        LinkedHashMap<String, String> piecesKeys = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] initialPieces = scanner.nextLine().split("\\|");
            String initialPiece = initialPieces[0];
            String initialComposer = initialPieces[1];
            String initialKey = initialPieces[2];
            if (!piecesKeys.containsKey(initialKey)) {
                piecesComposers.put(initialPiece, initialComposer);
                piecesKeys.put(initialPiece, initialKey);
            }
        }
        while (true) {
            String[] input = scanner.nextLine().split("\\|");
            if (input[0].equals("Stop")) {
                break;
            }
            String command = input[0];
            switch (command) {
                case "Add":
                    String addPiece = input[1];
                    String addComposer = input[2];
                    String addKey = input[3];
                    if (piecesKeys.containsKey(addPiece)) {
                        System.out.printf("%s is already in the collection!%n", addPiece);
                    } else {
                        piecesComposers.put(addPiece, addComposer);
                        piecesKeys.put(addPiece, addKey);
                        System.out.printf("%s by %s in %s added to the collection!\n",addPiece,addComposer,addKey);
                    }
                    break;
                case "Remove":
                    String removePiece = input[1];
                    if (!piecesKeys.containsKey(removePiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                    } else {
                     piecesComposers.remove(removePiece);
                     piecesKeys.remove(removePiece);
                        System.out.printf("Successfully removed %s!%n",removePiece);
                    }
                    break;
                case "ChangeKey":
                    String changePiece = input[1];
                    String changeKey = input[2];
                    if (!piecesKeys.containsKey(changePiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",changePiece);
                    } else {
                        piecesKeys.put(changePiece,changeKey);
                        System.out.printf("Changed the key of %s to %s!\n",changePiece,changeKey);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> pc : piecesComposers.entrySet()) {
            String piece = pc.getKey();
            String composer = pc.getValue();
            String key = piecesKeys.get(pc.getKey());
            System.out.printf("%s -> Composer: %s, Key: %s\n", piece, composer, key);
        }
    }
}
