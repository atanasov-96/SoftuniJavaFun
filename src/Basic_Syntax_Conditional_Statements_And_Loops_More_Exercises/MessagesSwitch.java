package Basic_Syntax_Conditional_Statements_And_Loops_More_Exercises;

import java.util.Scanner;

public class MessagesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String str = "";
        char ch = ' ';
        for (int i = 0; i < lines; i++) {
            int letter = Integer.parseInt(scanner.nextLine());
            switch (letter) {
                case 2:
                    ch = 'a';
                    break;
                case 22:
                    ch = 'b';
                    break;
                case 222:
                    ch = 'c';
                    break;
                case 3:
                    ch = 'd';
                    break;
                case 33:
                    ch = 'e';
                    break;
                case 333:
                    ch = 'f';
                    break;
                case 4:
                    ch = 'g';
                    break;
                case 44:
                    ch = 'h';
                    break;
                case 444:
                    ch = 'i';
                    break;
                case 5:
                    ch = 'j';
                    break;
                case 55:
                    ch = 'k';
                    break;
                case 555:
                    ch = 'l';
                    break;
                case 6:
                    ch = 'm';
                    break;
                case 66:
                    ch = 'n';
                    break;
                case 666:
                    ch = 'o';
                    break;
                case 7:
                    ch = 'p';
                    break;
                case 77:
                    ch = 'q';
                    break;
                case 777:
                    ch = 'r';
                    break;
                case 7777:
                    ch = 's';
                    break;
                case 8:
                    ch = 't';
                    break;
                case 88:
                    ch = 'u';
                    break;
                case 888:
                    ch = 'v';
                    break;
                case 9:
                    ch = 'w';
                    break;
                case 99:
                    ch = 'x';
                    break;
                case 999:
                    ch = 'y';
                    break;
                case 9999:
                    ch = 'z';
                    break;
                case 0:
                    ch = ' ';
                    break;
            }
            str += ch;
        }
        System.out.println(str);
    }
}