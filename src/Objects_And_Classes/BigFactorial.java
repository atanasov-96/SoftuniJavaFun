package Objects_And_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        BigInteger factor = BigInteger.valueOf(1);
        for (int i = num ; i >= 1 ; i--) {
            factor = factor.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factor);
    }
}
