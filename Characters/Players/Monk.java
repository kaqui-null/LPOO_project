package Characters.Players;

public class Monk extends Player{

    public Monk(int[] healthMana, int[] Stats) {
        super(new int[] {0, 0}, new int[] {0,0,0});
    }
    
    @Override
    protected void addAbility(String ability) {
    	switch (getCurrLevel()) {
    	case 1:
    		newAbility("");
    		break;
    		
    	case 2:
    		newAbility("");
    		break;
    		
    	case 3:
    		newAbility("");
    		break;
    		
    	case 4:
    		newAbility("");
    		break;
    		
    	case 5:
    		newAbility("");
    		break;
    	}
    }
}