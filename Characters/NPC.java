package Characters;


/**
 * postion = [x, y]; a z paramater can be added later if we want depth
 * healthMana = [health, mana]
 * Stats = [strenght, inteligence, defense, luck]
 */
public class NPC {
    int[] position;
    int[] healthMana; 
    int[] Stats;
    
    public NPC(int[] newPosition, int[] newHealthMana, int[] newStats){
        this.position = newPosition;
        this.healthMana = newHealthMana;
        this.Stats = newStats;
    }

    public void roaming() {}

    public void getsHurt(int damage) {
        healthMana[0] -= damage;
    }

}