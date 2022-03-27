package Exersice;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            char symbol = (char)(c + 3);
            System.out.print(symbol);
        }
    }
}
