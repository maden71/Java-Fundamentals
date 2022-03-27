package Lab;

import java.util.Locale;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String words: bannedWords) {
            text = text.replace(words,getStars(words));
        }
        System.out.println(text);
    }
    static String getStars(String word) {
        String stars = "";
        for (int i = 0; i < word.length() ; i++) {
            stars += "*";
        }
        return stars;
    }
}
