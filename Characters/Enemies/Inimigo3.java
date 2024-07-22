package Characters.Enemies;

import java.util.HashMap;
import java.util.Map;

public class Inimigo3 extends Enemies {
	private static int[] health_mana = {30, 40};
	private static int[] stats = {6, 12, 6, 12, 8};
	private static double chance_spawn = 0.3;
	private static Map<String, Double> fraqueza = new HashMap<>();
	private static Map<String, Integer> drops = new HashMap<>();
	private static int xp_drop = 80;

	static {
		fraqueza.put("Ataque Espiritual", 1.5);
		fraqueza.put("Raios", 2.0);
		fraqueza.put("Batida Rápida", 1.5);
		
		drops.put("Poção de Cura", 1);
	}
    
	public Inimigo3() {
		super(health_mana, stats, chance_spawn, fraqueza, drops, xp_drop);
	}
	
    @Override
    public void roaming() {
    	
    }
}
