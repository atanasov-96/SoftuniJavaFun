package Text_Processing_Exercises;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] filePath = scanner.nextLine().split("\\\\");

        String[] fileProperties = filePath[filePath.length - 1].split("\\.");

        String fileName = fileProperties[0];
        String fileExtension = fileProperties[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);

    }
}
