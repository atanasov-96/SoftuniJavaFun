package Object_And_Classes_Exercise.AdvertisementMessage;


import java.util.Random;

public class MessageGenerator {
    private String[] phrases = {"Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."};

    private String[] events = {"Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"};

    private String[] authors = {"Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"};

    private String[] city = {"Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"};

    private Random random = new Random();
    private String message;

    public MessageGenerator() {
        int randomPhrase = random.nextInt(phrases.length);
        int randomEvent = random.nextInt(events.length);
        int randomAuthor = random.nextInt(authors.length);
        int randomCity = random.nextInt(city.length);
        message = String.format("%s %s %s - %s.\n", phrases[randomPhrase], events[randomEvent], authors[randomAuthor], city[randomCity]);
    }

    public String getMessage() {
        return message;
    }
}
