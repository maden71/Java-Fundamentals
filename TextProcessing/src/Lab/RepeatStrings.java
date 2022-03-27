package Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        for (String item : data) {
            System.out.print(item.repeat(item.length()));
        }
    }

}