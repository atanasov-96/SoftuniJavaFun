package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String language = sc.nextLine();
        languages(language);
    }
    public static void languages(String language) {
        switch (language) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
