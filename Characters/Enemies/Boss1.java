package Characters.Enemies;

import java.util.HashMap;
import java.util.Map;

public class Boss1 extends Boss {
	private static int[] health_mana = {500, 120};
	private static int[] stats = {18, 15, 18, 10, 12};
	private static double chance_spawn = 0.1;
	private static Map<String, Double> fraqueza = new HashMap<>();
	private static Map<String, Integer> drops = new HashMap<>();
	private static int xp_drop = 1000;
	
	static {
		fraqueza.put("Ataque Espiritual", 1.5);
		fraqueza.put("Raios", 2.0);
		fraqueza.put("Batida Rápida", 1.5);
		
		drops.put("Arma Especial", 1);
		drops.put("Poção de Cura", 3);
	}
	
	public Boss1() {
		super(health_mana, stats, chance_spawn, fraqueza, drops, xp_drop);
		
		addAtaque("Ataque das Sombras", 15);
		addAtaque("Explosão de Fogo", 30);
	}
    
    @Override
    public void roaming() {
    	
    }
    
    @Override
    public int attack (int defense) {
    	int danoBase = super.attack(defense);
    	return danoBase + 10;
    }
    
    public int performAtaque(String nomeAtaque, int defense) {
    	int damage = getAtaque(nomeAtaque);
    	return damage - defense > 0 ? damage - defense : 0;
    }
  
}
