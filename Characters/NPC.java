package Characters;


/**
 * postion = [x, y]; a z paramater can be added later if we want depth
 * healthMana = [health, mana]
 * Stats = [strenght, inteligence, defense, luck]
 */
public class NPC {
    private int[] position;
    private int[] healthMana; 
    private int[] Stats;
    private boolean isInteractable = true;
    
    public NPC(int[] newPosition, int[] newHealthMana, int[] newStats){
        this.position = newPosition;
        this.healthMana = newHealthMana;
        this.Stats = newStats;
    }

    public void roaming() {}

    // Switch para cada diálogo
    public String interact() {
        return "return string";
    }

    public void getsHurt(int damage) {
        healthMana[0] -= damage;
    }

    // getters setters
    // position = {x,y}
    public int[] getPosition() {
        return position;
    }
    public int getX(){
        return position[0];
    }
    public int getY(){
        return position[1];
    }

    // heathMana = {health, mana}
    public int[] getHealthMana() {
        return healthMana;
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

    public boolean getInteractableStatus(){
        return isInteractable;
    }
}
