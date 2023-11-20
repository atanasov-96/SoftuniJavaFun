package Basic_Syntax_Conditional_Statements_And_Loops_More_Exercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rts = "";
        // StringBuilder rts = new StringBuilder(str);
        //System.out.println(rts.reverse());
        for (int i = str.length() - 1; i >= 0; i--) {
            rts += str.charAt(i);
            System.out.println(str.charAt(i));
        }
        System.out.println(rts);
    }
}
