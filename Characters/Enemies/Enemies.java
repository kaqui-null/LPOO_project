package Characters.Enemies;

import Characters.NPC;
import java.util.Map;
import java.util.HashMap;

public class Enemies extends NPC{
	private double chanceSpawn;
	private Map<String, Double> fraqueza;
	private Map<String, Integer> drops;
	private int xpDrop;
    
    public Enemies(int[] newHealthMana, int[] newStats, double chanceSpawn, Map<String, Double> fraqueza, Map<String, Integer> drops, int xpDrop){
        super(newHealthMana, newStats);
        this.chanceSpawn = chanceSpawn;
        this.fraqueza = fraqueza;
        this.drops = drops;
        this.xpDrop = xpDrop;
    }
    
    public Enemies(int[] newHealthMana, int[] newStats) {
        super(newHealthMana, newStats);
        this.chanceSpawn = 0.0;
        this.fraqueza = new HashMap<>();
        this.drops = new HashMap<>();
        this.xpDrop = 0;
    }
    
    public double getChanceSpawn() {
    	return chanceSpawn;
    }
    
    public void setChanceSpawn(double chanceSpawn) {
        this.chanceSpawn = chanceSpawn;
    }
    
    public Map<String, Double> getFraqueza() {
    	return fraqueza;
    }

    public void setFraqueza(Map<String, Double> fraqueza) {
        this.fraqueza = fraqueza;
    }
    
    public Map<String, Integer> getDrops(){
    	return drops;
    }
    

    public void setDrops(Map<String, Integer> drops) {
        this.drops = drops;
    }

    public int getXpDrop() {
        return xpDrop;
    }

    public void setXpDrop(int xpDrop) {
        this.xpDrop = xpDrop;
    }
    
    public void addFraqueza(String element, double multiplier) {
    	fraqueza.put(element, multiplier);
    }
    
    public void addDrop(String item, int quantity) {
    	drops.put(item, quantity);
    }
    
    @Override
    public void roaming() {
    	
    }
    
    @Override
    public int attack (int defense) {
    	int damage = getStrenght() - defense;
    	return damage > 0 ? damage : 0;
    }
}
