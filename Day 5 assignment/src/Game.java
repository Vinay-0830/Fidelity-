public class Game {
    public String name;
    public int MaxNumPlayers;;
    public Game(String name, int MaxNumPlayers) {
        this.name = name;
        this.MaxNumPlayers = MaxNumPlayers;
    }
    public String getName() {
        return name;
    }
    public int getMaxNumPlayers() {
        return MaxNumPlayers;
    }
    @Override
    public String toString() {
        return "Maximum number of player for" + getName() +" is " + getMaxNumPlayers();
    }
}
class GamewithTimeLimit extends Game {
    public int TimeLimit;
    public GamewithTimeLimit(String name, int MaxNumPlayers, int TimeLimit) {
        super(name, MaxNumPlayers);
        this.TimeLimit = TimeLimit;
    }
    @Override
    public String toString() {
        return "Maximum number of player for" + getName() +" is " + getMaxNumPlayers() + "\n" +"Time Limit for" + getName() +" is " + TimeLimit + "minutes";
    }
}

