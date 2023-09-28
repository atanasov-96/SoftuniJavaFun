package BasicSyntaxConditionalStatementsAndLoopsMoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String game = "";
        double spent = 0;
        double money = balance;

        while (true) {
            game = scanner.nextLine();
            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            } else if (game.equals("Game Time")) {
                break;
            }
            switch (game) {
                case "OutFall 4":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (balance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 15.99;
                        spent += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 19.99;
                        spent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (balance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 59.99;
                        spent += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (balance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 29.99;
                        spent += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    if (!game.equals("Game Time")) {
                        System.out.println("Not Found");
                    }
            }
        }
        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f.%n", spent, money - spent);
        }
    }
}
