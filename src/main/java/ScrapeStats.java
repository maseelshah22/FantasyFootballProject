import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Scanner;

public class ScrapeStats {

    public static Elements getSiteBody(String url) throws IOException {

        String urlQBStats = url;
        Document doc = Jsoup.connect(urlQBStats).timeout(6000).get();
        Elements body = doc.select("tbody");

        return body;
    }

    public static ArrayList<Player> createQBList(Elements body) {
        //create QB player and will add him to list
        int playerIteration = 0;
        ArrayList<Player> qbList = new ArrayList<>();
        for (Element e : body.select("tr")) {

            String playerName = e.select("td.player-label a").text();
            String readQBStats = e.select("td.center").text();
            Double[] qbStats = extractQBData(readQBStats);

            qbList.add(new Player(playerName));

            qbList.get(playerIteration).setPosition("QB");
            qbList.get(playerIteration).setCompletions(qbStats[0]);
            qbList.get(playerIteration).setPassAttempts(qbStats[1]);
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

        for (Player p : qbList) {

           // System.out.println(p.getName() + " ");
            p.printQBAttributes();

        }
        return qbList;
    }


    public static Double[] extractQBData(String dataLine) {

        String[] dataSep = dataLine.split(" ");
        Double[] cleanData = new Double[11];

        for (int i = 0; i < 11; i++) {
            String tempNum = dataSep[i];
            String newNum = tempNum;
            if (tempNum.contains(",")) {
                newNum = tempNum.substring(0, tempNum.indexOf(',')) + tempNum.substring(tempNum.indexOf(',') + 1);
            }
            cleanData[i] = Double.parseDouble(newNum);
            //System.out.print(cleanData[i]+" ");
        }

        //  System.out.println("");

        return cleanData;
    }



    public static ArrayList<Player> createRunningBackList(Elements body){
        int playerIteration = 0;
        ArrayList<Player> rbList = new ArrayList<>();

        for (Element e : body.select("tr")) {

            String playerName = e.select("td.player-label a").text();
            String readRBStats = e.select("td.center").text();
            Double[] rbStats = extractRunningBackData(readRBStats);

            rbList.add(new Player(playerName));
            rbList.get(playerIteration).setPosition("RB");

            rbList.get(playerIteration).setRushAttempts(rbStats[0]);
            rbList.get(playerIteration).setRushYards(rbStats[1]);
            rbList.get(playerIteration).setRushYardsPerAttempt(rbStats[2]);
            rbList.get(playerIteration).setLongestRush(rbStats[3]);
            rbList.get(playerIteration).setTwentyPlusRushes(rbStats[4]);
            rbList.get(playerIteration).setRushingTouchdowns(rbStats[5]);
            rbList.get(playerIteration).setReceptions(rbStats[6]);
            rbList.get(playerIteration).setTargets(rbStats[7]);
            rbList.get(playerIteration).setRecYards(rbStats[8]);
            rbList.get(playerIteration).setRecYardsPerCatch(rbStats[9]);
            rbList.get(playerIteration).setRecTouchdowns(rbStats[10]);

            playerIteration++;


        }

        //print stats
        for (Player p : rbList) {

            // System.out.println(p.getName() + " ");
            p.printRunningBackAttributes();

        }
        return rbList;


    }


    public static Double[] extractRunningBackData(String dataLine) {

        String[] dataSep = dataLine.split(" ");
        Double[] cleanData = new Double[11];

        for (int i = 0; i < 11; i++) {
            String tempNum = dataSep[i];
            String newNum = tempNum;
            if (tempNum.contains(",")) {
                newNum = tempNum.substring(0, tempNum.indexOf(',')) + tempNum.substring(tempNum.indexOf(',') + 1);
            }
            cleanData[i] = Double.parseDouble(newNum);
            //System.out.print(cleanData[i]+" ");
        }

        //  System.out.println("");

        return cleanData;
    }

    public static ArrayList<Player> createWideReceiverList(Elements body){
        int playerIteration = 0;
        ArrayList<Player> wrList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readWRStats = e.select("td.center").text();
            Double[] wrStats = extractReceiverData(readWRStats);

            Player temp= new Player(playerName);
            //wrList.add(new Player(playerName));
            temp.setPosition("WR");

            temp.setReceptions(wrStats[0]);
            temp.setTargets(wrStats[1]);
            temp.setRecYards(wrStats[2]);
            temp.setRecYardsPerCatch(wrStats[3]);
            temp.setLongestReception(wrStats[4]);
            temp.setTwentyPlusReceptions(wrStats[5]);
            temp.setRecTouchdowns(wrStats[6]);
            temp.setRushAttempts(wrStats[7]);
            temp.setRushYards(wrStats[8]);
            temp.setRushingTouchdowns(wrStats[9]);

            wrList.add(temp);

        }

        for (Player p : wrList) {

            // System.out.println(p.getName() + " ");
            p.printReceiverAttributes();

        }

        return wrList;


    }

    public static Double[] extractReceiverData(String dataLine){
        String[] dataSep = dataLine.split(" ");
        Double[] cleanData = new Double[11];

        for (int i = 0; i < 10; i++) {
            String tempNum = dataSep[i];
            String newNum = tempNum;
            if (tempNum.contains(",")) {
                newNum = tempNum.substring(0, tempNum.indexOf(',')) + tempNum.substring(tempNum.indexOf(',') + 1);
            }
            cleanData[i] = Double.parseDouble(newNum);
            //System.out.print(cleanData[i]+" ");
        }

        //  System.out.println("");

        return cleanData;
    }

