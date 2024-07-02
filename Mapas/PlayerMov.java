package Mapas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JFrame;

import Characters.Players.Player;

public class PlayerMov extends JPanel implements ActionListener{

    private int x, y;
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private Player player;

    public PlayerMov(Player player) {
        this.player = player;
        x = player.getX();
        y = player.getY();
    }

    public PlayerMov(Player player, int x, int y) {
        this.player = player;
        setX(x);
        setY(y);
        player.setX(x);
        player.setY(y);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.walk(getKey());
        setX(player.getX());
        setY(player.getY());
        repaint();
    }

    public char getKey() {
        Scanner scr = new Scanner(System.in);
        String returnString = scr.nextLine();
        scr.close();
        return returnString.charAt(0);
    }
}

