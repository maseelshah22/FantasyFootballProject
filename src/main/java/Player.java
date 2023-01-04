public class Player {

    String name;

    String position; // QB, WR, TE, RB --> abbreviations only

    double completions;
    double passAttempts;
    double completionPercent;
    double passingYards;
    double passYardsPerAttempt;
    double touchdownPasses;
    double interceptions;
    double sacks;
    double rushAttempts;
    double rushYards;
    double rushingTouchdowns;

    double longestRush;

    double rushYardsPerAttempt;
    double twentyPlusRushes;

    double receptions;
    double targets;
    double recYards;
    double recYardsPerCatch;
    double recTouchdowns;

    double longestReception;
    double twentyPlusReceptions;

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

    public void printWideReceiverAttributes(){

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


}
