package Characters.Enemies;

import java.util.Map;
import java.util.HashMap;

public class Boss extends Enemies {
	private Map<String, Integer> ataque;
	
    public Boss(int[] newHealthMana, int[] newStats, double chanceSpawn, Map<String, Double> fraqueza, Map<String, Integer> drops, int xpDrop) {
        super(newHealthMana, newStats, chanceSpawn, fraqueza, drops, xpDrop);
        this.ataque = new HashMap<>();
    }   
    public Boss(int[] newHealthMana, int[] newStats) {
        super(newHealthMana, newStats);
        this.ataque = new HashMap<>();
    }
    
    public void addAtaque(String nomeAtaque, int damage) {
    	ataque.put(nomeAtaque, damage);
    }
    
    public int getAtaque(String nomeAtaque) {
    	return ataque.getOrDefault(nomeAtaque, 0);
    }   
    @Override
    public void roaming() {
    	
    }
    
    @Override
    public int attack (int defense) {
    	int damage = getStrenght() - defense;
    	return damage > 0 ? damage : 0;
    }
    
    public int performAtaque(String nomeAtaque, int defense) {
    	int damage = getAtaque(nomeAtaque) - defense;
    	return damage > 0 ? damage : 0;
    }
    
}
