package Characters.Players;

import java.awt.Graphics;
import java.awt.Color;

import Characters.Enemies.Enemies;
import Characters.NPC;
import Characters.Itens.Itens;

public class Player extends NPC {
	
	private int xp = 0;
	private Itens[] inventoryList;
	
	private static int posX = 0;
	private static int posY = 0;
	private static int[] position = {posX, posY};
	private String[] abilities = new String [0];
	
    public Player(int[] healthMana, int[] Stats) {
        super(healthMana, Stats);
    }
    
    public int defend(int damageRecieved) {
    	if (damageRecieved - getDefense() < 0) {
    		return 0;
    	}
    	return damageRecieved - getDefense();
    }
    
    public void walk(char key) {
    	//TODO: make collision for edges
    	switch (key) {
    	case 'w':
    		setY(posY - 50);
			setPosition(getX(), getY());
    		break;
    	case 's':
    		setY(posY + 50);
			setPosition(getX(), getY());
    		break;
    	case 'a':
    		setX(posX - 50);
			setPosition(getX(), getY());
    		break;
    	case 'd':
    		setX(posX + 50);
			setPosition(getX(), getY());
    		break;
    	default:
    		break;
    	}
    }
    
    public void attack(Enemies enemy) {
    	enemy.takeDamage(10);
    }

    public boolean collidesWith(Enemies enemy) {
        return (this.posX < enemy.getX() + 50 &&
                this.posX + 50 > enemy.getX() &&
                this.posY < enemy.getY() + 50 &&
                this.posY + 50 > enemy.getY());
    }

    public int getX() { return posX; }
    public int getY() { return posY; }
    public void setX(int x) { this.posX = x; }
    public void setY(int y) { this.posY = y; }
    
	public void getXp(int battleXp) {
		xp += battleXp;
		addLevelUp();
	}
	
	public int getCurrLevel() {
		if (xp >= 10000) {
			return 5;
		} else if (xp >= 5000) {
			return 4;
		} else if (xp >= 3000) {
			return 3;
		} else if (xp >= 1500) {
			return 2;
		} else if (xp >= 500) {
			return 1;
		} else {
			return 0;
		}
	}

    public char getTerminalSprite() {
        return '@';
    }

	private void addLevelUp() {
		int playerLevel = getCurrLevel ();
		addAbility(String.valueOf(playerLevel));
	}
	
	protected void addAbility(String ability) {
		String[] newArray = new String[abilities.length + 1];
		System.arraycopy(abilities, 0, newArray, 0, abilities.length);
		newArray[abilities.length] = ability;
		abilities = newArray;
	}
	
    public void setPosition(int[] newPosition) {
    	position = newPosition;
    }
    public void setPosition(int x, int y) {
    	posX = x;
    	posY = y;
		position[0] = posX;
		position[1] = posY;
    }
    public int[] getPosition() {
        return position;
    }
	public int getXP() {
		return xp;
	}
	
	public Itens[] getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(Itens[] inventoryList) {
		this.inventoryList = inventoryList;
	}
	public void addToInventory(Itens item) {
		int oldArraySize = this.inventoryList.length;
		Itens[] newArray = new Itens[oldArraySize + 1];
		for (int i = 0; i < oldArraySize; i++){
			newArray[i] = this.inventoryList[i];
		}
		newArray[oldArraySize + 1] = item;
		this.inventoryList = newArray;
	}
	
    public String[] getAbilities() {
        return abilities;
    }
    
    protected void newAbility (String ability) {
    	int oldArraySize = this.abilities.length;
    	String[] newArray = new String[oldArraySize + 1];
    	for (int i = 0; i < oldArraySize; i++) {
    		newArray[i] = this.abilities[i];
    	}
    	newArray[oldArraySize] = ability;
    	this.abilities = newArray;
    }
    
    public void draw (Graphics g) {
    	g.setColor(Color.RED);
    	g.fillRect(posX,posY, 50, 50);
    }
}