public class Player {

    String name;

    String position; // QB, WR, TE, RB --> abbreviations only

    public double completions;
    public double passAttempts;
    public double completionPercent;
    public double passingYards;
    public double passYardsPerAttempt;
    public double touchdownPasses;
    public double interceptions;
    public double sacks;
    public double rushAttempts;
    public  double rushYards;
    public double rushingTouchdowns;

    public double longestRush;

    public double rushYardsPerAttempt;
    public double twentyPlusRushes;

    public  double receptions;
    public double targets;
    public double recYards;
    public double recYardsPerCatch;
    public double recTouchdowns;

    public double longestReception;
    public double twentyPlusReceptions;
    public double fieldGoalsMade;
    public  double fgAttempts;
    public double fgPercent;
    public double longestKickMade;
    public double under20Kicks;
    public double under30Kicks;
    public double under40Kicks;
    public double under50Kicks;
    public double over50Kicks;
    public double extraPointsMade;
    public double patAttempts;

    public double gamesPlayed;
    public double totalFantasyPoints;
    public double totalPassingPointsFantasy;
    public double passingYardPointsFantasy;
    public double passingTouchdownPointsFantasy;
    public double pointsLostFromFumblesFantasy;
    public double pointsLostFromINTSFantasy;
    public double totalTurnoverPointsLostFantasy;
    public double rushingYardPointsFantasy;

    double rushTDPointFantasy;
    public double totalReceivingPointsFantasy;
    public double receptionPointsFantasy;
    public double receivingYardsPointsFantasy;

    public double fantasyPointsPerGame;
    public double tdIntRatio;
    public double fumblesLost;
    public double receivingTDFantasyPoints;

    public double shortFGFantasyPoints;
    public double fantasy40yardFgPoints;
    public double fantasy50yardFgPoints;
    public double extraPointFantasy;
    public double missedFgFantasyPoints;


    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getCompletions() {
        return completions;
    }

    public void setCompletions(double completions) {
        this.completions = completions;
    }

    public double getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(double passAttempts) {
        this.passAttempts = passAttempts;
    }

    public double getCompletionPercent() {
        return completionPercent;
    }

    public void setCompletionPercent(double completionPercent) {
        this.completionPercent = completionPercent;
    }

    public double getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(double passingYards) {
        this.passingYards = passingYards;
    }

    public double getPassYardsPerAttempt() {
        return passYardsPerAttempt;
    }

    public void setPassYardsPerAttempt(double passYardsPerAttempt) {
        this.passYardsPerAttempt = passYardsPerAttempt;
    }

    public double getTouchdownPasses() {
        return touchdownPasses;
    }

    public void setTouchdownPasses(double touchdownPasses) {
        this.touchdownPasses = touchdownPasses;
    }

    public double getInterceptions() {
        return this.interceptions;
    }

    public void setInterceptions(double ints) {
        this.interceptions = ints;
    }

    public double getSacks() {
        return sacks;
    }

    public void setSacks(double sacks) {
        this.sacks = sacks;
    }

    public double getRushAttempts() {
        return rushAttempts;
    }

    public void setRushAttempts(double rushAttempts) {
        this.rushAttempts = rushAttempts;
    }

    public double getRushYards() {
        return rushYards;
    }

    public void setRushYards(double rushYards) {
        this.rushYards = rushYards;
    }

    public double getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public void setRushingTouchdowns(double rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns;
    }

    public double getRushYardsPerAttempt() {
        return rushYardsPerAttempt;
    }

    public void setRushYardsPerAttempt(double rushYardsPerAttempt) {
        this.rushYardsPerAttempt = rushYardsPerAttempt;
    }

    public double getLongestRush() {
        return longestRush;
    }

    public void setLongestRush(double longestRush) {
        this.longestRush = longestRush;
    }

    public double getTwentyPlusRushes() {
        return twentyPlusRushes;
    }

    public void setTwentyPlusRushes(double twentyPlusRushes) {
        this.twentyPlusRushes = twentyPlusRushes;
    }

    public double getReceptions() {
        return receptions;
    }

