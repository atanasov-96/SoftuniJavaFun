package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        int sum = 0;
        int number = 1;
        for (int i = 0; i < nums; i++) {
            sum += number;
            System.out.println(number);
            number += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}


