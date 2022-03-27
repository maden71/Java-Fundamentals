package Lab;

import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String digits = "";
        String letters = "";
        String symbols = "";

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(Character.isDigit(c)) {
                digits += c;
            }else if (Character.isAlphabetic(c)) {
                letters += c;
            }else {
                symbols += c;
            }
        }
        System.out.printf("%s%n%s%n%s",digits,letters,symbols);
    }
}
