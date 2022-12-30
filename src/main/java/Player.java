public class Player {

    String name;

    String position; // QB, WR, TE, RB --> abbreviations only

    double completions;
    double attempts;
    double completionPercent;
    double passingYards;
    double passYardsPerAttempt;
    double touchdownPasses;
    double interceptions;
    double sacks;
    double rushAttempts;
    double rushYards;
    double rushingTouchdowns;

    public Player(){

    }
    public Player(String name){
        this.name=name;
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

    public double getAttempts() {
        return attempts;
    }

    public void setAttempts(double attempts) {
        this.attempts = attempts;
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

    public double getdoubleerceptions() {
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


}
