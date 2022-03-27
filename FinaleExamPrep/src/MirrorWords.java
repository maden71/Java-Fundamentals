import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "([@\\#])((?<firstWord>[A-Za-z]){3,})\\1\\1((?<secondWord>[A-Za-z]){3,})\\1";
        Pattern validWords = Pattern.compile(regex);
        Matcher matcher = validWords.matcher(line);

        while(matcher.find()) {

        }

    }
}
