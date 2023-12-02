package Final_Exam_Prep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int barcodeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < barcodeCount; i++) {
            String barcode = scanner.nextLine();
            Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)");
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()){
                String match = matcher.group();
                StringBuilder group = new StringBuilder("00");

                if (match.matches(".*\\d.*")){
                    group.setLength(0);
                    for (int symbol = 0; symbol < match.length(); symbol++) {
                        if (Character.isDigit(match.charAt(symbol))) {
                            group.append(match.charAt(symbol));
                        }
                    }
                    System.out.printf("Product group: %s%n", group);
                } else {
                    System.out.printf("Product group: %s%n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
