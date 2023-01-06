import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.time.*;

//import org.apache.poi.ss.usermodel.*;

import java.io.IOException;

public class ScrapeStats {

    //TODO: Add TD:INT ratio, add fantasy point calculations --> rushing + passing and stacked bar chart
public static int seasonYear=0;
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

//        for (Player p : qbList) {
//
//            // System.out.println(p.getName() + " ");
//            p.printQBAttributes();
//
//        }
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


    public static ArrayList<Player> createRunningBackList(Elements body) {
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
//        for (Player p : rbList) {
//
//            // System.out.println(p.getName() + " ");
//            p.printRunningBackAttributes();
//
//        }
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

    public static ArrayList<Player> createWideReceiverList(Elements body) {
        int playerIteration = 0;
        ArrayList<Player> wrList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readWRStats = e.select("td.center").text();
            Double[] wrStats = extractReceiverData(readWRStats);

            Player temp = new Player(playerName);
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

//        for (Player p : wrList) {
//
//            // System.out.println(p.getName() + " ");
//            p.printReceiverAttributes();
//
//        }

        return wrList;


    }

    public static Double[] extractReceiverData(String dataLine) {
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

    public static ArrayList<Player> createTightEndList(Elements body) {
        ArrayList<Player> teList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readTEStats = e.select("td.center").text();
            Double[] teStats = extractReceiverData(readTEStats);

            Player temp = new Player(playerName);
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

//        for (Player p : teList) {
//
//            // System.out.println(p.getName() + " ");
//            p.printReceiverAttributes();
//
//        }

        return teList;


    }

    public static ArrayList<Player> createKickerList(Elements body) {
        ArrayList<Player> kickerList = new ArrayList<>();

        for (Element e : body.select("tr")) {
            String playerName = e.select("td.player-label a").text();
            String readKickerStats = e.select("td.center").text();
            Double[] kickerStats = extractKickerData(readKickerStats);

            Player temp = new Player(playerName);
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


//        for (Player p : kickerList) {
//
//            // System.out.println(p.getName() + " ");
//            p.printKickerAttributes();
//        }
        return kickerList;

    }

    public static Double[] extractKickerData(String dataLine) {
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

    public static String urlGetter(int seasonYear, String position) {
        //part of UI
        String url;

        url = "https://www.fantasypros.com/nfl/stats/" + position + ".php?year=" + seasonYear;

        return url;


    }

    public void runProgram() throws IOException {

        String url;
        Elements b;
        int option = 0;
        ArrayList<Player> qbList;
        ArrayList<Player> rbList;
        ArrayList<Player> wrList;
        ArrayList<Player> teList;
        ArrayList<Player> kList;


        Scanner s = new Scanner(System.in);
        System.out.println("For which season do you want player data? \n      " +
                "*Must be AFTER 2001");

        seasonYear = s.nextInt();

        Year y= Year.now();
        int currentActualYear=y.getValue();

        while(seasonYear<2002 || seasonYear>=currentActualYear){

            System.out.println("Invalid Year Was Entered. Please Try Again");
            System.out.println("For which season do you want player data? \n      " +
                    "*MUST be AFTER 2001*");

            seasonYear = s.nextInt();

        }


        System.out.println("For which position do you want player data?");
        System.out.println("Type QB, RB, WR, TE, K, or ALL");
        String position = s.next();
        position = position.toLowerCase();

        while (!position.equals("qb") && !position.equals("rb") && !position.equals("wr") && !position.equals("te")
                && !position.equals("k") && !position.equals("all")) {

            System.out.println("Please enter a valid option.");

            System.out.println("For which position do you want player data?");
            System.out.println("Type QB, RB, WR, TE, K, or ALL");

            position = s.next();
            position = position.toLowerCase();

        }


        //url = urlGetter(seasonYear,position);
        //Elements b= getSiteBody(url);//("https://www.fantasypros.com/nfl/stats/qb.php");
        // Elements b= getSiteBody("https://www.fantasypros.com/nfl/stats/k.php");

        switch (position) {

            case "qb":
                url = urlGetter(seasonYear, position);
                b = getSiteBody(url);
                qbList = createQBList(b);
                option = 1;
                ExportExcelSheet(option, qbList);

                break;
            case "rb":
                url = urlGetter(seasonYear, position);
                b = getSiteBody(url);
                rbList = createRunningBackList(b);
                option = 2;
                ExportExcelSheet(option, rbList);
                break;
            case "wr":
                url = urlGetter(seasonYear, position);
                b = getSiteBody(url);
                wrList = createWideReceiverList(b);
                option = 3;
                ExportExcelSheet(option, wrList);
                break;

            case "te":
                url = urlGetter(seasonYear, position);
                b = getSiteBody(url);
                teList = createTightEndList(b);
                option = 4;
                ExportExcelSheet(option, teList);
                break;

            case "k":
                url = urlGetter(seasonYear, position);
                b = getSiteBody(url);
                kList = createKickerList(b);
                option = 5;
                ExportExcelSheet(option, kList);
                break;
            case "all":

                System.out.println("Generating Quarterback Data for " + seasonYear + " season...DONE");
                url = urlGetter(seasonYear, "qb");
                b = getSiteBody(url);
                qbList = createQBList(b);

                System.out.println("Generating Running back Data for " + seasonYear + " season...DONE");
                url = urlGetter(seasonYear, "rb");
                b = getSiteBody(url);
                rbList = createRunningBackList(b);

                System.out.println("Generating Wide Receiver Data for " + seasonYear + " season...DONE");
                url = urlGetter(seasonYear, "wr");
                b = getSiteBody(url);
                wrList = createWideReceiverList(b);

                System.out.println("Generating Tight End Data for " + seasonYear + " season...DONE");
                url = urlGetter(seasonYear, "te");
                b = getSiteBody(url);
                teList = createTightEndList(b);

                System.out.println("Generating Kicker Data for " + seasonYear + " season...DONE");
                url = urlGetter(seasonYear, "k");
                b = getSiteBody(url);
                kList = createKickerList(b);

                option = 6;

                ExportAllSheets(qbList,rbList,wrList,teList,kList);

                break;
        }


    }

    public static void ExportExcelSheet(int option, ArrayList<Player> list) throws IOException {
        // workbook object
        XSSFWorkbook workbook = new XSSFWorkbook();
        String fileName="";

        if (option == 1) {
            makeQBSheet(list, workbook);
            fileName="QB_Data_"+ seasonYear+"_NFL"+"_Season";

        } else if (option == 2) {
            makeRBSheet(list, workbook);
            fileName="RB_Data_" + seasonYear +"_NFL" +"_Season";
        } else if (option == 3 || option == 4) {

            makeReceiverSheet(option, list, workbook);

            if(option==3){
                fileName="WR_Data_" + seasonYear+ "_NFL" +"_Season";
            }
            else{
                fileName="TE_Data_" + seasonYear +"_NFL" + "_Season";
            }

        } else if (option == 5) {

            makeKickerSheet(list, workbook);
            fileName="K_Data_"+ seasonYear +"_NFL" +"_Season";
        }


        // writing the data into the sheets...
       // System.out.println("Would you like a custom name for your excel file or an auto-generated name?");
       // System.out.println("Enter 1 to Enter a Custom Name");
      //  System.out.println("Enter 2 for an auto-generated name");

      //  Scanner nameOptionScanner=new Scanner(System.in);
     //   String numOption=nameOptionScanner.next();

     //   if(numOption.equals("1")) {
          //  System.out.println("What is the name of the file you would like to create to store the data in?");
          //  System.out.println("NOTE: If this filename already exists the data will be overridden.");

          //  Scanner scanExcelLoc = new Scanner(System.in);

          //  fileName = scanExcelLoc.next();
       // }

        FileOutputStream out = new FileOutputStream(
                new File("/Users/maseelshah/Downloads/" + fileName + ".xlsx"));

        workbook.write(out);
        out.close();
    }

    private static void makeKickerSheet(ArrayList<Player> list, XSSFWorkbook workbook) {
        int rowid;
        XSSFSheet kickerSpreadsheet = workbook.createSheet("Kicker_Data");

        rowid = 0;
        XSSFRow kRow = kickerSpreadsheet.createRow(rowid++);

        int countKHeaderCell = 0;

        Cell kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Name");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Field Goals Made");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Field Goal Attempts");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Field Goal Percent");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Longest Kick");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Kicks Under 20 Yards");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Kicks Under 30 Yards");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Kicks Under 40 Yards");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Kicks Under 50 Yards");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Kicks Above 50 Yards");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Extra Points Made");

