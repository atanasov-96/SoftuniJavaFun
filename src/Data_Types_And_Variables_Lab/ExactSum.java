package Data_Types_And_Variables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal result = BigDecimal.ZERO;

        for (int i = 1; i <= n; i++) {
            BigDecimal num = scanner.nextBigDecimal();
            result = result.add(num);
        }
        System.out.println(result);
    }
}
