package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        stringRepeater(string,times);
    }
    public static void stringRepeater(String str, int times){
        for (int i = 1; i <= times; i++){
            System.out.print(str);
        }
    }
}
