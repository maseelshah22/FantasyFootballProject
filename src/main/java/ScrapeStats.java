import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class ScrapeStats {

    public static ArrayList<Player> playerList;//= new ArrayList<>();
    public static void scrapeQBNames() throws IOException {

        playerList= new ArrayList<>();

        String urlQBStats = "https://www.fantasypros.com/nfl/stats/qb.php";

        Document doc = Jsoup.connect(urlQBStats).timeout(6000).get();

        Elements body = doc.select("tbody");
        int num = body.select("tr").size();
        System.out.println(num);

        for (Element e : body.select("tr")) {


        }
    }

    public static void main(String[] args) throws IOException {

        scrapeQBNames();
        int i=1;
//        for(Player p: playerList){
//            System.out.println(i+" player is: "+ p.getName());
//            i++;
//        }


        //movie parser
/*
            String urlMovie="https://www.imdb.com/chart/top";

            Document doc = Jsoup.connect(urlMovie).timeout(6000).get();

            Elements body = doc.select("tbody.lister-list");
            int num = body.select("tr").size();
            System.out.println(num);

            for(Element e: body.select("tr")){

                String name = e.select("td.titlecolumn a").text();
                System.out.println(name);

            } */

    }
}
