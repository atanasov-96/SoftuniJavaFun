package FinalExam;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if (command.equals("Done")) {

                break;
            }
            switch (command) {
                case "Change":
                    String originalChar = input[1];
                    String replacementChar = input[2];
                    string = new StringBuilder(string.toString().replaceAll(originalChar, replacementChar));
                    System.out.println(string);
                    break;
                case "Includes":
                    String includes = input[1];
                    if (string.toString().contains(includes)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String end = input[1];
                    if (string.toString().endsWith(end)){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    string = new StringBuilder(string.toString().toUpperCase());
                    System.out.println(string);
                    break;
                case "FindIndex":
                    String index = input[1];
                    System.out.println(string.indexOf(index));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(input[1]);
                    int count = Integer.parseInt(input[2]);
                    string = new StringBuilder(string.substring(startIndex, startIndex + count));
                    System.out.println(string);

                    break;
            }
        }
    }
}
