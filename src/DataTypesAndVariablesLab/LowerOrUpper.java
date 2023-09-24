package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals(s.toUpperCase())){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
