import Characters.*;
import Characters.Enemies.*;
import Characters.Players.Player;
import Menu.*;
import Mapas.Mapa;
import java.awt.EventQueue;
import java.util.Scanner;
import java.awt.Graphics;

public class Main{
	static int battleMenuChoice;
	static int[] playerPos = {0, 0};
	static int[] playerHealthMana = {10, 10};
	static int[] playerStats = {5, 3, 3, 5, 6};
	
	static int[] enemyHealthMana = {10, 10};
	static int[] enemyStats = {5, 3, 3, 5, 6};
	
	public static void main(String[] args) {
		Player player = new Player(playerHealthMana, playerStats);
		player.setPosition(55, 55);
		Enemies enemy = new Enemies(enemyHealthMana, enemyStats);
		Mapa mapa = new Mapa(player);
		
	}

}






