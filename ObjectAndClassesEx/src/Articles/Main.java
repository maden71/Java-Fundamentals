package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        Article article = new Article(data[0],data[1],data[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            switch (input[0]) {
                case "Edit":
                    String editToken = input[1];
                    article.edit(editToken);
                    break;
                case "ChangeAuthor":
                    String authorToken = input[1];
                    article.changeAuthor(authorToken);
                    break;
                case "Rename":
                    String renameToken = input[1];
                    article.rename(renameToken);
                    break;
            }
        }
        System.out.printf("%s - %s: %s",article.getTitle(), article.getContent(), article.getAuthor());
    }
}