    public void setReceptions(double receptions) {
        this.receptions = receptions;
    }

    public double getTargets() {
        return targets;
    }

    public void setTargets(double targets) {
        this.targets = targets;
    }

    public double getRecYards() {
        return recYards;
    }

    public void setRecYards(double recYards) {
        this.recYards = recYards;
    }

    public double getRecYardsPerCatch() {
        return recYardsPerCatch;
    }

    public void setRecYardsPerCatch(double recYardsPerCatch) {
        this.recYardsPerCatch = recYardsPerCatch;
    }

    public double getRecTouchdowns() {
        return recTouchdowns;
    }

    public void setRecTouchdowns(double recTouchdowns) {
        this.recTouchdowns = recTouchdowns;
    }

    public double getLongestReception() {
        return longestReception;
    }

    public void setLongestReception(double longestReception) {
        this.longestReception = longestReception;
    }

    public double getTwentyPlusReceptions() {
        return twentyPlusReceptions;
    }

    public void setTwentyPlusReceptions(double twentyPlusReceptions) {
        this.twentyPlusReceptions = twentyPlusReceptions;
    }

    public double getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(double fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public double getFgAttempts() {
        return fgAttempts;
    }

    public void setFgAttempts(double fgAttempts) {
        this.fgAttempts = fgAttempts;
    }

    public double getFgPercent() {
        return fgPercent;
    }

    public void setFgPercent(double fgPercent) {
        this.fgPercent = fgPercent;
    }

    public double getLongestKickMade() {
        return longestKickMade;
    }

    public void setLongestKickMade(double longestKickMade) {
        this.longestKickMade = longestKickMade;
    }

    public double getUnder20Kicks() {
        return under20Kicks;
    }

    public void setUnder20Kicks(double under20Kicks) {
        this.under20Kicks = under20Kicks;
    }

    public double getUnder30Kicks() {
        return under30Kicks;
    }

    public void setUnder30Kicks(double under30Kicks) {
        this.under30Kicks = under30Kicks;
    }

    public double getUnder40Kicks() {
        return under40Kicks;
    }

    public void setUnder40Kicks(double under40Kicks) {
        this.under40Kicks = under40Kicks;
    }

    public double getUnder50Kicks() {
        return under50Kicks;
    }

    public void setUnder50Kicks(double under50Kicks) {
        this.under50Kicks = under50Kicks;
    }

    public double getOver50Kicks() {
        return over50Kicks;
    }

    public void setOver50Kicks(double over50Kicks) {
        this.over50Kicks = over50Kicks;
    }

    public double getExtraPointsMade() {
        return extraPointsMade;
    }

    public void setExtraPointsMade(double extraPointsMade) {
        this.extraPointsMade = extraPointsMade;
    }

    public double getPatAttempts() {
        return patAttempts;
    }

    public void setPatAttempts(double patAttempts) {
        this.patAttempts = patAttempts;
    }

    public double getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public double getTotalFantasyPoints() {
        return totalFantasyPoints;
    }

    public void setTotalFantasyPoints(double totalFantasyPoints) {
        this.totalFantasyPoints = totalFantasyPoints;
    }

    public double getTotalPassingPointsFantasy() {
        return totalPassingPointsFantasy;
    }

    public void setTotalPassingPointsFantasy(double totalPassingPointsFantasy) {
        this.totalPassingPointsFantasy = totalPassingPointsFantasy;
    }

    public double getRushingYardPointsFantasy() {
        return rushingYardPointsFantasy;
    }

    public void setRushingYardPointsFantasy(double rushingYardPointsFantasy) {
        this.rushingYardPointsFantasy = rushingYardPointsFantasy;
    }

    public double getTotalReceivingPointsFantasy() {
        return totalReceivingPointsFantasy;
    }

    public void setTotalReceivingPointsFantasy(double totalReceivingPointsFantasy) {
        this.totalReceivingPointsFantasy = totalReceivingPointsFantasy;
    }

    public double getReceptionPointsFantasy() {
        return receptionPointsFantasy;
    }

    public void setReceptionPointsFantasy(double receptionPointsFantasy) {
        this.receptionPointsFantasy = receptionPointsFantasy;
    }

    public double getReceivingYardsPointsFantasy() {
        return receivingYardsPointsFantasy;
    }

    public void setReceivingYardsPointsFantasy(double receivingYardsPointsFantasy) {
        this.receivingYardsPointsFantasy = receivingYardsPointsFantasy;
    }

    public double getPassingYardPointsFantasy() {
        return passingYardPointsFantasy;
    }

    public void setPassingYardPointsFantasy(double passingYardPointsFantasy) {
        this.passingYardPointsFantasy = passingYardPointsFantasy;
    }

    public double getPassingTouchdownPointsFantasy() {
        return passingTouchdownPointsFantasy;
    }

    public void setPassingTouchdownPointsFantasy(double passingTouchdownPointsFantasy) {
        this.passingTouchdownPointsFantasy = passingTouchdownPointsFantasy;
    }

    public double getFantasyPointsPerGame() {
        return fantasyPointsPerGame;
    }

    public void setFantasyPointsPerGame(double fantasyPointsPerGame) {
        this.fantasyPointsPerGame = fantasyPointsPerGame;
    }

    public double getPointsLostFromFumblesFantasy() {
        return pointsLostFromFumblesFantasy;
    }

    public double getRushTDPointFantasy() {
        return rushTDPointFantasy;
    }

    public void setRushTDPointFantasy(double rushTDPointFantasy) {
        this.rushTDPointFantasy = rushTDPointFantasy;
    }

    public void setPointsLostFromFumblesFantasy(double pointsLostFromFumblesFantasy) {
        this.pointsLostFromFumblesFantasy = pointsLostFromFumblesFantasy;
    }

    public double getPointsLostFromINTSFantasy() {
        return pointsLostFromINTSFantasy;
    }

    public void setPointsLostFromINTSFantasy(double pointsLostFromINTSFantasy) {
        this.pointsLostFromINTSFantasy = pointsLostFromINTSFantasy;
    }

    public double getTotalTurnoverPointsLostFantasy() {
        return totalTurnoverPointsLostFantasy;
    }

    public void setTotalTurnoverPointsLostFantasy(double totalTurnoverPointsLostFantasy) {
        this.totalTurnoverPointsLostFantasy = totalTurnoverPointsLostFantasy;
    }

    public double getTdIntRatio() {
        return tdIntRatio;
    }

    public void setTdIntRatio(double tdIntRatio) {
        this.tdIntRatio = tdIntRatio;
    }

    public double getFumblesLost() {
        return fumblesLost;
    }

    public void setFumblesLost(double fumblesLost) {
        this.fumblesLost = fumblesLost;
    }

    public double getReceivingTDFantasyPoints() {
        return receivingTDFantasyPoints;
    }

    public void setReceivingTDFantasyPoints(double receivingTDFantasyPoints) {
        this.receivingTDFantasyPoints = receivingTDFantasyPoints;
    }

    public double getShortFGFantasyPoints() {
        return shortFGFantasyPoints;
    }

    public void setShortFGFantasyPoints(double shortFGFantasyPoints) {
        this.shortFGFantasyPoints = shortFGFantasyPoints;
    }

    public double getFantasy40yardFgPoints() {
        return fantasy40yardFgPoints;
    }

    public void setFantasy40yardFgPoints(double fantasy40yardFgPoints) {
        this.fantasy40yardFgPoints = fantasy40yardFgPoints;
    }

    public double getFantasy50yardFgPoints() {
        return fantasy50yardFgPoints;
    }

    public void setFantasy50yardFgPoints(double fantasy50yardFgPoints) {
        this.fantasy50yardFgPoints = fantasy50yardFgPoints;
    }

    public double getExtraPointFantasy() {
        return extraPointFantasy;
    }

    public void setExtraPointFantasy(double extraPointFantasy) {
        this.extraPointFantasy = extraPointFantasy;
    }

    public double getMissedFgFantasyPoints() {
        return missedFgFantasyPoints;
    }

    public void setMissedFgFantasyPoints(double missedFgFantasyPoints) {
        this.missedFgFantasyPoints = missedFgFantasyPoints;
    }

    public void printQBAttributes() {

        System.out.println(getName());
        System.out.print("Position: " + getPosition() + " ");
        System.out.print("Completions: " + getCompletions() + " ");
        System.out.print("Pass Attempts: " + getPassAttempts() + " ");
        System.out.print("Completions Percent: " + getCompletionPercent() + " ");
        System.out.print("Passing Yards: " + getPassingYards() + " ");
        System.out.print("Passing Yards per Attempt: " + getPassYardsPerAttempt() + " ");
        System.out.print("Touchdown Passes: " + getTouchdownPasses() + " ");
        System.out.print("Interceptions: " + getInterceptions() + " ");
        System.out.print("Sacks: " + getSacks() + " ");
        System.out.print("Rushing Attempts: " + getRushAttempts() + " ");
        System.out.print("Rushing Yards: " + getRushYards() + " ");
        System.out.println("Rushing Touchdowns: " + getRushingTouchdowns() + " ");


    }

    public void printRunningBackAttributes() {

        System.out.println("Running Back Attributes:");
        System.out.println(getName());
        System.out.print("Position: " + getPosition() + " ");
        System.out.print("Rushing Attempts: " + getRushAttempts() + " ");
        System.out.print("Rushing Yards: " + getRushYards() + " ");
        System.out.print("Rushing Yards Per Attempts: " + getRushYardsPerAttempt() + " ");
        System.out.print("Longest Run: " + getLongestRush() + " ");
        System.out.print("Number of 20+ Yard Runs: " + getTwentyPlusRushes() + " ");
        System.out.print("Rushing Touchdowns: " + getRushingTouchdowns() + " ");
        System.out.print("Receptions: " + getReceptions() + " ");
        System.out.print("Receiving Targets: " + getTargets() + " ");
        System.out.print("Receiving Yards: " + getRecYards() + " ");
        System.out.print("Yards Per Reception: " + getRecYardsPerCatch() + " ");
        System.out.println("Receiving Touchdowns: " + getRecTouchdowns() + " ");

    }

    public void printReceiverAttributes(){


        System.out.println(getName());
        System.out.print("Position: " + getPosition() + " ");
        System.out.print("Receptions: " + getReceptions() + " ");
        System.out.print("Receiving Targets: " + getTargets() + " ");
        System.out.print("Receiving Yards: " + getRecYards() + " ");
        System.out.print("Yards Per Reception: " + getRecYardsPerCatch() + " ");
        System.out.print("Longest Reception: " + getLongestReception() + " ");
        System.out.print("Number of 20+ Yard Catches: " + getTwentyPlusReceptions() + " ");
        System.out.print("Receiving Touchdowns: " + getRecTouchdowns() + " ");
        System.out.print("Rushing Attempts: " + getRushAttempts() + " ");
        System.out.print("Rushing Yards: " + getRushYards() + " ");
        System.out.println("Rushing Touchdowns: " + getRushingTouchdowns() + " ");

    }

    public void printKickerAttributes(){

        System.out.println(getName());
        System.out.print("Field Goals Made: "+ getFieldGoalsMade()+" ");
        System.out.print("Field Goal Attempts: "+ getFgAttempts()+" ");
        System.out.print("Field Goal Percent: "+ getFgPercent()+" ");
        System.out.print("Longest Kick: " + getLongestKickMade()+" ");
        System.out.print("Kicks Made Under 20 Yards: "+ getUnder20Kicks()+" ");
        System.out.print("Kicks Made Under 30 Yards: "+ getUnder30Kicks()+" ");
        System.out.print("Kicks Made Under 40 Yards: "+ getUnder40Kicks()+" ");
        System.out.print("Kicks Made Under 50 Yards: "+ getUnder50Kicks()+" ");
        System.out.print("Kicks Made Over 50 Yards: "+ getOver50Kicks()+" ");
        System.out.print("Extra Point Attempts "+ getPatAttempts()+" ") ;
        System.out.println("Extra Points Made "+ getExtraPointsMade()+" ");

    }




}
