import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "([|#])(?<itemName>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})\\1(?<calorieValue>[0-9]{1,4})\\1";
        Pattern validProduct = Pattern.compile(regex);
        Matcher matcher = validProduct.matcher(line);
        int calories = 0;
        while(matcher.find()) {
            calories += Integer.parseInt(matcher.group("calorieValue"));
        }
        System.out.printf("You have food to last you for: %d days!%n",calories / 2000);
        matcher.reset();
        while(matcher.find()) {
            String itemName = matcher.group("itemName");
            String date = matcher.group("date");
            String calorie = matcher.group("calorieValue");

            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",itemName,date,calorie);
        }


    }

}
