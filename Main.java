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
import java.util.random.*;

public class Main{
	static int battleMenuChoice;
	static int[] playerPos = {0, 0};
	static int[] playerHealthMana = {10, 10};
	static int[] playerStats = {5, 3, 3, 5, 6};
	
	static int[] enemyHealthMana = {10, 10};
	static int[] enemyStats = {5, 3, 3, 5, 6};
	
	public static void main(String[] args) {
		String[] cells1 = {"########################",
		 "#                      #",
		 "#                      #",
		 "#                      #",
		 "#                      #",
		 "#                      #",
		 "#                      #",
		 "########################"};

		String [] cells2 = {"#############",
							"#           #",
							"#           #",
							"#           #",
							"#           #",
							"#           #",
							"#           #",
							"#           #",
							"#           #"};
		Player player = new Mage(playerHealthMana, playerStats);
		Enemies enemy = new Enemies(enemyHealthMana, enemyStats);
		BattleMenu battleMenu = new BattleMenu(enemy, null);
		Mapa mapa = new Mapa(player);
		drawMapa1(player, cells1);
		
		/*
		if (startBattle()) {
			battleMenu.startBattle();
		} */
	}
	
	private static boolean startBattle() {
		return true;
	}

	private static void drawMapa1(Player player, String[] cells) {
		
		

		char playerSprite = player.getTerminalSprite();
        int column = player.getX();
		int line = player.getY();

        if (column >= 0 && column < cells[line].length()) {
            char[] charArray = cells[line].toCharArray();
            charArray[column] = playerSprite;
            String modifiedString = new String(charArray);
			cells[line] = modifiedString;

			for (String s : cells)
				System.out.println(s);
        }

	}
}






