package BasicSyntax;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        StringBuilder password = new StringBuilder(userName);
        password = password.reverse();
        String pass = scanner.nextLine();

        int banCounter = 0;

        while (!pass.contentEquals(password)) {
            if (banCounter == 3) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            banCounter++;
            pass = scanner.nextLine();

        }
        if (pass.contentEquals(password)){
            System.out.printf("User %s logged in.", userName);
        }
    }

}
