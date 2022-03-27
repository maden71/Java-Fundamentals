package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d+.?\\d]+)!(?<quantity>[0-9]+)";
        Pattern validFurniture = Pattern.compile(regex);
        String data = scanner.nextLine();
        double sum = 0;
        List<String> furnitures = new ArrayList<>();
        while(!data.equals("Purchase")) {
            Matcher matcher = validFurniture.matcher(data);
            while(matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitures.add(furniture);
                sum += price * quantity;
            }
            data = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",sum);
    }
}
