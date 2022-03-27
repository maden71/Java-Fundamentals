package Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String word = "";
        while (!line.equals("end")) {
            for (int i = line.length() - 1; i >= 0; i--) {
                char c = line.charAt(i);
                word += c;
            }
            System.out.printf("%s = %s%n", line, word);
            word = "";
            line = scanner.nextLine();
        }

    }
}


