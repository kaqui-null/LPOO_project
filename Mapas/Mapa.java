package Mapas;


import javax.swing.JFrame;
import Characters.Players.Player;
import java.awt.Color;
import java.awt.Graphics;

public class Mapa extends JFrame {
	Player player;
	PlayerMov mov;

	public Mapa(Player player) {
		this.player = player;
		mov = new PlayerMov(player, 55, 55);
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(mov);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.setColor(Color.red); //can't walk
		g.fillRect(0, 0, 700, 500);
		g.setColor(Color.green); // can walk
		g.fillRect(50, 50, 600, 400);
	}
}
