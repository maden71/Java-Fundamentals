package Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(", ")).filter(x -> isValid(x)).forEach(System.out::println);
    }
    static boolean isValid(String user) {
        return user.length() >= 3 && user.length() <= 16 && user.matches("[a-zA-z_\\-\\d]+");
    }

}
