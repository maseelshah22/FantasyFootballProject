# Football Data Scraper 🏈

## Author ✍️
* Maseel Shah

## Overview 📊
Welcome to the Football Data Scraper Repository! This initiative was created to help football fans identify top fantasy football draft picks through the power of analytics! 
* Users can conveniently choose a particular season and player positions for data retrieval, with the added feature of calculating fantasy football performance metrics
* Then, all the data is exported to an Excel sheet, conveniently saved in the user's downloads folder for in-depth analysis
* This data can be a valuable resource for users seeking to make informed decisions when selecting players for their fantasy football teams for the upcoming season!
* Works for both Mac and Windows operating systems
* *Important Note*: Current season's data is not available until *after* the New Year
  - Example: 2023-24 season data is not available until January 1st, 2024

## Design 🎨
This project is a command line interface program written in Java using object oriented programming principles. 
There are 3 key classes that represent the core functionality of the program:
* `UserInterface` : This class is responsible for initializing the program and User Interface after being called on by the `main` class
* `ScrapeStats` : Responsible for parsing the online data source, calculating stats, and writing to and exporting the Excel file
* `Player` : Object class integral for managing data storage for each player

## Your Turn! 🙋‍♂️
* Take the opportunity to use this program to get an edge on your friends this upcoming Fantasy Football Season!

### Setting up the program ⌨️
  1.  Make sure you have java installed
  2. Download and open this repository on your computer
  3. Open your terminal and navigate to this project folder
  4. Next build the `jar` file by typing the following command in your terminal: `./gradlew build`
     - Note that if you are using a Mac and get an error, try running `chmod +x gradlew` before step 3
  5. The `jar` file is now in the `build/libs` directory in your project folder. You can now move the program to any location on your computer

### Running the program 👨‍💻
1. Open your terminal and navigate to the folder where the `jar` file is located.
2. Run the following command and follow the instructions on the screen:
   - `java -jar FantasyDB.jar`
3. Enjoy your data analysis!

<div align=center>
<img width="500" alt="Screenshot 2024-05-08 at 11 56 53 PM" src="https://github.com/maseelshah22/FantasyFootballProject/assets/98069253/c80c9027-111b-4786-99ec-d29dd4b49c49">
<img width="500" alt="Screenshot 2024-05-08 at 11 57 46 PM" src="https://github.com/maseelshah22/FantasyFootballProject/assets/98069253/fc670eeb-7ad0-45ba-8320-4d935d5adfda">
</div>



## Licensing:
General Public License - This is a copyleft license, which mandates that any derivative work based on the original work be published with the same copyleft license. The GPL specifically enforces that any project/derivative work that uses a GPL-licensed work must publish the entire source code of the derivative project. If our program is used in your team's development process, please be sure to cite our project properly.

