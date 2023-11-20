package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum,secondNum));;
        } else if (type.equals("char")) {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstChar,secondChar));
        } else if (type.equals("string")) {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            System.out.println(getMax(firstString,secondString));
        }

    }

    public static int getMax(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static char getMax(char a, char b){
        if (a > b){
            return a;
        }
        return b;
    }
    public static String getMax(String a, String b){
        if (a.compareTo(b) >= 0 ){
            return a;
        }
        return b;
    }

}
