package Characters.Players;

import Characters.NPC;

public class Player extends NPC {
	
	private char terminalSprite = '@';
	private int xp = 0;
	
	private static int posX = 0;
	private static int posY = 0;
	private static int[] position = {posX, posY};
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
    		setX(posX - 1);
			setPosition(getX(), getY()); //needed to update pos array
    		break;
    	case 's':
    		setX(posX + 1);
			setPosition(getX(), getY());
    		break;
    	case 'a':
    		setY(posY - 1);
			setPosition(getX(), getY());
    		break;
    	case 'd':
    		setY(posY + 1);
			setPosition(getX(), getY());
    		break;
    	default:
    		break;
    	}
    }
	public void getXp(int battleXp) {
		xp += battleXp;
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
    // getters setters
    // position = {x,y}
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
    public void setX(int x) {
    	posX = x;
    }
    public void setY(int y) {
    	posY = y;
    }
    public int getX(){
        return posX;
    }
    public int getY(){
        return posY;
    }
	public char getTerminalSprite() {
		return terminalSprite;
	}
	public int getXP() {
		return xp;
	}
}
