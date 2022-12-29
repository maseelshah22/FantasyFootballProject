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

    String team;

    public Player(){

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
}
