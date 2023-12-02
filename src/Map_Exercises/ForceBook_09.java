package MapExercises;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> force = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }

            if (input.contains("|")) {
                String[] splitLine = input.split(" \\| ");
                String side = splitLine[0];
                String user = splitLine[1];


                List<String> users = new ArrayList<>();
                if (!force.containsKey(side)) {
                    users.add(user);
                    force.put(side, users);
                } else {
                    if (!force.get(side).contains(user)) {
                        users = new ArrayList<>(force.get(side));
                        users.add(user);
                        force.put(side, users);
                    }
                }
            }
            if (input.contains("->")) {
                String[] changeSide = input.split(" -> ");
                String forceUser = changeSide[0];
                String newForceSide = changeSide[1];

                String currentForceSide = findForceSide(force, forceUser);

                if (currentForceSide != null) {
                    force.get(currentForceSide).remove(forceUser);
                }

                force.putIfAbsent(newForceSide, new ArrayList<>());
                force.get(newForceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, newForceSide);
            }

        }
        for (Map.Entry<String, List<String>> entry : force.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String name : entry.getValue()){
                    System.out.printf("! %s%n",name);
                }
            }
        }
    }

    private static String findForceSide(Map<String, List<String>> forceSides, String forceUser) {
        for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
            if (entry.getValue().contains(forceUser)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
