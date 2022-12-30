public class Player {

    String name;
    int number;
    String position; // QB, WR, TE, RB --> abbreviations only
    int passingYards;
    int passingTouchdowns;
    int rushingYards;
    int rushingTouchdowns;
    int recYards;
    int receptions;
    int totalPoints;
    int passingPoints;
    int rushingPoints;
    int pointsPerGame;
    int passAttempts;
    int interceptions;


    String team;

    public Player(){

    }
    public Player(String name){
        this.name=name;
    }
    public Player(String name, String number, String position){

    }

    public void setTeam(String team){
        this.team= team;
    }
    public String getTeam(){
        return this.team;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public int getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    public int getPassingTouchdowns() {
        return passingTouchdowns;
    }

    public void setPassingTouchdowns(int passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public void setRushingTouchdowns(int rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns;
    }

    public int getRecYards() {
        return recYards;
    }

    public void setRecYards(int recYards) {
        this.recYards = recYards;
    }
    public int getReceptions() {
        return receptions;
    }
    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getPassingPoints() {
        return passingPoints;
    }

    public void setPassingPoints(int passingPoints) {
        this.passingPoints = passingPoints;
    }

    public int getRushingPoints() {
        return rushingPoints;
    }

    public void setRushingPoints(int rushingPoints) {
        this.rushingPoints = rushingPoints;
    }

    public int getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(int pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public int getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(int passAttempts) {
        this.passAttempts = passAttempts;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }
}
