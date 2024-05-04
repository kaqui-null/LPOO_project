package Characters;

public class Player extends NPC {
    public Player(int[] positon, int[] healthMana, int[] Stats) {
        super(positon, healthMana, Stats);
    }

    public void walk() {
    }

    public int attack(){
        return Stats[1]; // the dmg formula and mana usage
    }

    public void manaRegen() {

    }

    public void healthRegen() {

    }

    public void interact() {
        
    }
}
