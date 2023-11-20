package Map_Exercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> employeeData = new LinkedHashMap<>();

        while (true) {
            String[] input = scanner.nextLine().split(" -> ");
            if (input[0].equals("End")) {
                break;
            }
            String company = input[0];
            String employeeID = input[1];

            if (!employeeData.containsKey(company)){
                List<String> currCompanyEmployees = new ArrayList<>();
                currCompanyEmployees.add(employeeID);
                employeeData.put(company, currCompanyEmployees);
            } else {
                List<String> newEmployees = employeeData.get(company);
                if (!newEmployees.contains(employeeID)) {
                    newEmployees.add(employeeID);
                }
                employeeData.put(company, newEmployees);
            }

        }
        for (Map.Entry<String, List<String>> kvp : employeeData.entrySet()) {
            System.out.printf("%s%n",kvp.getKey());
            List<String> value = kvp.getValue();
            for (String v : value) {
                System.out.printf("-- %s%n", v);
            }
        }

    }
}
