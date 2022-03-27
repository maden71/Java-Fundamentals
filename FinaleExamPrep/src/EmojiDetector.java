import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        BigInteger threshold = new BigInteger("1");

        for (char symbol : data.toCharArray()) {
            if(Character.isDigit(symbol)) {
                threshold = threshold.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(symbol))));
            }
        }
        String regex = "([*:])\\1(?<emoji>[A-Z][a-z]{2,}+)\\1\\1";
        Pattern validEmoji = Pattern.compile(regex);
        Matcher matcher = validEmoji.matcher(data);
        List<String> emojis = new ArrayList<>();
        int count = 0;
        while(matcher.find()) {
            count++;
            int sum = 0;
            String emoji = matcher.group("emoji");
            for (char c : emoji.toCharArray()) {
                sum += c;
            }
            //TODO: to check > or >=
            if(sum > Integer.parseInt(threshold.toString())){
                emojis.add(matcher.group());
            }
        }
        System.out.println("Cool threshold: " + threshold);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        emojis.forEach(System.out::println);

    }
}