    public static ArrayList<Player> createTightEndList(Elements body){
        ArrayList<Player> teList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readTEStats = e.select("td.center").text();
            Double[] teStats = extractReceiverData(readTEStats);

            Player temp= new Player(playerName);
            temp.setPosition("TE");

            temp.setReceptions(teStats[0]);
            temp.setTargets(teStats[1]);
            temp.setRecYards(teStats[2]);
            temp.setRecYardsPerCatch(teStats[3]);
            temp.setLongestReception(teStats[4]);
            temp.setTwentyPlusReceptions(teStats[5]);
            temp.setRecTouchdowns(teStats[6]);
            temp.setRushAttempts(teStats[7]);
            temp.setRushYards(teStats[8]);
            temp.setRushingTouchdowns(teStats[9]);

            teList.add(temp);

        }

        for (Player p : teList) {

            // System.out.println(p.getName() + " ");
            p.printReceiverAttributes();

        }

        return teList;


    }

    public static ArrayList<Player> createKickerList(Elements body){
        ArrayList<Player> kickerList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readKickerStats = e.select("td.center").text();
            Double[] kickerStats = extractKickerData(readKickerStats);

            Player temp= new Player(playerName);
            temp.setPosition("K");

            temp.setFieldGoalsMade(kickerStats[0]);
            temp.setFgAttempts(kickerStats[1]);
            temp.setFgPercent(kickerStats[2]);
            temp.setLongestKickMade(kickerStats[3]);
            temp.setUnder20Kicks(kickerStats[4]);
            temp.setUnder30Kicks(kickerStats[5]);
            temp.setUnder40Kicks(kickerStats[6]);
            temp.setUnder50Kicks(kickerStats[7]);
            temp.setOver50Kicks(kickerStats[8]);
            temp.setExtraPointsMade(kickerStats[9]);
            temp.setPatAttempts(kickerStats[10]);

            kickerList.add(temp);

        }


        for (Player p : kickerList) {

            // System.out.println(p.getName() + " ");
            p.printKickerAttributes();
        }
        return kickerList;

    }
    public static Double[] extractKickerData(String dataLine){
        String[] dataSep = dataLine.split(" ");
        Double[] cleanData = new Double[11];

        for (int i = 0; i < 11; i++) {
            String tempNum = dataSep[i];
            String newNum = tempNum;
            if (tempNum.contains(",")) {
                newNum = tempNum.substring(0, tempNum.indexOf(',')) + tempNum.substring(tempNum.indexOf(',') + 1);
            }
            cleanData[i] = Double.parseDouble(newNum);
            //System.out.print(cleanData[i]+" ");
        }

        //  System.out.println("");

        return cleanData;
    }

    public static String urlGetter(String seasonYear, String position) {
        //part of UI
        String url;

        url = "https://www.fantasypros.com/nfl/stats/" + position + ".php?year=" + seasonYear;

        return url;


    }

    public static void runProgram() throws IOException {

        String url;
        ArrayList<Player> qbList;
        ArrayList<Player> rbList;
        ArrayList<Player> wrList;
        ArrayList<Player> teList;
        ArrayList<Player> kList;


        Scanner s = new Scanner(System.in);
        System.out.println("For which season after 2001 do you want player data?");
        String seasonYear = s.next();

        System.out.println("For which position do you want player data?");
        System.out.println("Type QB, RB, WR, TE, K, or ALL");
        String position = s.next();
        position=position.toLowerCase();


        url = urlGetter(seasonYear,position);
        Elements b= getSiteBody(url);//("https://www.fantasypros.com/nfl/stats/qb.php");
       // Elements b= getSiteBody("https://www.fantasypros.com/nfl/stats/k.php");

        switch (position){

            case "qb":
                url = urlGetter(seasonYear,position);
                b= getSiteBody(url);
                qbList = createQBList(b);
                break;
            case "rb":
                url = urlGetter(seasonYear,position);
                b= getSiteBody(url);
                rbList = createRunningBackList(b);
                break;
            case "wr" :
                url = urlGetter(seasonYear,position);
                b= getSiteBody(url);
                wrList = createWideReceiverList(b);
                break;


            case "te" :
                url = urlGetter(seasonYear,position);
                b= getSiteBody(url);
                teList = createTightEndList(b);
                break;

            case "k":
                url = urlGetter(seasonYear,position);
                b= getSiteBody(url);
                kList = createKickerList(b);
                break;
            case "all":

                System.out.println("Quarterback Data for "+ seasonYear+" season");
                url = urlGetter(seasonYear,"qb");
                b= getSiteBody(url);
                qbList = createQBList(b);

                System.out.println("Running back Data for "+ seasonYear+" season");
                url = urlGetter(seasonYear,"rb");
                b= getSiteBody(url);
                rbList = createRunningBackList(b);

                System.out.println("Wide Receiver Data for "+ seasonYear+" season");
                url = urlGetter(seasonYear,"wr");
                b= getSiteBody(url);
                wrList = createWideReceiverList(b);

                System.out.println("Tight End Data for "+ seasonYear+" season");
                url = urlGetter(seasonYear,"te");
                b= getSiteBody(url);
                teList = createTightEndList(b);

                System.out.println("Kicker Data for "+ seasonYear+" season");
                url = urlGetter(seasonYear,"k");
                b= getSiteBody(url);
                kList = createKickerList(b);
                break;
        }



    }

    public static void main(String[] args) throws IOException {

        runProgram();

    }
}
