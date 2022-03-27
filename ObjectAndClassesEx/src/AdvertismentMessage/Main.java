package AdvertismentMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Messages messages = new Messages();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            int phraseIndex = random.nextInt(messages.getPhrasesLength());
            int eventIndex = random.nextInt(messages.getEventsLength());
            int authorIndex = random.nextInt(messages.getAuthorsLength());
            int cityIndex = random.nextInt(messages.getCitiesLength());

            System.out.printf("%s %s %s - %s%n",messages.getPhrase(phraseIndex), messages.getEvent(eventIndex), messages.getAuthor(authorIndex),messages.getCity(cityIndex));

        }


    }
}