        kCell = kRow.createCell(countKHeaderCell++);
        kCell.setCellValue("Extra Point Attempts");

        for (Player p : list) {

            kRow = kickerSpreadsheet.createRow(rowid++);

            int cellid = 0;

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getName());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getFieldGoalsMade());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getFgAttempts());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getFgPercent());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getLongestKickMade());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getUnder20Kicks());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getUnder30Kicks());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getUnder40Kicks());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getUnder50Kicks());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getOver50Kicks());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getExtraPointsMade());

            kCell = kRow.createCell(cellid++);
            kCell.setCellValue(p.getPatAttempts());


        }
    }

    private static void makeReceiverSheet(int option, ArrayList<Player> list, XSSFWorkbook workbook) {
        int rowid;

        XSSFSheet wrSpreadsheet = workbook.createSheet();

        if (option == 3) {
            workbook.setSheetName(0, "Wide_Receiver_Data");

        } else if (option == 4) {
            workbook.setSheetName(0, "Tight_End_Data");
        }

        rowid = 0;
        XSSFRow wrRow = wrSpreadsheet.createRow(rowid++);

        int countWRHeaderCell = 0;

        Cell wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Name");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Receptions");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Targets");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Receiving Yards");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Yards/Reception");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Longest Reception");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("20+ Yard Receptions");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Receiving Touchdowns");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Rushing Attempts");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Rushing Yards");

        wrcell = wrRow.createCell(countWRHeaderCell++);
        wrcell.setCellValue("Rushing Touchdowns");


        for (Player p : list) {

            wrRow = wrSpreadsheet.createRow(rowid++);

            int cellid = 0;

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getName());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getReceptions());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getTargets());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRecYards());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRecYardsPerCatch());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getLongestReception());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getTwentyPlusReceptions());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRecTouchdowns());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRushAttempts());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRushYards());

            wrcell = wrRow.createCell(cellid++);
            wrcell.setCellValue(p.getRushingTouchdowns());

        }
    }

    public static void makeQBSheet(ArrayList<Player> list, XSSFWorkbook workbook) {

        int rowid;

        //quarterback sheet

        XSSFSheet qbSpreadsheet = workbook.createSheet("Quarterback_Data");

        rowid = 0;
        XSSFRow qbRow = qbSpreadsheet.createRow(rowid++);

        Cell qbcell = qbRow.createCell(0);
        // qbcell.setCellValue("Quarterback Data");

        int countQBHeaderCell = 0;

        // qbRow= qbSpreadsheet.createRow(rowid++);

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Name");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Completions");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Attempts");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Completion Percent");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Passing Yards");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Yards/Attempt");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Touchdown Passes");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Interceptions");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Sacks");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Rushing Attempts");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Rushing Yards");

        qbcell = qbRow.createCell(countQBHeaderCell++);
        qbcell.setCellValue("Rushing Touchdowns");

        for (Player p : list) {

            qbRow = qbSpreadsheet.createRow(rowid++);

            int cellid = 0;

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getName());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getCompletions());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getPassAttempts());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getCompletionPercent());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getPassingYards());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getPassYardsPerAttempt());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getTouchdownPasses());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getInterceptions());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getSacks());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getRushAttempts());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getRushYards());

            qbcell = qbRow.createCell(cellid++);
            qbcell.setCellValue(p.getRushingTouchdowns());


        }

    }

    public static void makeRBSheet(ArrayList<Player> list, XSSFWorkbook workbook) {
        int rowid;

        XSSFSheet rbSpreadsheet = workbook.createSheet("Running_Back_Data");

        rowid = 0;
        XSSFRow rbRow = rbSpreadsheet.createRow(rowid++);

        Cell rbcell = rbRow.createCell(0);
        //rbcell.setCellValue("Running Back Data");

        int countRBHeaderCell = 0;

        // rbRow= rbSpreadsheet.createRow(rowid++);

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Name");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Attempts");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Rushing Yards");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Yards Per Attempt");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Longest Run");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("20+ Runs");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Rushing Touchdowns");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Receptions");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Targets");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Receiving Yards");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Yards/Reception");

        rbcell = rbRow.createCell(countRBHeaderCell++);
        rbcell.setCellValue("Receiving Touchdowns");


        for (Player p : list) {

            rbRow = rbSpreadsheet.createRow(rowid++);

            int cellid = 0;

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getName());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRushAttempts());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRushYards());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRushYardsPerAttempt());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getLongestRush());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getTwentyPlusRushes());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRushingTouchdowns());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getReceptions());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getTargets());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRecYards());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRecYardsPerCatch());

            rbcell = rbRow.createCell(cellid++);
            rbcell.setCellValue(p.getRecTouchdowns());

        }

    }



    public static void ExportAllSheets(ArrayList<Player> qbList, ArrayList<Player> rbList, ArrayList<Player> wrList,
                                       ArrayList<Player> teList, ArrayList<Player> kList) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        makeQBSheet(qbList,workbook);
        makeRBSheet(rbList,workbook);
        makeReceiverSheet(3,wrList,workbook);
        makeReceiverSheet(4,teList,workbook);
        makeKickerSheet(kList,workbook);
        workbook.setSheetName(0, "Quarterback_Data");
        workbook.setSheetName(2, "Wide_Receiver_Data");
        workbook.setSheetName(3, "Tight_End_Data");


        //System.out.println("What is the name of the file you would like to create to store the data in?");
        //System.out.println("NOTE: If this filename already exists the data will be overridden.");

       // Scanner scanExcelLoc = new Scanner(System.in);

       // String fileName = scanExcelLoc.next();

        String fileName="All_Data_"+ seasonYear +"_NFL"+"_Season";


        FileOutputStream out = new FileOutputStream(
                new File("/Users/maseelshah/Downloads/" + fileName + ".xlsx"));
        //   /maseelshah/Downloads/

        workbook.write(out);
        out.close();

    }

    public static void main(String[] args) throws IOException {
      //  Year y= Year.now();

        //System.out.println(y.getValue());

    }
}
