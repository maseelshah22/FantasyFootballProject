import java.io.IOException;

public class UserInterface {

    public static void main(String [] args) throws IOException {

       // menu();
    }

    public void runProgram() throws IOException {
        menu();
    }
    public static void menu() throws IOException {


        System.out.println("\nWelcome to Football Stats Analysis");

        System.out.println("by Maseel Shah\n");

        System.out.println("This program will scrape football stats from the internet " +
                "of the season and position of\nyour choosing and export the data in an excel file " +
                "for your analysis.\n");

        System.out.println("Along with season stats, this program can give you analytical data for each players' PPR Fantasy Football Peformance.");
        System.out.println("This data can be used to compare players and make decisions regarding PPR Fantasy Football\n");

        System.out.println("---------------------------------------------------\n");

        ScrapeStats stats= new ScrapeStats();
        stats.runProgram();


    }
}
