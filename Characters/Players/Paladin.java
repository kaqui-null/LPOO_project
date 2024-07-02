package Characters.Players;

public class Paladin extends Player {
    
    public Paladin(int[] healthMana, int[] Stats) {
        super(new int[] {100, 80}, new int[] {0,0,0});
    }
    
    @Override
    protected void addAbility(String ability) {
    	switch (getCurrLevel()) {
    	case 1:
    		newAbility("Golpe Místico");
    		break;
    		
    	case 2:
    		newAbility("Cura");
    		break;
    		
    	case 3:
    		newAbility("Concentração de Energia");
    		break;
    		
    	case 4:
    		newAbility("Ataque Espiritual");
    		break;
    		
    	case 5:
    		newAbility("Benção Divina");
    		break;
    	}
}
}