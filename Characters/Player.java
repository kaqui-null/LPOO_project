package Characters;

public class Player extends NPC {
	
	private int[] position;
    public Player(int[] healthMana, int[] Stats) {
        super(healthMana, Stats);
    }
    
    public int defend(int damageRecieved) {
    	if (damageRecieved - getDefense() < 0) {
    		return 0;
    	}
    	return damageRecieved - getDefense();
    }
    
    // getters setters
    // position = {x,y}
    public void setPosition(int[] newPosition) {
    	position = newPosition;
    }
    public void setPosition(int x, int y) {
    	position[0] = x;
    	position[1] = y;
    }
    public int[] getPosition() {
        return position;
    }
    public void setX(int x) {
    	position[0] = x;
    }
    public void setY(int y) {
    	position[0] = y;
    }
    public int getX(){
        return position[0];
    }
    public int getY(){
        return position[1];
    }
}
