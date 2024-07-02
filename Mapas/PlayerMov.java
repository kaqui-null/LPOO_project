package Mapas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

import Characters.Players.Player;

public class PlayerMov extends JPanel implements ActionListener, KeyListener{

    private int x, y;
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private Player player;

    public PlayerMov(Player player) {
        Timer timer = new Timer(30, this);
        timer.start();
        this.player = player;
        x = player.getX();
        y = player.getY();
        addKeyListener(this);
        setFocusable(true);
    }

    public PlayerMov(Player player, int x, int y) {
        Timer timer = new Timer(30, this);
        timer.start();
        this.player = player;
        setX(x);                                    
        setY(y);
        player.setX(x);
        player.setY(y);
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent k) {
        //not used
    }

    @Override
    public void keyTyped(KeyEvent k) {
        //not used
    }

    @Override
    public void keyPressed(KeyEvent k) {
        player.walk(k.getKeyChar());
        setX(player.getX());
        setY(player.getY());
        repaint();
    }
}

