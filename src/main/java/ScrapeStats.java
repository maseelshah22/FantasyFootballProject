import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class ScrapeStats {

    public static ArrayList<Player> qbList= new ArrayList<>();
    public static Elements getSiteBody(String url) throws IOException {

        String urlQBStats = url;
        Document doc = Jsoup.connect(urlQBStats).timeout(6000).get();
        Elements body = doc.select("tbody");

        return body;
    }

    public static void createQB(Elements body){
    //create QB player and will add him to list
        int playerIteration=0;
        for (Element e : body.select("tr")) {

            String playerName = e.select("td.player-label a").text();
            //System.out.println(playerName);
            String readQBStats= e.select("td.center").text();
            Double [] qbStats= extractQBData(readQBStats);

            qbList.add(new Player(playerName));

            qbList.get(playerIteration).setCompletions(qbStats[0]);
            qbList.get(playerIteration).setAttempts(qbStats[1]);
            qbList.get(playerIteration).setCompletionPercent(qbStats[2]);
            qbList.get(playerIteration).setPassingYards(qbStats[3]);
            qbList.get(playerIteration).setPassYardsPerAttempt(qbStats[4]);
            qbList.get(playerIteration).setTouchdownPasses(qbStats[5]);
            qbList.get(playerIteration).setInterceptions(qbStats[6]);
            qbList.get(playerIteration).setSacks(qbStats[7]);
            qbList.get(playerIteration).setRushAttempts(qbStats[8]);
            qbList.get(playerIteration).setRushYards(qbStats[9]);
            qbList.get(playerIteration).setRushingTouchdowns(qbStats[10]);

            playerIteration++;

        }

        for (Player p: qbList){

            System.out.print(p.getName()+ " ");
            System.out.println(p.getTouchdownPasses());

        }
    }



    public static Double[] extractQBData(String dataLine){

        String [] dataSep= dataLine.split(" ");
        Double [] cleanData= new Double[11];

        for(int i=0;i<11;i++){
            String tempNum=dataSep[i];
            String newNum=tempNum;
            if(tempNum.contains(",")){
                newNum= tempNum.substring(0,tempNum.indexOf(',')) + tempNum.substring(tempNum.indexOf(',')+1);
            }
            cleanData[i]=Double.parseDouble(newNum);
            //System.out.print(cleanData[i]+" ");
        }

      //  System.out.println("");

        return cleanData;
    }

    public static void main(String[] args) throws IOException {

       Elements b= getSiteBody("https://www.fantasypros.com/nfl/stats/qb.php");
       createQB(b);
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
