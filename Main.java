import Characters.*;
import Characters.Enemies.*;
import Characters.Players.Mage;
import Characters.Players.Knight;
import Characters.Players.Paladin;
import Characters.Players.Player;
import Menu.*;
import Mapas.Mapa;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import gui.MapaGUI;

public class Main{
	static int battleMenuChoice;
	static int[] playerPos = {0, 0};
	static int[] playerHealthMana = {10, 10};
	static int[] playerStats = {5, 3, 3, 5, 6};
	
	static int[] enemyHealthMana = {10, 10};
	static int[] enemyStats = {5, 3, 3, 5, 6};
	
	public static void main(String[] args) {
		Player player = new Mage(playerHealthMana, playerStats);
		Enemies enemy = new Inimigo1();
		BattleMenu battleMenu = new BattleMenu(enemy, null);
		Mapa mapa = new Mapa(player);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("My Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);

                MapaGUI mapaGUI = new MapaGUI(player);
                frame.add(mapaGUI);
                frame.pack();

                frame.setVisible(true);
            }
        });
	}
}
