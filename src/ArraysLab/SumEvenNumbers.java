package ArraysLab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numbersAsString = str.split("\\s+");
        int[] numbers = new int[numbersAsString.length];
        int sum = 0;
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 ==0){
                sum += numbers[j];
            }
        }
        System.out.println(sum);

    }
}
