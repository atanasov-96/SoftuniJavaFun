package Map_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < lineCount; i++) {
            String[] input = scanner.nextLine().split(" ");

            String command = input[0];
            String user = input[1];
            switch (command) {
                case "register":
                    if (parkingLot.containsKey(user)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", parkingLot.get(user));
                    } else {
                        String licensePlate = input[2];
                        parkingLot.put(user,licensePlate);
                        System.out.printf("%s registered %s successfully\n", user, licensePlate);
                    }
                    break;
                case "unregister":
                    if (!parkingLot.containsKey(user)){
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        parkingLot.remove(user);
                        System.out.printf("%s unregistered successfully\n", user);
                    }
                    break;
            }
        }
        for (Map.Entry<String,String> kvp : parkingLot.entrySet()){
            System.out.printf("%s => %s\n", kvp.getKey(), kvp.getValue());
        }
    }
}
