import java.io.IOException;

public class UserInterface {

    public static void main(String [] args) throws IOException {


    }

    public static void menu() throws IOException {

        System.out.println("Welcome to Football Stats Analysis");
        ScrapeStats stats= new ScrapeStats();
        stats.runProgram();


    }
}
