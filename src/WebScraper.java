import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("http://example.com").get();
            Elements links = document.select("a[href]");

            for (Element link : links) {
                System.out.println("Link: " + link.attr("href"));
                System.out.println("Title: " + link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}