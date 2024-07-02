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

public class Main{
	static int battleMenuChoice;
	static int[] playerPos = {0, 0};
	static int[] playerHealthMana = {10, 10};
	static int[] playerStats = {5, 3, 3, 5, 6};
	
	static int[] enemyHealthMana = {10, 10};
	static int[] enemyStats = {5, 3, 3, 5, 6};
	
	public static void main(String[] args) {
		Player player = new Mage(playerHealthMana, playerStats);
		Enemies enemy = new Enemies(enemyHealthMana, enemyStats);
		BattleMenu battleMenu = new BattleMenu(enemy, null);
		
		while (true) {
			System.out.println(battleMenu.getCurrChoice());
		}
	}
/*
	public static void mapa(Mapa mapa, Player player) { 
		Scanner scr = new Scanner(System.in);
		
		mapa.draw();
		mapa.setNewMap(mapa.replacePlayerSprite(player.getPosition(), player.getTerminalSprite()));
		while (true) {
			char key = scr.next().charAt(0);
			player.walk(key);
			mapa.setNewMap(mapa.replacePlayerSprite(player.getPosition(), player.getTerminalSprite()));
			
			mapa.draw();
			
			if (key == 'x') {
				break;
			}
		}
		scr.close();
	}
*/
	// get new enemy through rng table of the place
	public static void battle(Player player, Enemies enemy) {
		Scanner scanner = new Scanner(System.in);
		
		while (player.isAlive()) {
			System.out.println("Enemy: " + String.valueOf(enemy.getHealth()) + " / " + String.valueOf(enemyHealthMana[0]));
			System.out.println("Player: " + String.valueOf(player.getHealth()) + " / " + String.valueOf(playerHealthMana[0]));
			System.out.println("O que vc quer fazer?\n");
			System.out.println("Atacar[1]\nDefender[2]");
			battleMenuChoice = scanner.nextInt();
			
			if (player.getAgility() >= enemy.getAgility() && battleMenuChoice == 1) {
				enemy.setHealth(enemy.getsHurt(enemy.getHealth() , player.attack(enemy.getDefense())));
				System.out.println("The enemy attacks you");
				player.setHealth(player.getsHurt(player.getHealth() , enemy.attack(player.getDefense())));
			} else if (battleMenuChoice == 2) {
				player.setHealth(player.getsHurt(player.getHealth() , player.defend(enemy.attack(player.getDefense()))));
			} else {
				player.setHealth(player.getsHurt(player.getHealth() , enemy.attack(player.getDefense())));
				enemy.setHealth(enemy.getsHurt(player.getHealth() , player.attack(enemy.getDefense())));
			}
			
			if (enemy.getHealth() <= 0) {
				System.out.println("You win");
				break;
			} else if (player.getHealth() <= 0) {
				System.out.println("You lose");
				break;
			}
		}
		
		scanner.close();
	}

}






