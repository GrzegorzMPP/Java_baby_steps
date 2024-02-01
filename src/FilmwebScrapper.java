import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class FilmwebScraper {
    public static void main(String[] args) {
        try {
            String url = "https://www.filmweb.pl/person/Nicolas+Cage-15";
            Document document = Jsoup.connect(url).get();

            // Znajdź elementy zawierające informacje o filmach
            Elements filmy = document.select(".filmsList__item");

            // Iteruj przez znalezione filmy i wyświetl informacje
            for (Element film : filmy) {
                String tytul = film.select(".filmPreview__title").text();
                String rok = film.select(".filmPreview__year").text();

                System.out.println("Tytuł: " + tytul);
                System.out.println("Rok: " + rok);
                System.out.println("----------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
