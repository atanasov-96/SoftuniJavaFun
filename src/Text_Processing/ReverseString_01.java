package Text_Processing;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            if (str.equals("end")) {
                break;
            }
            StringBuilder reverse = new StringBuilder(str).reverse();
            System.out.printf("%s = %s%n",str,reverse);

        }
    }
}
