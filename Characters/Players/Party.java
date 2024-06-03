package Characters.Players;

//TODO: 3 players
public class Party {
    
    Player tank;
    Player magic;
    Player other;
    public Party(Player tank, Player magic, Player other) {
        this.tank = tank;
        this.magic = magic;
        this.other = other;
    }
}
