package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = Integer.parseInt(sc.nextLine());
        List<String> phrases = List.of("Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> events = List.of("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authors = List.of("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> cities = List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

        for (int i = 0; i < n; i++) {
            int phrasesRnd = rnd.nextInt(phrases.size());
            int eventsRnd = rnd.nextInt(events.size());
            int authorsRnd = rnd.nextInt(authors.size());
            int citiesRnd = rnd.nextInt(cities.size());
            System.out.printf("%s %s %s - %s%n", phrases.get(phrasesRnd), events.get(eventsRnd),
                    authors.get(authorsRnd), cities.get(citiesRnd));
        }
    }
}
