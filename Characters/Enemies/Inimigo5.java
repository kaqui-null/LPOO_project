package Characters.Enemies;

import java.util.HashMap;
import java.util.Map;
import java.awt.Graphics;
import java.awt.Color;

public class Inimigo5 extends Enemies {
	private static int[] health_mana = {50, 10};
	private static int[] stats = {12, 3, 10, 4, 6};
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

    private int posX;
    private int posY;
    
	public Inimigo5() {
		super(health_mana, stats, chance_spawn, fraqueza, drops, xp_drop, 300, 300);
        this.posX = 300;
        this.posY = 300;
	}
	
    @Override
    public void roaming() {
    	
    }
    
    public void draw(Graphics g) {
    	g.setColor(Color.BLUE);
    	g.fillRect(300, 300, 50, 50);
    }
}