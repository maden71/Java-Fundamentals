package Exersice;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (String item : data) {
            char firstChar = item.charAt(0);
            char lastChar = item.charAt(item.length() - 1);
            double num = Double.parseDouble(item.substring(1, item.length() - 1));
            if (firstChar <= 90 && firstChar >= 65) {
                num /= Character.toLowerCase(firstChar) - 96;
            } else {
                num *= Character.toLowerCase(firstChar) - 96;
            }
            if (lastChar >= 65 && lastChar <= 90) {
                num -= Character.toLowerCase(lastChar) - 96;
            } else {
                num += Character.toLowerCase(lastChar) - 96;
            }
            sum += num;
        }
        System.out.printf("%.2f",sum);

    }
}