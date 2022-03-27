package Article2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            Articles input = new Articles(scanner.nextLine().split(", "));

            System.out.printf("%s - %s: %s%n",input.getTitle(), input.getContent(), input.getAuthor());

        }
        String input2 = scanner.nextLine();
    }
}
