package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float grade = Float.parseFloat(sc.nextLine());
        if (grade >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
