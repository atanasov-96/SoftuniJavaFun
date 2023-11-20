package Object_And_Classes_Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleData = scanner.nextLine().split(", ");

        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");

            String command = input[0];
            String parameter = input[1];

            switch (command) {
                case "Edit":
                    article.edit(parameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(parameter);
                    break;
                case "Rename":
                    article.rename(parameter);
                    break;
            }

        }
        System.out.printf("%s - %s: %s",article.getTitle(), article.getContent(), article.getAuthor());
    }
}
