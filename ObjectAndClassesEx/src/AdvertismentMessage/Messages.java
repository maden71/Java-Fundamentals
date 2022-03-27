package AdvertismentMessage;

import java.security.PublicKey;

public class Messages {
    String[] phrases = {"Excellent product.", "Such a great product.",
            "I always use that product.", "Best product of its category.",
            "Exceptional product.", "I can’t live without this product."};

    String[] events = {"Now I feel good.", "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"};

    String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

    String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public int getPhrasesLength(){
        return this.phrases.length;
    }
    public int getEventsLength(){
        return this.events.length;
    }
    public int getAuthorsLength(){
        return this.authors.length;
    }
    public int getCitiesLength(){
        return this.cities.length;
    }
    public String getPhrase(int x){
        return this.phrases[x];
    }
    public String getEvent(int x){
        return this.events[x];
    }
    public String getAuthor(int x){
        return this.authors[x];
    }
    public String getCity(int x){
        return this.cities[x];
    }
}

