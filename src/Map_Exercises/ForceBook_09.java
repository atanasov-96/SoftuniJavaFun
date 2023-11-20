/*package MapExercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
       // LinkedHashMap<String, List<String>> darkSide = new LinkedHashMap<>();


        while (true) {
            String[] input = scanner.nextLine().split(" | ");
            if (input[0].equals("Lumpawaroo")) {
                break;
            }
            String side = input[0];
            String user = input[1];
            List<String> users = new ArrayList<>();
            users.add(user);
            if (!map.containsKey(side)) {
                map.put(side, users);
            } else {
                map.put(side, map.get(side))
            }

        }
    }
}
*/