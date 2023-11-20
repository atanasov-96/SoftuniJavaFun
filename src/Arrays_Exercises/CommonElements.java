package Arrays_Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        //String commonElements = "";
        /*for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (secondArr[i].equals(firstArr[j])){
                    commonElements += secondArr[i] + " ";
                }
            }
        }*/
        for (String el2: secondArr) {
            for (String el1:firstArr) {
                if(el2.equals(el1)){
                    //commonElements += el2 + " ";
                    System.out.print(el2 + " ");
                }
            }
        }
        //System.out.println(commonElements);
    }
}
