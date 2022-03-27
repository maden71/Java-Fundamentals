package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> phoneNumbers = new ArrayList<>();
        Pattern validNumber = Pattern.compile("\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b");
        Matcher matcher = validNumber.matcher(line);
        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", phoneNumbers));
    }
}
