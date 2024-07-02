package Characters;

import Actions.Dialog;

/**
 * postion = [x, y]; a z paramater can be added later if we want depth
 * healthMana = [health, mana]
 * Stats = [strenght, inteligence, defense, luck, agility]
 */
public class NPC {
    private int[] healthMana = new int[2]; 
    private int[] Stats = new int[5];
    private boolean isInteractable = true;
    private boolean isAlive = true;
    private Dialog dialog = new Dialog();

    public NPC(int[] newHealthMana, int[] newStats){
        this.healthMana = newHealthMana;
        this.Stats = newStats;
    }

    public void roaming() {}

    // Switch para cada diálogo
    public String interact() {
        return "return string";
    }
    
    public int attack(int defense) {
        return getStrenght() - defense;
    }

    public int getsHurt(int health, int damage) {
    	if (health - damage >= 0) {
    		return health - damage;
    	}
        return 0;
    }

    

    // heathMana = {health, mana}
    public int[] getHealthMana() {
        return healthMana;
    }
    public void setHealth(int newHealth) {
    	healthMana[0] = newHealth;
    }
    public int getHealth() {
        return healthMana[0];
    }
    public int getMana() {
        return healthMana[1];
    }

    // Stats = [strenght, inteligence, defense, luck]
    public int[] getStats(){
        return Stats;
    }
    public int getStrenght(){
        return Stats[0];
    }
    public int getInteligence() {
        return Stats[1];
    } 
    public int getDefense(){
        return Stats[2];
    }
    public int getLuck() {
        return Stats[3];
    }
    public int getAgility() {
    	return Stats[4];
    }

    public boolean getInteractableStatus(){
        return isInteractable;
    }
    
    public boolean isAlive() {
    	return isAlive;
    }
}
