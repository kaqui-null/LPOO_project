package gui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Characters.Players.Player;
import Characters.Enemies.Inimigo1;
import Characters.Enemies.Enemies;
import java.util.ArrayList;
import java.util.List;

public class MapaGUI extends JPanel {
	private Player player;
	private List<Enemies> enemies;
	private boolean inBattle;
	private int cameraX = 0;
	private int cameraY = 0;
	
	public MapaGUI(Player player) {
        this.setPreferredSize(new java.awt.Dimension(800, 600));
        this.setFocusable(true);
        this.requestFocusInWindow();

        this.player = player;
        this.enemies = new ArrayList<>();
        this.enemies.add(new Inimigo1());
        this.inBattle = false;

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                player.walk(key);
                updateCameraPosition(); 
                repaint();

                if (checkCollisionWithEnemy()) {
                    startBattle();
                }
            }
        });
    }
	
	private void updateCameraPosition() {
        int playerX = player.getX();
        int playerY = player.getY();

        cameraX = playerX - getWidth() / 2;
        cameraY = playerY - getHeight() / 2;

	    cameraX = Math.max(cameraX, 0);
	    cameraY = Math.max(cameraY, 0);
	    cameraX = Math.min(cameraX, 800 - getWidth());
	    cameraY = Math.min(cameraY, 600 - getHeight());
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.translate(-cameraX, -cameraY);
        
        player.draw(g);

        if (!inBattle) {
            for (Enemies enemy : enemies) {
                if (enemy instanceof Inimigo1) {
                    ((Inimigo1) enemy).draw(g);
                }
            }
        }
        g.translate(cameraX, cameraY);
    }

    private boolean checkCollisionWithEnemy() {
        for (Enemies enemy : enemies) {
            if (player.collidesWith(enemy)) {
                return true;
            }
        }
        return false;
    }
    
    private void startBattle() {
        inBattle = true;
        System.out.println("Batalha iniciada!");
    }
}