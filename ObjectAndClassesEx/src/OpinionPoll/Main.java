package OpinionPoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            People people = new People(scanner.nextLine().split(" "));
            if(people.getAge() > 30) {
                System.out.printf("%s - %d%n",people.getName(),people.getAge());
            }
        }

    }
}
