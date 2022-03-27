package Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String secondWord = scanner.nextLine();

        while (secondWord.contains(word)) {
            secondWord = secondWord.replaceAll(word, "");
        }
        System.out.println(secondWord);
    }
}
